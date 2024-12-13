package com.lizy.rewritenew.entity;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;


@Data
public class Employee {

    @ExcelProperty("行号")
    private String serialNumber;

    @ExcelProperty("人员序号")
    private String personnelNumber;

    @ExcelProperty("单位")
    private String unit;

    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("年龄")
    private String age;

    @ExcelProperty("性别")
    private String gender;

    @ExcelProperty("身份证号")
    private String idNumber;

    @ExcelProperty("出生年月")
//    @DateTimeFormat("yyyy-MM")
    private String birthDate;

    @ExcelProperty("参加工作年月")
//    @DateTimeFormat("yyyy-MM")
    private String workStartDate;

    @ExcelProperty("进入单位年月")
//    @DateTimeFormat("yyyy-MM")
    private String entryDate;

    @ExcelProperty("进入单位原因")
    private String entryReason;

    @ExcelProperty("身份")
    private String identity;

    @ExcelProperty("岗位类型")
    private String positionType;

    @ExcelProperty("人员管理方式")
    private String managementMethod;

    @ExcelProperty("工改考核中断")
    private String workReformInterruption;

    @ExcelProperty("中断工龄")
    private String interruptedSeniority;

    @ExcelProperty("工龄")
    private String seniority;

    @ExcelProperty("应计学龄")
    private String calculatedEducationalAge;

    @ExcelProperty("最高学历取得年月")
//    @DateTimeFormat("yyyy-MM")
    private String highestEducationDate;

    @ExcelProperty("最高学历认定年月")
//    @DateTimeFormat("yyyy-MM")
    private String highestEducationConfirmDate;

    @ExcelProperty("最高学历")
    private String highestEducation;

    @ExcelProperty("最高学历类别")
    private String highestEducationCategory;

    @ExcelProperty("最高学历学位")
    private String highestEducationDegree;

    @ExcelProperty("职务名称")
    private String positionTitle;

    @ExcelProperty("工资待遇")
    private String salaryTreatment;

    @ExcelProperty("当前职务任命年月")
//    @DateTimeFormat("yyyy-MM")
    private String currentPositionAppointedDate;

    @ExcelProperty("当前职务任职年限")
    private String currentPositionTenure;

    @ExcelProperty("当前事业岗位任职年月")
//    @DateTimeFormat("yyyy-MM")
    private String currentProfessionalPositionDate;

    @ExcelProperty("当前事业岗位任职年限")
    private String currentProfessionalPositionTenure;

    @ExcelProperty("专业技术职务")
    private String professionalTechnicalPosition;

    @ExcelProperty("人员状态")
    private String personnelStatus;

    @ExcelProperty("减员时间")
//    @DateTimeFormat("yyyy-MM")
    private String reductionDate;

    @ExcelProperty("岗位")
    private String position;

    @ExcelProperty("应发工资")
    private String payableSalary;

    // Getters and Setters
    // ...

    public String getUniqueKey() {
        String birthDate1 = this.getBirthDate().replace("-", "");
        String workStartDate1 = this.getWorkStartDate().replace("-", "");
        String entryDate1 = this.getEntryDate().replace("-", "");
        return StrUtil.join(":", this.unit, this.personnelNumber, birthDate1, workStartDate1, entryDate1);
    }
}
