package com.lizy.rewritenew.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.lizy.rewritenew.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDataListener extends AnalysisEventListener<Employee> {
    // 定义一个列表，用于存储解析后的数据
    private List<Employee> employeeList = new ArrayList<>();
    @Override
    public void invoke(Employee data, AnalysisContext context) {
        // 处理读取到的数据，例如保存到数据库
        // 将每行数据添加到列表中
        employeeList.add(data);
        System.out.println("读取到一条数据：" + data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 所有数据解析完成后的操作
        System.out.println("所有数据解析完成！");
    }

    // 提供一个方法来获取员工列表
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // 提供一个方法来清空列表，以便下一次解析
    public void clearEmployeeList() {
        employeeList.clear();
    }
}
