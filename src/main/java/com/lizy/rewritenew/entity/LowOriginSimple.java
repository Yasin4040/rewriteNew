package com.lizy.rewritenew.entity;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class LowOriginSimple {

    //人员序号
    private String renySort;
    private String employeeId;
    private String unitNo;
    private String unitName;
    private String empName;
    private String inentityNo;

    private String birthday;
    private String workTime;
    private String enterTime;
    private String rankAlias;

    private String firstSchool;
    private String highestSchool;
    private String highestDate;

    public String getUniqueKey(){
        String birthDate1 = this.birthday.substring(0,6);
        String workStartDate1 = this.workTime.substring(0,6);
        String entryDate1 = this.enterTime.substring(0,6);
        return StrUtil.join(":", this.unitName.trim(), this.renySort.trim(), birthDate1.trim(), workStartDate1.trim(), entryDate1.trim());
    }
}
