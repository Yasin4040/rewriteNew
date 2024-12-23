package com.lizy.rewritenew.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.excel.EasyExcel;

import com.alibaba.fastjson2.JSON;
import com.lizy.rewritenew.dto.NameValueDTO;
import com.lizy.rewritenew.entity.Employee;
import com.lizy.rewritenew.entity.OriginSimple;
import com.lizy.rewritenew.listener.EmployeeDataListener;
import com.lizy.rewritenew.service.GzRyJbxxService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
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
public class ExcelController {

    private final GzRyJbxxService gzRyJbxxService;

    /**
     * 针对不同县加解密 不同的情况
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

            HashMap<String, String> positionNameMap = new HashMap<>();
            HashMap<String, String> schoolNameMap = new HashMap<>();

            HashMap<String, String> remainPositionNameMap = new HashMap<>();
            HashMap<String, String> remainSchoolNameMap = new HashMap<>();
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
                if (StrUtil.startWith(simple.getSrzwmc(),"d")) {
                    positionNameMap.put(simple.getSrzwmc(),employee.getPositionTitle());
                }
                //存进去的 第一学校
                if (StrUtil.startWith(simple.getFirstSchool(),"d")) {
                    schoolNameMap.put(simple.getFirstSchool(),employee.getFirstSchool());
                }
                //存进去的 最高学校
                if (StrUtil.startWith(simple.getHighestSchool(),"d")) {
                    schoolNameMap.put(simple.getHighestSchool(),employee.getHighestSchool());
                }
//                if (StrUtil.startWith(simple.getSrzwmc(),"d")) {
//                    positionNameMap.put(simple.getSrzwmc(),simple.getXm()+":"+employee.getPositionTitle());
//                }
//                //存进去的 第一学校
//                if (StrUtil.startWith(simple.getFirstSchool(),"d")) {
//                    schoolNameMap.put(simple.getFirstSchool(),simple.getXm()+":"+employee.getFirstSchool());
//                }
//                //存进去的 最高学校
//                if (StrUtil.startWith(simple.getHighestSchool(),"d")) {
//                    schoolNameMap.put(simple.getHighestSchool(),simple.getXm()+":"+employee.getHighestSchool());
//                }
                updateList.add(simple);
            }
            String jsonString = JSON.toJSONString(positionNameMap);
            String jsonString2 = JSON.toJSONString(schoolNameMap);
            //获取所有职务加密
            List<NameValueDTO> allCryptPositionName = gzRyJbxxService.listAllPositionName();
            //获取所有学校加密
            List<NameValueDTO> allCryptSchoolName = gzRyJbxxService.listAllSchoolName();
//            //有多少map
//            List<String> remainPositionList = new ArrayList<>();
//            List<String> remainSchoolList = new ArrayList<>();
            allCryptPositionName.forEach(x->{
                if(!positionNameMap.containsKey(x.getValue())){
                    remainPositionNameMap.put(x.getName(),x.getValue());
                }
            });

            allCryptSchoolName.forEach(x->{
                if(!schoolNameMap.containsKey(x.getValue())){
                    remainSchoolNameMap.put(x.getName(),x.getValue());
                }
            });

            log.info("还有{}条职务加密数据还没有解决",remainPositionNameMap.size());
            log.info("还有{}条学校加密数据还没有解决",remainSchoolNameMap.size());
            this.updateThis(updateList);
            log.info("更新数据，共更新{}条数据",updateList.size());
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "读取文件失败：" + e.getMessage();
        }

    }


    /**
     *  在版本1上面优化！！！增加json文件，主要处理学校、职务信息的加解密
     *
     * @param file 文件
     * @return {@link String }
     */
    @PostMapping("/uploadExcel2")
    public String uploadExcel2(@RequestParam("file") MultipartFile file) {
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

            HashMap<String, String> positionNameMap = new HashMap<>();
            HashMap<String, String> schoolNameMap = new HashMap<>();

            HashMap<String, String> remainPositionNameMap = new HashMap<>();
            HashMap<String, String> remainSchoolNameMap = new HashMap<>();
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
                updateList.add(simple);
            }
            //将json转hashmap


