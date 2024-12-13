package com.lizy.rewritenew.controller;

import com.alibaba.excel.EasyExcel;

import com.lizy.rewritenew.entity.Employee;
import com.lizy.rewritenew.entity.OriginSimple;
import com.lizy.rewritenew.listener.EmployeeDataListener;
import com.lizy.rewritenew.service.GzRyJbxxService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExcelController {

    private final GzRyJbxxService gzRyJbxxService;

    /**
     * 处理上传的Excel文件并读取数据
     * @param file 上传的Excel文件
     * @return 操作结果
     */
    @PostMapping("/uploadExcel")
    public String uploadExcel(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "文件为空，请选择文件";
        }
        try {
            // 读取Excel文件
            EmployeeDataListener listener = new EmployeeDataListener();
            EasyExcel.read(file.getInputStream(), Employee.class, listener)
//                    .registerConverter(new DateTimeFormat()) // 注册转换器
                    .sheet().headRowNumber(2).doRead();

            // 获取解析后的数据列表
            List<Employee> employeeList = listener.getEmployeeList();
            log.info("文件读取成功，共解析到{}条数据",employeeList.size());
            // 这里可以进行其他操作，例如保存到数据库
            // 用于存储重复的Employee对象
            List<Employee> duplicateEmployees = new ArrayList<>();

            // 使用Stream API来检测和收集重复的Employee对象
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
            List<OriginSimple> simples = gzRyJbxxService.listSimple();
            // 用于存储不在simples列表中的Employee数据

            // 使用集合存储simples中的uniqueKey
            Set<String> simpleUniqueKeys = simples.stream()
                    .map(OriginSimple::getUniqueKey)
                    .collect(Collectors.toSet());

            List<Employee> notInSimplesList = employeeList.stream()
                    .filter(employee -> !simpleUniqueKeys.contains(employee.getUniqueKey()))
                    .collect(Collectors.toList());
            HashMap<String, String> zwNameMap = new HashMap<>();
            List<OriginSimple> updateList = new ArrayList<>();
            List<OriginSimple> noInEmployeeList = new ArrayList<>();
            for (OriginSimple simple : simples) {
                String uniqueKey = simple.getUniqueKey();
                Employee employee = employeeMap.get(uniqueKey);
                if (employee == null) {
                    log.info("失败的key{}",uniqueKey);
                    noInEmployeeList.add(simple);
                    continue;
                }
                simple.setSfzh(employee.getIdNumber());
                simple.setXm(employee.getName());
                zwNameMap.put(simple.getSrzwmc(),employee.getPositionTitle());
                updateList.add(simple);
            }
            List<String> allCryptName = gzRyJbxxService.listAllPositionName();
            //有多少map
            List<String> remainList = new ArrayList<>();
            allCryptName.forEach(x->{
                if(zwNameMap.containsKey(x)){
                    remainList.add(x);
                }
            });
            log.info("还有{}条职务加密数据还没有解决",updateList.size());
//            this.updateThis(updateList);
            log.info("更新数据，共更新{}条数据",updateList.size());
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "读取文件失败：" + e.getMessage();
        }

    }
    public void updateThis(List<OriginSimple> updateList) {
        int batchSize = 500; // 每批次更新的数据量
        for (int i = 0; i < updateList.size(); i += batchSize) {
            List<OriginSimple> subList = updateList.subList(i, Math.min(i + batchSize, updateList.size()));
            gzRyJbxxService.updateBatchForIdName(subList);
        }
    }
}
