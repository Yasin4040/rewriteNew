package com.lizy.rewritenew.entity;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

@Data
public class LowOriginSimple {
    //人员序号
    private String ryxh;
    private String rybm;
    private String dwbm;
    private String dwbmStr;
    private String xm;
    private String sfzh;

    private String csny;
    private String cjgzsj;
    private String jrdwsj;
    private String srzwmc;

    private String firstSchool;
    private String highestSchool;
    private String highestDate;

    public String getUniqueKey(){
        String birthDate1 = this.csny.substring(0,6);
        String workStartDate1 = this.cjgzsj.substring(0,6);
        String entryDate1 = this.jrdwsj.substring(0,6);
        return StrUtil.join(":", this.dwbmStr, this.ryxh, birthDate1, workStartDate1, entryDate1);
    }
}