            schoolNameMap = readJsonFile("xdq-1223/school-xdq.json");
            positionNameMap = readJsonFile("xdq-1223/position-xdq.json");
            //职务的信息
            List<NameValueDTO> allCryptPositionName = gzRyJbxxService.listAllPositionName();
            //学校
            List<NameValueDTO> allCryptSchoolName = gzRyJbxxService.listAllSchoolName();
//            //有多少map
//            List<String> remainPositionList = new ArrayList<>();
//            List<String> remainSchoolList = new ArrayList<>();
            for (NameValueDTO nameValueDTO : allCryptPositionName) {
                if (!positionNameMap.containsKey(nameValueDTO.getValue())) {
                    remainPositionNameMap.put(nameValueDTO.getName(), nameValueDTO.getValue());
                }
            }

            for (NameValueDTO x : allCryptSchoolName) {
                if (!schoolNameMap.containsKey(x.getValue())) {
                    remainSchoolNameMap.put(x.getName(), x.getValue());
                }
            }

            log.info("还有{}条职务加密数据还没有解决",remainPositionNameMap.size());
            log.info("还有{}条学校加密数据还没有解决",remainSchoolNameMap.size());
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

    @SneakyThrows
    public HashMap<String, String> readJsonFile(String jsonDir) {
        // 获取当前线程的文件路径
        File templateFile = getTemplateFile(jsonDir);
        // 读取JSON文件内容
        String jsonStr = FileUtil.readUtf8String(templateFile);

        // 将JSON字符串转换为JSONObject
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);

        // 将JSONObject转换为Map<String, String>
        HashMap<String, String> resultMap = new HashMap<>();
        jsonObject.forEach((key, value) -> resultMap.put(key, String.valueOf(value)));

