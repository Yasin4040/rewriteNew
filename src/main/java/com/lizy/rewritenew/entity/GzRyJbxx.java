package com.lizy.rewritenew.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName GZ_RY_JBXX
 */
@TableName(value ="GZ_RY_JBXX")
@Data
public class GzRyJbxx implements Serializable {
    /**
     * 
     */
    @TableId(value = "rybm")
    private String rybm;

    @TableField(value = "dwbm")
    private String dwbm;

    /**
     * 姓名:
     */
    @TableField(value = "XM")
    private String xm;

    /**
     * 部门编号
     */
    @TableField(value = "BMBM")
    private String bmbm;

    /**
     * 性别
     */
    @TableField(value = "SEX")
    private String sex;

    /**
     * 身份证号
     */
    @TableField(value = "SFZH")
    private String sfzh;

    /**
     * 籍贯
     */
    @TableField(value = "JG")
    private String jg;

    /**
     * 民族
     */
    @TableField(value = "MZ")
    private String mz;

    /**
     * 参加工作时间
     */
    @TableField(value = "CJGZSJ")
    private String cjgzsj;

    /**
     * 出生年月
     */
    @TableField(value = "CSNY")
    private String csny;

    /**
     * 进入单位时间
     */
    @TableField(value = "JRDWSJ")
    private String jrdwsj;

    /**
     * 进入单位原因
     */
    @TableField(value = "JRDWYY")
    private String jrdwyy;

    /**
     * 进入单位类型
     */
    @TableField(value = "JRDWLX")
    private String jrdwlx;

    /**
     * 身份编码
     */
    @TableField(value = "GZSFBM")
    private String gzsfbm;

    /**
     * 岗位类型
     */
    @TableField(value = "GWLX")
    private String gwlx;

    /**
     * 政治面貌
     */
    @TableField(value = "ZZMM")
    private String zzmm;

    /**
     * 入党时间
     */
    @TableField(value = "RDSJ")
    private String rdsj;

    /**
     * 工改前中断工龄
     */
    @TableField(value = "ZDGL")
    private Integer zdgl;

    /**
     * 应计学龄
     */
    @TableField(value = "YJXL")
    private Integer yjxl;

    /**
     * 定级时间
     */
    @TableField(value = "DJSJ")
    private String djsj;

    /**
     * 变动时间,如死亡,调出时间
     */
    @TableField(value = "JSSJ")
    private String jssj;

    /**
     * 人员状态
     */
    @TableField(value = "RYZT")
    private String ryzt;

    /**
     * 备注
     */
    @TableField(value = "RYBZ")
    private String rybz;

    /**
     * 抚州市临川区 连续工龄起算时间
     */
    @TableField(value = "LXGLQSSJ")
    private String lxglqssj;

    /**
     * 用于延迟退休人员，指定实际退休的年月。
     */
    @TableField(value = "DLYTNY")
    private String dlytny;

    /**
     * 档案序号
   郑州铁路公安处：劳资号
     */
    @TableField(value = "DABH")
    private String dabh;

    /**
     * 工资类型,普通,野外等
   
     */
    @TableField(value = "GZLXBM")
    private String gzlxbm;

    /**
     * 艰苦边远地区的分类,共分为一、二、三、四、五、六类区
     */
    @TableField(value = "JKBYDQLB")
    private String jkbydqlb;

    /**
     * 人员是否聘干或者军转的标志,0：无、1：聘干人员、2：军转人员、3：转岗人员
     */
    @TableField(value = "PGJZBZ")
    private String pgjzbz;

    /**
     * 在职工资开始发放时间
     */
    @TableField(value = "GZQFSJ")
    private String gzqfsj;

    /**
     * 工资停发时间
     */
    @TableField(value = "GZTFSJ")
    private String gztfsj;

    /**
     * 差供,全供,自收自支
     */
    @TableField(value = "RYJFXS")
    private String ryjfxs;

    /**
     * 机关,事业,依照,参照等
     */
    @TableField(value = "RYGLFS")
    private String ryglfs;

    /**
     * 人员提高比例
     */
    @TableField(value = "JHTGBL")
    private Integer jhtgbl;

    /**
     * 人员归哪个单位来进行审批，4,人事局,6,组织部7.主管局8.人社厅
     */
    @TableField(value = "SPDW")
    private String spdw;

    /**
     * 军转时间
     */
    @TableField(value = "JZSJ")
    private String jzsj;

    /**
     * 不计入工龄的中断月数
     */
    @TableField(value = "ZDGLYS")
    private Integer zdglys;

    /**
     * 更正后的工龄月数
     */
    @TableField(value = "GZGLYS")
    private Integer gzglys;

    /**
     * 1行政职务,2,文职干部,3,技术干部
     */
    @TableField(value = "YJZWLB")
    private String yjzwlb;

    /**
     * 排职	000001/副连职	000002/正连职	000003/副营职	000004/正营职	000005/副团职	000006/正团职	000007/副师职	000008/正师职	000009/副军职	000010/正军职	000011
     */
    @TableField(value = "YJDZWDJ")
    private String yjdzwdj;

    /**
     * 是	1/否	2
     */
    @TableField(value = "JDLDZWBZ")
    private String jdldzwbz;

