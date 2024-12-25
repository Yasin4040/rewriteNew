package com.lizy.rewritenew.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson2.JSON;
import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.Employee;
import com.lizy.rewritenew.entity.LowOriginSimple;
import com.lizy.rewritenew.listener.EmployeeDataListener;
import com.lizy.rewritenew.service.GzEmpFound2Service;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/low")
public class LowExcelController {

    private final GzEmpFound2Service found2Service;

    /**
     * 低版本 没有 学校和职务的 加解密所以 只需要处理 姓名和身份证号
     * @param file 上传的Excel文件
     * @return 操作结果
     */
    @PostMapping("/uploadExcel")
    @Deprecated
    public String uploadExcel(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "文件为空，请选择文件";
        }
        try {
            // 读取Excel文件
            EmployeeDataListener listener = new EmployeeDataListener();
            EasyExcel.read(file.getInputStream(), Employee.class, listener)
                    .sheet().headRowNumber(2).doRead();

            // 获取解析后的数据列表
            List<Employee> employeeList = listener.getEmployeeList();
            log.info("文件读取成功，共解析到{}条数据",employeeList.size());
            // 用于存储重复的Employee对象
            List<Employee> duplicateEmployees = new ArrayList<>();
            Map<String, Long> employeeCountMap = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            Employee::getUniqueKey,
                            Collectors.counting() // 计算每个组的大小
                    ));

            // 找出重复的Employee对象
            employeeCountMap.forEach((key, count) -> {
                if (count > 1) { // 如果某个key出现超过一次，则认为是重复的
                    // 从原始列表中找出所有具有该key的Employee对象
                    List<Employee> duplicates = employeeList.stream()
                            .filter(e -> (e.getUniqueKey()).equals(key))
                            .collect(Collectors.toList());
                    duplicateEmployees.addAll(duplicates); // 将重复的Employee对象添加到列表中
                    System.out.println("Found duplicates for key: " + key + ", Employees: " + duplicates);
                }
            });

            employeeList.removeAll(duplicateEmployees);

            Map<String, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(Employee::getUniqueKey, Function.identity()));
            log.info("转换map的keys数量：{}",employeeMap.keySet().size());
            //获取excel
            List<LowOriginSimple> simples = found2Service.listSimple();
            // 用于存储不在simples列表中的Employee数据
            // 使用集合存储simples中的uniqueKey
            Set<String> simpleUniqueKeys = simples.stream()
                    .map(LowOriginSimple::getUniqueKey)
                    .collect(Collectors.toSet());

            List<Employee> notInSimplesList = employeeList.stream()
                    .filter(employee ->{
                        if (!simpleUniqueKeys.contains(employee.getUniqueKey())) {

                            log.info(employee.getUniqueKey());
                            return true;
                        }
                        return false;
                    } )
                    .collect(Collectors.toList());
            log.info("数据库不存在的人员数据{}",notInSimplesList.size());

            List<LowOriginSimple> updateList = new ArrayList<>();
            List<LowOriginSimple> noInEmployeeList = new ArrayList<>();
            for (LowOriginSimple simple : simples) {
                String uniqueKey = simple.getUniqueKey();
                Employee employee = employeeMap.get(uniqueKey);
                if (employee == null) {
                    log.info("失败的key{}",uniqueKey);
                    noInEmployeeList.add(simple);
                    continue;
                }
                simple.setInentityNo(employee.getIdNumber());
                simple.setEmpName(employee.getName());
                updateList.add(simple);
            }
            this.updateThis(updateList);
            log.info("更新数据，共更新{}条数据",updateList.size());
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "读取文件失败：" + e.getMessage();
        }

    }

    public void updateThis(List<LowOriginSimple> updateList) {
        int batchSize = 500; // 每批次更新的数据量
        for (int i = 0; i < updateList.size(); i += batchSize) {
            List<LowOriginSimple> subList = updateList.subList(i, Math.min(i + batchSize, updateList.size()));
            found2Service.updateBatchForIdName(subList);
        }
    }
}