        return resultMap;
    }

    @SneakyThrows
    public Map<String, String> readJsonFile(String jsonDir,Map<String,String> resultMap) {
        // 获取当前线程的文件路径
        File templateFile = getTemplateFile(jsonDir);
        // 读取JSON文件内容
        String jsonStr = FileUtil.readUtf8String(templateFile);

        // 将JSON字符串转换为JSONObject
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);

        // 将JSONObject转换为Map<String, String>
        jsonObject.forEach((key, value) -> resultMap.put(key, String.valueOf(value)));
        return resultMap;
    }

    @SneakyThrows
    public File readJsonFileDir(String jsonDir) {
        // 获取当前线程的文件路径
        return FileUtil.file(Thread.currentThread().getContextClassLoader().getResource("static/" + jsonDir)) ;
    }
    public static File getTemplateFile(String tplFileName) throws IOException {
        File file = null;
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("static/" + tplFileName)) {
            // 创建临时文件
            String replace = tplFileName.replace("/", "");
            file = FileUtil.createTempFile("template_" ,replace,false);
            file.deleteOnExit(); // 确保在JVM退出时删除临时文件
            // 将输入流写入临时文件
            try (OutputStream outputStream = Files.newOutputStream(file.toPath())) {
                byte[] buffer = new byte[4096]; // 使用4096字节的缓冲区
                int length;
                if (inputStream != null) {
                    while ((length = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, length);
                    }
                }
            }
        }
        return file;
    }



    @PostMapping("/practiceForPositionAndSchool")
    public String practiceForPositionAndSchool() throws IOException {

        //将json转hashmap
        //职务的信息
        List<NameValueDTO> cryptPositionList = gzRyJbxxService.listAllCryptPositionMap();
        //学校数据
        List<NameValueDTO> cryptSchoolList = gzRyJbxxService.listAllCryptSchoolMap();

        //职务的信息
        Map<String, String> cryptPositionMap = cryptPositionList.stream().collect(Collectors.toMap(NameValueDTO::getName, NameValueDTO::getValue));
        //学校数据
        Map<String, String> cryptSchoolMap =  cryptSchoolList.stream().collect(Collectors.toMap(NameValueDTO::getName, NameValueDTO::getValue));


        readJsonFile("position-nc.json", cryptPositionMap);
        readJsonFile("school-nc.json", cryptSchoolMap);

        String jsonString = JSON.toJSONString(cryptPositionMap);
        String jsonString2 = JSON.toJSONString(cryptSchoolMap);
        File file = readJsonFileDir("position-nc.json");

        // 写入 jsonString 到 position-nf.json
        File positionFile = new File(file.getParent(),"/position-nf.json");
        Files.write(positionFile.toPath(), jsonString.getBytes());

        // 写入 jsonString2 到 school-nf.json
        File schoolFile = new File(file.getParent(),"/school-nf.json");
        Files.write(schoolFile.toPath(), jsonString2.getBytes());
        return "";
    }


    /**
     * 填充json文件
     *
     * @param file 文件
     * @return {@link String }
     */
    @PostMapping("/practiceFromExcel")
    public String practiceFromExcel(@RequestParam("file") MultipartFile file) {
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

            Map<String, Employee> employeeMap = employeeList.stream().collect(Collectors.toMap(Employee::getUniqueKey, Function.identity()));
            log.info("转换map的keys数量：{}",employeeMap.keySet().size());
            //获取excel
            List<OriginSimple> allPerson = gzRyJbxxService.listSimple();
            // 用于存储不在simples列表中的Employee数据

            HashMap<String, String> positionNameMap = new LinkedHashMap<>();
            HashMap<String, String> schoolNameMap = new LinkedHashMap<>();

            List<OriginSimple> updateList = new ArrayList<>();
            for (OriginSimple simple : allPerson) {
                String uniqueKey = simple.getUniqueKey();
                Employee employee = employeeMap.get(uniqueKey);
                if (employee == null) {
                    log.info("失败的key{}",uniqueKey);
                    continue;
                }
                if (StrUtil.startWith(simple.getSrzwmc(),"d")) {
                    positionNameMap.put(simple.getSrzwmc(),employee.getPositionTitle());
                }
                if (StrUtil.startWith(simple.getFirstSchool(),"d")) {
                    if(StrUtil.isNotBlank(employee.getFirstSchool())){
                        schoolNameMap.put(simple.getFirstSchool(),employee.getFirstSchool());
                    }
                }
                if (StrUtil.startWith(simple.getHighestSchool(),"d")) {
                    if(StrUtil.isNotBlank(employee.getHighestSchool())){
                        schoolNameMap.put(simple.getHighestSchool(),employee.getHighestSchool());
                    }
                }
            }
            //将json转hashmap
            readJsonFile("nf/school-nf.json", schoolNameMap);
            readJsonFile("nf/position-nf.json", positionNameMap);
            String jsonString = JSON.toJSONString(positionNameMap);
            String jsonString2 = JSON.toJSONString(schoolNameMap);

            //获取父路径
            File file2 = readJsonFileDir("position-nc.json");
            // 写入 jsonString 到 position-nf.json
            File positionFile = new File(file2.getParent(),"/position-xdq.json");
            Files.write(positionFile.toPath(), jsonString.getBytes());

            // 写入 jsonString2 到 school-nf.json
            File schoolFile = new File(file2.getParent(),"/school-xdq.json");
            Files.write(schoolFile.toPath(), jsonString2.getBytes());

            log.info("一共{}条数据",updateList.size());
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "读取文件失败：" + e.getMessage();
        }

    }

    /**
     * 用json文件更新
     *
     * @return {@link String }
     */
    @PostMapping("/updateForPositionAndSchool")
    public String updateForPositionAndSchool() {


        //职务的信息
        Map<String, String> cryptPositionMap = new HashMap<>();
        //学校数据
        Map<String, String> cryptSchoolMap =  new HashMap<>();

        readJsonFile("/nf/position-nf.json", cryptPositionMap);
        readJsonFile("/nf/school-nf.json", cryptSchoolMap);

        //update 两个表
        List<NameValueDTO> positionList = cryptPositionMap.entrySet().stream().map(x -> new NameValueDTO(x.getKey(), x.getValue())).collect(Collectors.toList());
        List<NameValueDTO> schoolList = cryptSchoolMap.entrySet().stream().map(x -> new NameValueDTO(x.getKey(), x.getValue())).collect(Collectors.toList());


        this.updateThis(positionList, gzRyJbxxService::updateBatchForPosition);
        this.updateThis(schoolList, gzRyJbxxService::updateBatchForSchool);

        return "";
    }

    public <T> void updateThis(List<T> updateList,Consumer<List<T>> consumer) {
        int batchSize = 500; // 每批次更新的数据量
        for (int i = 0; i < updateList.size(); i += batchSize) {
            // 获取当前批次的子列表
            List<T> subList = updateList.subList(i, Math.min(i + batchSize, updateList.size()));
            // 调用传入的Consumer接口实现，传入当前批次的子列表
            consumer.accept(subList);
        }
    }
}