    /**
     * 
     */
    @TableField(value = "SGGBBZ")
    private String sggbbz;

    /**
     * 统发:银行编码
   
     */
    @TableField(value = "YHBM1")
    private String yhbm1;

    /**
     * 个人银行帐号
     */
    @TableField(value = "YHZH1")
    private String yhzh1;

    /**
     * 统发人员的第二银行
     */
    @TableField(value = "YHBM2")
    private String yhbm2;

    /**
     * 统发人员的第二银行帐号
     */
    @TableField(value = "YHZH2")
    private String yhzh2;

    /**
     * 人员排序号
     */
    @TableField(value = "RYXH")
    private Integer ryxh;

    /**
     * 公务员登记时间
     */
    @TableField(value = "GWYDJSJ")
    private String gwydjsj;

    /**
     * 
     */
    @TableField(value = "RYHYLB")
    private String ryhylb;

    /**
     * 
     */
    @TableField(value = "LXGL")
    private Integer lxgl;

    /**
     * 统发;归口编码
     */
    @TableField(value = "GZGKBM")
    private String gzgkbm;

    /**
     * 统发
     */
    @TableField(value = "YSKMBM")
    private String yskmbm;

    /**
     * 工资停发标记,0,不停,1,停
     */
    @TableField(value = "GZTFBZ")
    private String gztfbz;

    /**
     * 人员档案身份,10干部,20,国营固定工人,21,国营合同制工人,22,大集体工人
   
   抚州市临川区:职工性质选项：干部、聘干、全民工人、合同制工人、大集体工人、农工。
     */
    @TableField(value = "DASF")
    private String dasf;

    /**
     * 重庆涪陵加求见,反应其真实身份,工资走的身份可能与实际身份不一至,如:工人,实际走的是职员,但身份仍然是工人,原身份变化为工资系列身份
     */
    @TableField(value = "SJSF")
    private String sjsf;

    /**
     * 1,在编,2,不在编有手续,3,不在编混岗
     */
    @TableField(value = "BZXZ")
    private String bzxz;

    /**
     * 06工改前考核中断年限
     */
    @TableField(value = "GGQKHZD06")
    private Integer ggqkhzd06;

    /**
     * 1,扶贫县,2,扶贫乡
     */
    @TableField(value = "SFFPDHXX")
    private String sffpdhxx;

    /**
     * 
     */
    @TableField(value = "GDDCXJ")
    private Integer gddcxj;

    /**
     * 
     */
    @TableField(value = "LDBZ")
    private String ldbz;

    /**
     * 0：未审批  1：审批通过
     */
    @TableField(value = "SPBZ")
    private String spbz;

    /**
     * 
     */
    @TableField(value = "SPSJ")
    private String spsj;

    /**
     * 该字段记录涉及数据变动时人社局的审批时间，上报数据时需要用该字段与局端的该字段比较，只能申报审批时间及以后的未审批的工资信息数据
   精确到分，格式：yyyyMMddHHmm
     */
    @TableField(value = "ZXSPSJ")
    private String zxspsj;

    /**
     * 审批人员
     */
    @TableField(value = "SPRY")
    private String spry;

    /**
     * 
     */
    @TableField(value = "GWYDJBZ")
    private String gwydjbz;

    /**
     * 
     */
    @TableField(value = "BY1")
    private String by1;

    /**
     * 
     */
    @TableField(value = "BY2")
    private String by2;

    /**
     * 
     */
    @TableField(value = "BY3")
    private String by3;

    /**
     * 
     */
    @TableField(value = "BY4")
    private String by4;

    /**
     * 
     */
    @TableField(value = "BY5")
    private String by5;

    /**
     * 
     */
    @TableField(value = "BY6")
    private String by6;

    /**
     * 
     */
    @TableField(value = "BY7")
    private String by7;

    /**
     * 
     */
    @TableField(value = "BY8")
    private String by8;

    /**
     * 
     */
    @TableField(value = "BY9")
    private String by9;

    /**
     * 
     */
    @TableField(value = "BY10")
    private String by10;

    /**
     * 
     */
    @TableField(value = "BY11")
    private String by11;

    /**
     * 
     */
    @TableField(value = "BY12")
    private String by12;

    /**
     * 
     */
    @TableField(value = "BY13")
    private String by13;

    /**
     * 
     */
    @TableField(value = "BY14")
    private String by14;

    /**
     * 
     */
    @TableField(value = "BY15")
    private String by15;

    /**
     * 
     */
    @TableField(value = "BY16")
    private String by16;

    /**
     * 
     */
    @TableField(value = "BY17")
    private String by17;

    /**
     * 
     */
    @TableField(value = "BY18")
    private String by18;

    /**
     * 
     */
    @TableField(value = "BY19")
    private String by19;

    /**
     * 
     */
    @TableField(value = "BY20")
    private String by20;

    /**
     * 
     */
    @TableField(value = "BY21")
    private Integer by21;

    /**
     * 
     */
    @TableField(value = "BY22")
    private Integer by22;

    /**
     * 
     */
    @TableField(value = "BY23")
    private Integer by23;

    /**
     * 
     */
    @TableField(value = "ryid")
    private Integer ryid;

    /**
     * 
     */
    @TableField(value = "grbh")
    private String grbh;

    /**
     * 
     */
    @TableField(value = "YCTXYY")
    private String yctxyy;

    /**
     * 
     */
    @TableField(value = "YTNS")
    private Integer ytns;

    /**
     * 
     */
    @TableField(value = "YTYS")
    private Integer ytys;

    /**
     * 
     */
    @TableField(value = "ZGJZXSPSJ")
    private String zgjzxspsj;

    /**
     * 
     */
    @TableField(value = "ZGJSPSJ")
    private String zgjspsj;

    /**
     * 
     */
    @TableField(value = "ZGJSPBZ")
    private String zgjspbz;

    /**
     * 
     */
    @TableField(value = "ZGJSPRY")
    private String zgjspry;

    /**
     * 
     */
    @TableField(value = "CSXGGSJ")
    private String csxggsj;

    /**
     * 
     */
    @TableField(value = "BY24")
    private String by24;

    /**
     * 
     */
    @TableField(value = "BY25")
    private String by25;

    /**
     * 
     */
    @TableField(value = "BY26")
    private String by26;

    /**
     * 
     */
    @TableField(value = "BY27")
    private String by27;

    /**
     * 
     */
    @TableField(value = "BY28")
    private String by28;

    /**
     * 
     */
    @TableField(value = "BY29")
    private String by29;

    /**
     * 
     */
    @TableField(value = "BZXZ_SPR")
    private String bzxzSpr;

    /**
     * 
     */
    @TableField(value = "BZXZ_SPSJ")
    private String bzxzSpsj;

    /**
     * 
     */
    @TableField(value = "BZXZ_SPBZ")
    private String bzxzSpbz;

    /**
     * 
     */
    @TableField(value = "BZXZ_CZNR")
    private String bzxzCznr;

    /**
     * 
     */
    @TableField(value = "BZXZ_YBZXZ")
    private String bzxzYbzxz;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GzRyJbxx other = (GzRyJbxx) that;
        return (this.getRybm() == null ? other.getRybm() == null : this.getRybm().equals(other.getRybm()))
            && (this.getDwbm() == null ? other.getDwbm() == null : this.getDwbm().equals(other.getDwbm()))
            && (this.getXm() == null ? other.getXm() == null : this.getXm().equals(other.getXm()))
            && (this.getBmbm() == null ? other.getBmbm() == null : this.getBmbm().equals(other.getBmbm()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getSfzh() == null ? other.getSfzh() == null : this.getSfzh().equals(other.getSfzh()))
            && (this.getJg() == null ? other.getJg() == null : this.getJg().equals(other.getJg()))
            && (this.getMz() == null ? other.getMz() == null : this.getMz().equals(other.getMz()))
            && (this.getCjgzsj() == null ? other.getCjgzsj() == null : this.getCjgzsj().equals(other.getCjgzsj()))
            && (this.getCsny() == null ? other.getCsny() == null : this.getCsny().equals(other.getCsny()))
            && (this.getJrdwsj() == null ? other.getJrdwsj() == null : this.getJrdwsj().equals(other.getJrdwsj()))
            && (this.getJrdwyy() == null ? other.getJrdwyy() == null : this.getJrdwyy().equals(other.getJrdwyy()))
            && (this.getJrdwlx() == null ? other.getJrdwlx() == null : this.getJrdwlx().equals(other.getJrdwlx()))
            && (this.getGzsfbm() == null ? other.getGzsfbm() == null : this.getGzsfbm().equals(other.getGzsfbm()))
            && (this.getGwlx() == null ? other.getGwlx() == null : this.getGwlx().equals(other.getGwlx()))
            && (this.getZzmm() == null ? other.getZzmm() == null : this.getZzmm().equals(other.getZzmm()))
            && (this.getRdsj() == null ? other.getRdsj() == null : this.getRdsj().equals(other.getRdsj()))
            && (this.getZdgl() == null ? other.getZdgl() == null : this.getZdgl().equals(other.getZdgl()))
            && (this.getYjxl() == null ? other.getYjxl() == null : this.getYjxl().equals(other.getYjxl()))
            && (this.getDjsj() == null ? other.getDjsj() == null : this.getDjsj().equals(other.getDjsj()))
            && (this.getJssj() == null ? other.getJssj() == null : this.getJssj().equals(other.getJssj()))
            && (this.getRyzt() == null ? other.getRyzt() == null : this.getRyzt().equals(other.getRyzt()))
            && (this.getRybz() == null ? other.getRybz() == null : this.getRybz().equals(other.getRybz()))
            && (this.getLxglqssj() == null ? other.getLxglqssj() == null : this.getLxglqssj().equals(other.getLxglqssj()))
            && (this.getDlytny() == null ? other.getDlytny() == null : this.getDlytny().equals(other.getDlytny()))
            && (this.getDabh() == null ? other.getDabh() == null : this.getDabh().equals(other.getDabh()))
            && (this.getGzlxbm() == null ? other.getGzlxbm() == null : this.getGzlxbm().equals(other.getGzlxbm()))
            && (this.getJkbydqlb() == null ? other.getJkbydqlb() == null : this.getJkbydqlb().equals(other.getJkbydqlb()))
            && (this.getPgjzbz() == null ? other.getPgjzbz() == null : this.getPgjzbz().equals(other.getPgjzbz()))
            && (this.getGzqfsj() == null ? other.getGzqfsj() == null : this.getGzqfsj().equals(other.getGzqfsj()))
            && (this.getGztfsj() == null ? other.getGztfsj() == null : this.getGztfsj().equals(other.getGztfsj()))
            && (this.getRyjfxs() == null ? other.getRyjfxs() == null : this.getRyjfxs().equals(other.getRyjfxs()))
            && (this.getRyglfs() == null ? other.getRyglfs() == null : this.getRyglfs().equals(other.getRyglfs()))
            && (this.getJhtgbl() == null ? other.getJhtgbl() == null : this.getJhtgbl().equals(other.getJhtgbl()))
            && (this.getSpdw() == null ? other.getSpdw() == null : this.getSpdw().equals(other.getSpdw()))
            && (this.getJzsj() == null ? other.getJzsj() == null : this.getJzsj().equals(other.getJzsj()))
            && (this.getZdglys() == null ? other.getZdglys() == null : this.getZdglys().equals(other.getZdglys()))
            && (this.getGzglys() == null ? other.getGzglys() == null : this.getGzglys().equals(other.getGzglys()))
            && (this.getYjzwlb() == null ? other.getYjzwlb() == null : this.getYjzwlb().equals(other.getYjzwlb()))
            && (this.getYjdzwdj() == null ? other.getYjdzwdj() == null : this.getYjdzwdj().equals(other.getYjdzwdj()))
            && (this.getJdldzwbz() == null ? other.getJdldzwbz() == null : this.getJdldzwbz().equals(other.getJdldzwbz()))
            && (this.getSggbbz() == null ? other.getSggbbz() == null : this.getSggbbz().equals(other.getSggbbz()))
            && (this.getYhbm1() == null ? other.getYhbm1() == null : this.getYhbm1().equals(other.getYhbm1()))
            && (this.getYhzh1() == null ? other.getYhzh1() == null : this.getYhzh1().equals(other.getYhzh1()))
            && (this.getYhbm2() == null ? other.getYhbm2() == null : this.getYhbm2().equals(other.getYhbm2()))
            && (this.getYhzh2() == null ? other.getYhzh2() == null : this.getYhzh2().equals(other.getYhzh2()))
            && (this.getRyxh() == null ? other.getRyxh() == null : this.getRyxh().equals(other.getRyxh()))
            && (this.getGwydjsj() == null ? other.getGwydjsj() == null : this.getGwydjsj().equals(other.getGwydjsj()))
            && (this.getRyhylb() == null ? other.getRyhylb() == null : this.getRyhylb().equals(other.getRyhylb()))
            && (this.getLxgl() == null ? other.getLxgl() == null : this.getLxgl().equals(other.getLxgl()))
            && (this.getGzgkbm() == null ? other.getGzgkbm() == null : this.getGzgkbm().equals(other.getGzgkbm()))
            && (this.getYskmbm() == null ? other.getYskmbm() == null : this.getYskmbm().equals(other.getYskmbm()))
            && (this.getGztfbz() == null ? other.getGztfbz() == null : this.getGztfbz().equals(other.getGztfbz()))
            && (this.getDasf() == null ? other.getDasf() == null : this.getDasf().equals(other.getDasf()))
            && (this.getSjsf() == null ? other.getSjsf() == null : this.getSjsf().equals(other.getSjsf()))
            && (this.getBzxz() == null ? other.getBzxz() == null : this.getBzxz().equals(other.getBzxz()))
            && (this.getGgqkhzd06() == null ? other.getGgqkhzd06() == null : this.getGgqkhzd06().equals(other.getGgqkhzd06()))
            && (this.getSffpdhxx() == null ? other.getSffpdhxx() == null : this.getSffpdhxx().equals(other.getSffpdhxx()))
            && (this.getGddcxj() == null ? other.getGddcxj() == null : this.getGddcxj().equals(other.getGddcxj()))
            && (this.getLdbz() == null ? other.getLdbz() == null : this.getLdbz().equals(other.getLdbz()))
            && (this.getSpbz() == null ? other.getSpbz() == null : this.getSpbz().equals(other.getSpbz()))
            && (this.getSpsj() == null ? other.getSpsj() == null : this.getSpsj().equals(other.getSpsj()))
            && (this.getZxspsj() == null ? other.getZxspsj() == null : this.getZxspsj().equals(other.getZxspsj()))
            && (this.getSpry() == null ? other.getSpry() == null : this.getSpry().equals(other.getSpry()))
            && (this.getGwydjbz() == null ? other.getGwydjbz() == null : this.getGwydjbz().equals(other.getGwydjbz()))
            && (this.getBy1() == null ? other.getBy1() == null : this.getBy1().equals(other.getBy1()))
            && (this.getBy2() == null ? other.getBy2() == null : this.getBy2().equals(other.getBy2()))
            && (this.getBy3() == null ? other.getBy3() == null : this.getBy3().equals(other.getBy3()))
            && (this.getBy4() == null ? other.getBy4() == null : this.getBy4().equals(other.getBy4()))
            && (this.getBy5() == null ? other.getBy5() == null : this.getBy5().equals(other.getBy5()))
            && (this.getBy6() == null ? other.getBy6() == null : this.getBy6().equals(other.getBy6()))
            && (this.getBy7() == null ? other.getBy7() == null : this.getBy7().equals(other.getBy7()))
            && (this.getBy8() == null ? other.getBy8() == null : this.getBy8().equals(other.getBy8()))
            && (this.getBy9() == null ? other.getBy9() == null : this.getBy9().equals(other.getBy9()))
            && (this.getBy10() == null ? other.getBy10() == null : this.getBy10().equals(other.getBy10()))
            && (this.getBy11() == null ? other.getBy11() == null : this.getBy11().equals(other.getBy11()))
            && (this.getBy12() == null ? other.getBy12() == null : this.getBy12().equals(other.getBy12()))
            && (this.getBy13() == null ? other.getBy13() == null : this.getBy13().equals(other.getBy13()))
            && (this.getBy14() == null ? other.getBy14() == null : this.getBy14().equals(other.getBy14()))
            && (this.getBy15() == null ? other.getBy15() == null : this.getBy15().equals(other.getBy15()))
            && (this.getBy16() == null ? other.getBy16() == null : this.getBy16().equals(other.getBy16()))
            && (this.getBy17() == null ? other.getBy17() == null : this.getBy17().equals(other.getBy17()))
            && (this.getBy18() == null ? other.getBy18() == null : this.getBy18().equals(other.getBy18()))
            && (this.getBy19() == null ? other.getBy19() == null : this.getBy19().equals(other.getBy19()))
            && (this.getBy20() == null ? other.getBy20() == null : this.getBy20().equals(other.getBy20()))
            && (this.getBy21() == null ? other.getBy21() == null : this.getBy21().equals(other.getBy21()))
            && (this.getBy22() == null ? other.getBy22() == null : this.getBy22().equals(other.getBy22()))
            && (this.getBy23() == null ? other.getBy23() == null : this.getBy23().equals(other.getBy23()))
            && (this.getRyid() == null ? other.getRyid() == null : this.getRyid().equals(other.getRyid()))
            && (this.getGrbh() == null ? other.getGrbh() == null : this.getGrbh().equals(other.getGrbh()))
            && (this.getYctxyy() == null ? other.getYctxyy() == null : this.getYctxyy().equals(other.getYctxyy()))
            && (this.getYtns() == null ? other.getYtns() == null : this.getYtns().equals(other.getYtns()))
            && (this.getYtys() == null ? other.getYtys() == null : this.getYtys().equals(other.getYtys()))
            && (this.getZgjzxspsj() == null ? other.getZgjzxspsj() == null : this.getZgjzxspsj().equals(other.getZgjzxspsj()))
            && (this.getZgjspsj() == null ? other.getZgjspsj() == null : this.getZgjspsj().equals(other.getZgjspsj()))
            && (this.getZgjspbz() == null ? other.getZgjspbz() == null : this.getZgjspbz().equals(other.getZgjspbz()))
            && (this.getZgjspry() == null ? other.getZgjspry() == null : this.getZgjspry().equals(other.getZgjspry()))
            && (this.getCsxggsj() == null ? other.getCsxggsj() == null : this.getCsxggsj().equals(other.getCsxggsj()))
            && (this.getBy24() == null ? other.getBy24() == null : this.getBy24().equals(other.getBy24()))
            && (this.getBy25() == null ? other.getBy25() == null : this.getBy25().equals(other.getBy25()))
            && (this.getBy26() == null ? other.getBy26() == null : this.getBy26().equals(other.getBy26()))
            && (this.getBy27() == null ? other.getBy27() == null : this.getBy27().equals(other.getBy27()))
            && (this.getBy28() == null ? other.getBy28() == null : this.getBy28().equals(other.getBy28()))
            && (this.getBy29() == null ? other.getBy29() == null : this.getBy29().equals(other.getBy29()))
            && (this.getBzxzSpr() == null ? other.getBzxzSpr() == null : this.getBzxzSpr().equals(other.getBzxzSpr()))
            && (this.getBzxzSpsj() == null ? other.getBzxzSpsj() == null : this.getBzxzSpsj().equals(other.getBzxzSpsj()))
            && (this.getBzxzSpbz() == null ? other.getBzxzSpbz() == null : this.getBzxzSpbz().equals(other.getBzxzSpbz()))
            && (this.getBzxzCznr() == null ? other.getBzxzCznr() == null : this.getBzxzCznr().equals(other.getBzxzCznr()))
            && (this.getBzxzYbzxz() == null ? other.getBzxzYbzxz() == null : this.getBzxzYbzxz().equals(other.getBzxzYbzxz()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRybm() == null) ? 0 : getRybm().hashCode());
        result = prime * result + ((getDwbm() == null) ? 0 : getDwbm().hashCode());
        result = prime * result + ((getXm() == null) ? 0 : getXm().hashCode());
        result = prime * result + ((getBmbm() == null) ? 0 : getBmbm().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getSfzh() == null) ? 0 : getSfzh().hashCode());
        result = prime * result + ((getJg() == null) ? 0 : getJg().hashCode());
        result = prime * result + ((getMz() == null) ? 0 : getMz().hashCode());
        result = prime * result + ((getCjgzsj() == null) ? 0 : getCjgzsj().hashCode());
        result = prime * result + ((getCsny() == null) ? 0 : getCsny().hashCode());
        result = prime * result + ((getJrdwsj() == null) ? 0 : getJrdwsj().hashCode());
        result = prime * result + ((getJrdwyy() == null) ? 0 : getJrdwyy().hashCode());
        result = prime * result + ((getJrdwlx() == null) ? 0 : getJrdwlx().hashCode());
        result = prime * result + ((getGzsfbm() == null) ? 0 : getGzsfbm().hashCode());
        result = prime * result + ((getGwlx() == null) ? 0 : getGwlx().hashCode());
        result = prime * result + ((getZzmm() == null) ? 0 : getZzmm().hashCode());
        result = prime * result + ((getRdsj() == null) ? 0 : getRdsj().hashCode());
        result = prime * result + ((getZdgl() == null) ? 0 : getZdgl().hashCode());
        result = prime * result + ((getYjxl() == null) ? 0 : getYjxl().hashCode());
        result = prime * result + ((getDjsj() == null) ? 0 : getDjsj().hashCode());
        result = prime * result + ((getJssj() == null) ? 0 : getJssj().hashCode());
        result = prime * result + ((getRyzt() == null) ? 0 : getRyzt().hashCode());
        result = prime * result + ((getRybz() == null) ? 0 : getRybz().hashCode());
        result = prime * result + ((getLxglqssj() == null) ? 0 : getLxglqssj().hashCode());
        result = prime * result + ((getDlytny() == null) ? 0 : getDlytny().hashCode());
        result = prime * result + ((getDabh() == null) ? 0 : getDabh().hashCode());
        result = prime * result + ((getGzlxbm() == null) ? 0 : getGzlxbm().hashCode());
        result = prime * result + ((getJkbydqlb() == null) ? 0 : getJkbydqlb().hashCode());
        result = prime * result + ((getPgjzbz() == null) ? 0 : getPgjzbz().hashCode());
        result = prime * result + ((getGzqfsj() == null) ? 0 : getGzqfsj().hashCode());
        result = prime * result + ((getGztfsj() == null) ? 0 : getGztfsj().hashCode());
        result = prime * result + ((getRyjfxs() == null) ? 0 : getRyjfxs().hashCode());
        result = prime * result + ((getRyglfs() == null) ? 0 : getRyglfs().hashCode());
        result = prime * result + ((getJhtgbl() == null) ? 0 : getJhtgbl().hashCode());
        result = prime * result + ((getSpdw() == null) ? 0 : getSpdw().hashCode());
        result = prime * result + ((getJzsj() == null) ? 0 : getJzsj().hashCode());
        result = prime * result + ((getZdglys() == null) ? 0 : getZdglys().hashCode());
        result = prime * result + ((getGzglys() == null) ? 0 : getGzglys().hashCode());
        result = prime * result + ((getYjzwlb() == null) ? 0 : getYjzwlb().hashCode());
        result = prime * result + ((getYjdzwdj() == null) ? 0 : getYjdzwdj().hashCode());
        result = prime * result + ((getJdldzwbz() == null) ? 0 : getJdldzwbz().hashCode());
        result = prime * result + ((getSggbbz() == null) ? 0 : getSggbbz().hashCode());
        result = prime * result + ((getYhbm1() == null) ? 0 : getYhbm1().hashCode());
        result = prime * result + ((getYhzh1() == null) ? 0 : getYhzh1().hashCode());
        result = prime * result + ((getYhbm2() == null) ? 0 : getYhbm2().hashCode());
        result = prime * result + ((getYhzh2() == null) ? 0 : getYhzh2().hashCode());
        result = prime * result + ((getRyxh() == null) ? 0 : getRyxh().hashCode());
        result = prime * result + ((getGwydjsj() == null) ? 0 : getGwydjsj().hashCode());
        result = prime * result + ((getRyhylb() == null) ? 0 : getRyhylb().hashCode());
        result = prime * result + ((getLxgl() == null) ? 0 : getLxgl().hashCode());
        result = prime * result + ((getGzgkbm() == null) ? 0 : getGzgkbm().hashCode());
        result = prime * result + ((getYskmbm() == null) ? 0 : getYskmbm().hashCode());
        result = prime * result + ((getGztfbz() == null) ? 0 : getGztfbz().hashCode());
        result = prime * result + ((getDasf() == null) ? 0 : getDasf().hashCode());
        result = prime * result + ((getSjsf() == null) ? 0 : getSjsf().hashCode());
        result = prime * result + ((getBzxz() == null) ? 0 : getBzxz().hashCode());
        result = prime * result + ((getGgqkhzd06() == null) ? 0 : getGgqkhzd06().hashCode());
        result = prime * result + ((getSffpdhxx() == null) ? 0 : getSffpdhxx().hashCode());
        result = prime * result + ((getGddcxj() == null) ? 0 : getGddcxj().hashCode());
        result = prime * result + ((getLdbz() == null) ? 0 : getLdbz().hashCode());
        result = prime * result + ((getSpbz() == null) ? 0 : getSpbz().hashCode());
        result = prime * result + ((getSpsj() == null) ? 0 : getSpsj().hashCode());
        result = prime * result + ((getZxspsj() == null) ? 0 : getZxspsj().hashCode());
        result = prime * result + ((getSpry() == null) ? 0 : getSpry().hashCode());
        result = prime * result + ((getGwydjbz() == null) ? 0 : getGwydjbz().hashCode());
        result = prime * result + ((getBy1() == null) ? 0 : getBy1().hashCode());
        result = prime * result + ((getBy2() == null) ? 0 : getBy2().hashCode());
        result = prime * result + ((getBy3() == null) ? 0 : getBy3().hashCode());
        result = prime * result + ((getBy4() == null) ? 0 : getBy4().hashCode());
        result = prime * result + ((getBy5() == null) ? 0 : getBy5().hashCode());
        result = prime * result + ((getBy6() == null) ? 0 : getBy6().hashCode());
        result = prime * result + ((getBy7() == null) ? 0 : getBy7().hashCode());
        result = prime * result + ((getBy8() == null) ? 0 : getBy8().hashCode());
        result = prime * result + ((getBy9() == null) ? 0 : getBy9().hashCode());
        result = prime * result + ((getBy10() == null) ? 0 : getBy10().hashCode());
        result = prime * result + ((getBy11() == null) ? 0 : getBy11().hashCode());
        result = prime * result + ((getBy12() == null) ? 0 : getBy12().hashCode());
        result = prime * result + ((getBy13() == null) ? 0 : getBy13().hashCode());
        result = prime * result + ((getBy14() == null) ? 0 : getBy14().hashCode());
        result = prime * result + ((getBy15() == null) ? 0 : getBy15().hashCode());
        result = prime * result + ((getBy16() == null) ? 0 : getBy16().hashCode());
        result = prime * result + ((getBy17() == null) ? 0 : getBy17().hashCode());
        result = prime * result + ((getBy18() == null) ? 0 : getBy18().hashCode());
        result = prime * result + ((getBy19() == null) ? 0 : getBy19().hashCode());
        result = prime * result + ((getBy20() == null) ? 0 : getBy20().hashCode());
        result = prime * result + ((getBy21() == null) ? 0 : getBy21().hashCode());
        result = prime * result + ((getBy22() == null) ? 0 : getBy22().hashCode());
        result = prime * result + ((getBy23() == null) ? 0 : getBy23().hashCode());
        result = prime * result + ((getRyid() == null) ? 0 : getRyid().hashCode());
        result = prime * result + ((getGrbh() == null) ? 0 : getGrbh().hashCode());
        result = prime * result + ((getYctxyy() == null) ? 0 : getYctxyy().hashCode());
        result = prime * result + ((getYtns() == null) ? 0 : getYtns().hashCode());
        result = prime * result + ((getYtys() == null) ? 0 : getYtys().hashCode());
        result = prime * result + ((getZgjzxspsj() == null) ? 0 : getZgjzxspsj().hashCode());
        result = prime * result + ((getZgjspsj() == null) ? 0 : getZgjspsj().hashCode());
        result = prime * result + ((getZgjspbz() == null) ? 0 : getZgjspbz().hashCode());
        result = prime * result + ((getZgjspry() == null) ? 0 : getZgjspry().hashCode());
        result = prime * result + ((getCsxggsj() == null) ? 0 : getCsxggsj().hashCode());
        result = prime * result + ((getBy24() == null) ? 0 : getBy24().hashCode());
        result = prime * result + ((getBy25() == null) ? 0 : getBy25().hashCode());
        result = prime * result + ((getBy26() == null) ? 0 : getBy26().hashCode());
        result = prime * result + ((getBy27() == null) ? 0 : getBy27().hashCode());
        result = prime * result + ((getBy28() == null) ? 0 : getBy28().hashCode());
        result = prime * result + ((getBy29() == null) ? 0 : getBy29().hashCode());
        result = prime * result + ((getBzxzSpr() == null) ? 0 : getBzxzSpr().hashCode());
        result = prime * result + ((getBzxzSpsj() == null) ? 0 : getBzxzSpsj().hashCode());
        result = prime * result + ((getBzxzSpbz() == null) ? 0 : getBzxzSpbz().hashCode());
        result = prime * result + ((getBzxzCznr() == null) ? 0 : getBzxzCznr().hashCode());
        result = prime * result + ((getBzxzYbzxz() == null) ? 0 : getBzxzYbzxz().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rybm=").append(rybm);
        sb.append(", dwbm=").append(dwbm);
        sb.append(", xm=").append(xm);
        sb.append(", bmbm=").append(bmbm);
        sb.append(", sex=").append(sex);
        sb.append(", sfzh=").append(sfzh);
        sb.append(", jg=").append(jg);
        sb.append(", mz=").append(mz);
        sb.append(", cjgzsj=").append(cjgzsj);
        sb.append(", csny=").append(csny);
        sb.append(", jrdwsj=").append(jrdwsj);
        sb.append(", jrdwyy=").append(jrdwyy);
        sb.append(", jrdwlx=").append(jrdwlx);
        sb.append(", gzsfbm=").append(gzsfbm);
        sb.append(", gwlx=").append(gwlx);
        sb.append(", zzmm=").append(zzmm);
        sb.append(", rdsj=").append(rdsj);
        sb.append(", zdgl=").append(zdgl);
        sb.append(", yjxl=").append(yjxl);
        sb.append(", djsj=").append(djsj);
        sb.append(", jssj=").append(jssj);
        sb.append(", ryzt=").append(ryzt);
        sb.append(", rybz=").append(rybz);
        sb.append(", lxglqssj=").append(lxglqssj);
        sb.append(", dlytny=").append(dlytny);
        sb.append(", dabh=").append(dabh);
        sb.append(", gzlxbm=").append(gzlxbm);
        sb.append(", jkbydqlb=").append(jkbydqlb);
        sb.append(", pgjzbz=").append(pgjzbz);
        sb.append(", gzqfsj=").append(gzqfsj);
        sb.append(", gztfsj=").append(gztfsj);
        sb.append(", ryjfxs=").append(ryjfxs);
        sb.append(", ryglfs=").append(ryglfs);
        sb.append(", jhtgbl=").append(jhtgbl);
        sb.append(", spdw=").append(spdw);
        sb.append(", jzsj=").append(jzsj);
        sb.append(", zdglys=").append(zdglys);
        sb.append(", gzglys=").append(gzglys);
        sb.append(", yjzwlb=").append(yjzwlb);
        sb.append(", yjdzwdj=").append(yjdzwdj);
        sb.append(", jdldzwbz=").append(jdldzwbz);
        sb.append(", sggbbz=").append(sggbbz);
        sb.append(", yhbm1=").append(yhbm1);
        sb.append(", yhzh1=").append(yhzh1);
        sb.append(", yhbm2=").append(yhbm2);
        sb.append(", yhzh2=").append(yhzh2);
        sb.append(", ryxh=").append(ryxh);
        sb.append(", gwydjsj=").append(gwydjsj);
        sb.append(", ryhylb=").append(ryhylb);
        sb.append(", lxgl=").append(lxgl);
        sb.append(", gzgkbm=").append(gzgkbm);
        sb.append(", yskmbm=").append(yskmbm);
        sb.append(", gztfbz=").append(gztfbz);
        sb.append(", dasf=").append(dasf);
        sb.append(", sjsf=").append(sjsf);
        sb.append(", bzxz=").append(bzxz);
        sb.append(", ggqkhzd06=").append(ggqkhzd06);
        sb.append(", sffpdhxx=").append(sffpdhxx);
        sb.append(", gddcxj=").append(gddcxj);
        sb.append(", ldbz=").append(ldbz);
        sb.append(", spbz=").append(spbz);
        sb.append(", spsj=").append(spsj);
        sb.append(", zxspsj=").append(zxspsj);
        sb.append(", spry=").append(spry);
        sb.append(", gwydjbz=").append(gwydjbz);
        sb.append(", by1=").append(by1);
        sb.append(", by2=").append(by2);
        sb.append(", by3=").append(by3);
        sb.append(", by4=").append(by4);
        sb.append(", by5=").append(by5);
        sb.append(", by6=").append(by6);
        sb.append(", by7=").append(by7);
        sb.append(", by8=").append(by8);
        sb.append(", by9=").append(by9);
        sb.append(", by10=").append(by10);
        sb.append(", by11=").append(by11);
        sb.append(", by12=").append(by12);
        sb.append(", by13=").append(by13);
        sb.append(", by14=").append(by14);
        sb.append(", by15=").append(by15);
        sb.append(", by16=").append(by16);
        sb.append(", by17=").append(by17);
        sb.append(", by18=").append(by18);
        sb.append(", by19=").append(by19);
        sb.append(", by20=").append(by20);
        sb.append(", by21=").append(by21);
        sb.append(", by22=").append(by22);
        sb.append(", by23=").append(by23);
        sb.append(", ryid=").append(ryid);
        sb.append(", grbh=").append(grbh);
        sb.append(", yctxyy=").append(yctxyy);
        sb.append(", ytns=").append(ytns);
        sb.append(", ytys=").append(ytys);
        sb.append(", zgjzxspsj=").append(zgjzxspsj);
        sb.append(", zgjspsj=").append(zgjspsj);
        sb.append(", zgjspbz=").append(zgjspbz);
        sb.append(", zgjspry=").append(zgjspry);
        sb.append(", csxggsj=").append(csxggsj);
        sb.append(", by24=").append(by24);
        sb.append(", by25=").append(by25);
        sb.append(", by26=").append(by26);
        sb.append(", by27=").append(by27);
        sb.append(", by28=").append(by28);
        sb.append(", by29=").append(by29);
        sb.append(", bzxzSpr=").append(bzxzSpr);
        sb.append(", bzxzSpsj=").append(bzxzSpsj);
        sb.append(", bzxzSpbz=").append(bzxzSpbz);
        sb.append(", bzxzCznr=").append(bzxzCznr);
        sb.append(", bzxzYbzxz=").append(bzxzYbzxz);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}