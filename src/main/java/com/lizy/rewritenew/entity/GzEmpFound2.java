package com.lizy.rewritenew.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName GZ_EMP_FOUND2
 */
@TableName(value ="GZ_EMP_FOUND2")
@Data
public class GzEmpFound2 implements Serializable {
    /**
     * 
     */
    @TableId(value = "EMPLOYEEID")
    private String employeeid;

    /**
     * 
     */
    @TableId(value = "unitno")
    private String unitno;

    /**
     * 
     */
    @TableField(value = "EMPNAME")
    private String empname;

    /**
     * 
     */
    @TableField(value = "DEPNO")
    private String depno;

    /**
     * 
     */
    @TableField(value = "EMPNM")
    private String empnm;

    /**
     * 
     */
    @TableField(value = "SEX")
    private String sex;

    /**
     * 
     */
    @TableField(value = "INENTITY_NO")
    private String inentityNo;

    /**
     * 
     */
    @TableField(value = "NATIVEPLACE")
    private String nativeplace;

    /**
     * 
     */
    @TableField(value = "NATION_NO")
    private String nationNo;

    /**
     * 
     */
    @TableField(value = "WORKTIME")
    private String worktime;

    /**
     * 
     */
    @TableField(value = "BIRTHDAY")
    private String birthday;

    /**
     * 
     */
    @TableField(value = "ENTERTIME")
    private String entertime;

    /**
     * 
     */
    @TableField(value = "CAUSE_NO")
    private String causeNo;

    /**
     * 
     */
    @TableField(value = "CATANO")
    private String catano;

    /**
     * 
     */
    @TableField(value = "CATAFLAG")
    private String cataflag;

    /**
     * 
     */
    @TableField(value = "POLITIC")
    private String politic;

    /**
     * 
     */
    @TableField(value = "PARTYTIME")
    private String partytime;

    /**
     * 
     */
    @TableField(value = "INTERRUP")
    private Integer interrup;

    /**
     * 
     */
    @TableField(value = "EDU_YEAR")
    private Integer eduYear;

    /**
     * 
     */
    @TableField(value = "IN_MONEY")
    private Float inMoney;

    /**
     * 
     */
    @TableField(value = "RESERVED")
    private Float reserved;

    /**
     * 
     */
    @TableField(value = "ARMY_SAL")
    private Float armySal;

    /**
     * 
     */
    @TableField(value = "DECLEVELDATE")
    private String decleveldate;

    /**
     * 
     */
    @TableField(value = "CHGDATE")
    private String chgdate;

    /**
     * 
     */
    @TableField(value = "STATE")
    private String state;

    /**
     * 
     */
    @TableField(value = "SHENPSTATE")
    private String shenpstate;

    /**
     * 
     */
    @TableField(value = "SHENPNO")
    private String shenpno;

    /**
     * 
     */
    @TableField(value = "NOTE")
    private String note;

    /**
     * 
     */
    @TableField(value = "VCHAR1")
    private String vchar1;

    /**
     * 
     */
    @TableField(value = "VCHAR2")
    private String vchar2;

    /**
     * 
     */
    @TableField(value = "VARCHAR3")
    private String varchar3;

    /**
     * 
     */
    @TableField(value = "dan_id")
    private String danId;

    /**
     * 
     */
    @TableField(value = "rybz_id")
    private String rybzId;

    /**
     * 
     */
    @TableField(value = "gongzlx")
    private String gongzlx;

    /**
     * 
     */
    @TableField(value = "bianzlx")
    private String bianzlx;

    /**
     * 
     */
    @TableField(value = "zhengrjhkh")
    private String zhengrjhkh;

    /**
     * 
     */
    @TableField(value = "yonggxs")
    private String yonggxs;

    /**
     * 
     */
    @TableField(value = "renylyly")
    private String renylyly;

    /**
     * 
     */
    @TableField(value = "kuadybz")
    private String kuadybz;

    /**
     * 
     */
    @TableField(value = "renybz")
    private String renybz;

    /**
     * 
     */
    @TableField(value = "pgjz_bz")
    private String pgjzBz;

    /**
     * 
     */
    @TableField(value = "gongzffsj")
    private String gongzffsj;

    /**
     * 
     */
    @TableField(value = "gongztfsj")
    private String gongztfsj;

    /**
     * 
     */
    @TableField(value = "renyjfxs")
    private String renyjfxs;

    /**
     * 
     */
    @TableField(value = "renyxz")
    private String renyxz;

    /**
     * 
     */
    @TableField(value = "tigbl")
    private BigDecimal tigbl;

    /**
     * 
     */
    @TableField(value = "jiangjbl")
    private BigDecimal jiangjbl;

    /**
     * 
     */
    @TableField(value = "shenpdwfl")
    private String shenpdwfl;

    /**
     * 
     */
    @TableField(value = "xingzfl")
    private String xingzfl;

    /**
     * 
     */
    @TableField(value = "tuixsj")
    private String tuixsj;

    /**
     * 
     */
    @TableField(value = "tx_txfqssj")
    private String txTxfqssj;

    /**
     * 
     */
    @TableField(value = "tx_ltxlb")
    private String txLtxlb;

    /**
     * 
     */
    @TableField(value = "tx_txyy")
    private String txTxyy;

    /**
     * 
     */
    @TableField(value = "tx_gznx")
    private Integer txGznx;

    /**
     * 
     */
    @TableField(value = "tx_shenf")
    private String txShenf;

    /**
     * 
     */
    @TableField(value = "tx_zhiw")
    private String txZhiw;

    /**
     * 
     */
    @TableField(value = "tx_zhengzshdy")
    private String txZhengzshdy;

    /**
     * 
     */
    @TableField(value = "tx_zhiwdc")
    private String txZhiwdc;

    /**
     * 
     */
    @TableField(value = "tx_jib")
    private String txJib;

    /**
     * 
     */
    @TableField(value = "tx_jiaohl")
    private Integer txJiaohl;

    /**
     * 
     */
    @TableField(value = "tx_zhesbl")
    private BigDecimal txZhesbl;

    /**
     * 
     */
    @TableField(value = "tx_sczzsj")
    private String txSczzsj;

    /**
     * 
     */
    @TableField(value = "tx_xczzsj")
    private String txXczzsj;

    /**
     * 
     */
    @TableField(value = "tx_tesbz")
    private String txTesbz;

    /**
     * 
     */
    @TableField(value = "tx_zhongd")
    private Integer txZhongd;

    /**
     * 
     */
    @TableField(value = "yinhbm")
    private String yinhbm;

    /**
     * 
     */
    @TableField(value = "yinhzh")
    private String yinhzh;

    /**
     * 
     */
    @TableField(value = "tx_state")
    private String txState;

    /**
     * 
     */
    @TableField(value = "tx_shenpbz")
    private String txShenpbz;

    /**
     * 
     */
    @TableField(value = "reny_sort")
    private Integer renySort;

    /**
     * 
     */
    @TableField(value = "new_bz1")
    private String newBz1;

    /**
     * 
     */
    @TableField(value = "new_bz2")
    private String newBz2;

    /**
     * 
     */
    @TableField(value = "new_bz3")
    private String newBz3;

    /**
     * 
     */
    @TableField(value = "new_bz4")
    private String newBz4;

    /**
     * 
     */
    @TableField(value = "new_bz5")
    private String newBz5;

    /**
     * 
     */
    @TableField(value = "new_num_bz1")
    private BigDecimal newNumBz1;

    /**
     * 
     */
    @TableField(value = "new_num_bz2")
    private BigDecimal newNumBz2;

    /**
     * 
     */
    @TableField(value = "new_num_bz3")
    private BigDecimal newNumBz3;

    /**
     * 
     */
    @TableField(value = "gongzlbbm")
    private String gongzlbbm;

    /**
     * 
     */
    @TableField(value = "gongzxzbm")
    private String gongzxzbm;

    /**
     * 
     */
    @TableField(value = "giukbm")
    private String giukbm;

    /**
     * 
     */
    @TableField(value = "yskmbm")
    private String yskmbm;

    /**
     * 
     */
    @TableField(value = "gongztfbj")
    private String gongztfbj;

    /**
     * 
     */
    @TableField(value = "tesgx_qudsj")
    private String tesgxQudsj;

    /**
     * 
     */
    @TableField(value = "tesgx_zhixsj")
    private String tesgxZhixsj;

    /**
     * 
     */
    @TableField(value = "tesgx_bil")
    private BigDecimal tesgxBil;

    /**
     * 
     */
    @TableField(value = "tesgx_rongy")
    private String tesgxRongy;

    /**
     * 
     */
    @TableField(value = "tx_shiwyy")
    private String txShiwyy;

    /**
     * 
     */
    @TableField(value = "tx_shiwdd")
    private String txShiwdd;

    /**
     * 
     */
    @TableField(value = "tx_anzdd")
    private String txAnzdd;

    /**
     * 
     */
    @TableField(value = "tx_shifxsysbz")
    private String txShifxsysbz;

    /**
     * 
     */
    @TableField(value = "tx_shifls")
    private String txShifls;

    /**
     * 
     */
    @TableField(value = "employeeid_old")
    private String employeeidOld;

    /**
     * 
     */
    @TableField(value = "new_bz6")
    private String newBz6;

    /**
     * 
     */
    @TableField(value = "new_bz7")
    private String newBz7;

    /**
     * 
     */
    @TableField(value = "new_bz8")
    private String newBz8;

    /**
     * 
     */
    @TableField(value = "new_bz9")
    private String newBz9;

    /**
     * 
     */
    @TableField(value = "new_bz10")
    private String newBz10;

    /**
     * 
     */
    @TableField(value = "gongghzdnx")
    private Integer gongghzdnx;

    /**
     * 
     */
    @TableField(value = "kaohzd")
    private Integer kaohzd;

    /**
     * 
     */
    @TableField(value = "shenpreny")
    private String shenpreny;

    /**
     * 
     */
    @TableField(value = "is_fup")
    private String isFup;

    /**
     * 
     */
    @TableField(value = "gaoddc")
    private Integer gaoddc;

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
        GzEmpFound2 other = (GzEmpFound2) that;
        return (this.getEmployeeid() == null ? other.getEmployeeid() == null : this.getEmployeeid().equals(other.getEmployeeid()))
            && (this.getUnitno() == null ? other.getUnitno() == null : this.getUnitno().equals(other.getUnitno()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getDepno() == null ? other.getDepno() == null : this.getDepno().equals(other.getDepno()))
            && (this.getEmpnm() == null ? other.getEmpnm() == null : this.getEmpnm().equals(other.getEmpnm()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getInentityNo() == null ? other.getInentityNo() == null : this.getInentityNo().equals(other.getInentityNo()))
            && (this.getNativeplace() == null ? other.getNativeplace() == null : this.getNativeplace().equals(other.getNativeplace()))
            && (this.getNationNo() == null ? other.getNationNo() == null : this.getNationNo().equals(other.getNationNo()))
            && (this.getWorktime() == null ? other.getWorktime() == null : this.getWorktime().equals(other.getWorktime()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getEntertime() == null ? other.getEntertime() == null : this.getEntertime().equals(other.getEntertime()))
            && (this.getCauseNo() == null ? other.getCauseNo() == null : this.getCauseNo().equals(other.getCauseNo()))
            && (this.getCatano() == null ? other.getCatano() == null : this.getCatano().equals(other.getCatano()))
            && (this.getCataflag() == null ? other.getCataflag() == null : this.getCataflag().equals(other.getCataflag()))
            && (this.getPolitic() == null ? other.getPolitic() == null : this.getPolitic().equals(other.getPolitic()))
            && (this.getPartytime() == null ? other.getPartytime() == null : this.getPartytime().equals(other.getPartytime()))
            && (this.getInterrup() == null ? other.getInterrup() == null : this.getInterrup().equals(other.getInterrup()))
            && (this.getEduYear() == null ? other.getEduYear() == null : this.getEduYear().equals(other.getEduYear()))
            && (this.getInMoney() == null ? other.getInMoney() == null : this.getInMoney().equals(other.getInMoney()))
            && (this.getReserved() == null ? other.getReserved() == null : this.getReserved().equals(other.getReserved()))
            && (this.getArmySal() == null ? other.getArmySal() == null : this.getArmySal().equals(other.getArmySal()))
            && (this.getDecleveldate() == null ? other.getDecleveldate() == null : this.getDecleveldate().equals(other.getDecleveldate()))
            && (this.getChgdate() == null ? other.getChgdate() == null : this.getChgdate().equals(other.getChgdate()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getShenpstate() == null ? other.getShenpstate() == null : this.getShenpstate().equals(other.getShenpstate()))
            && (this.getShenpno() == null ? other.getShenpno() == null : this.getShenpno().equals(other.getShenpno()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getVchar1() == null ? other.getVchar1() == null : this.getVchar1().equals(other.getVchar1()))
            && (this.getVchar2() == null ? other.getVchar2() == null : this.getVchar2().equals(other.getVchar2()))
            && (this.getVarchar3() == null ? other.getVarchar3() == null : this.getVarchar3().equals(other.getVarchar3()))
            && (this.getDanId() == null ? other.getDanId() == null : this.getDanId().equals(other.getDanId()))
            && (this.getRybzId() == null ? other.getRybzId() == null : this.getRybzId().equals(other.getRybzId()))
            && (this.getGongzlx() == null ? other.getGongzlx() == null : this.getGongzlx().equals(other.getGongzlx()))
            && (this.getBianzlx() == null ? other.getBianzlx() == null : this.getBianzlx().equals(other.getBianzlx()))
            && (this.getZhengrjhkh() == null ? other.getZhengrjhkh() == null : this.getZhengrjhkh().equals(other.getZhengrjhkh()))
            && (this.getYonggxs() == null ? other.getYonggxs() == null : this.getYonggxs().equals(other.getYonggxs()))
            && (this.getRenylyly() == null ? other.getRenylyly() == null : this.getRenylyly().equals(other.getRenylyly()))
            && (this.getKuadybz() == null ? other.getKuadybz() == null : this.getKuadybz().equals(other.getKuadybz()))
            && (this.getRenybz() == null ? other.getRenybz() == null : this.getRenybz().equals(other.getRenybz()))
            && (this.getPgjzBz() == null ? other.getPgjzBz() == null : this.getPgjzBz().equals(other.getPgjzBz()))
            && (this.getGongzffsj() == null ? other.getGongzffsj() == null : this.getGongzffsj().equals(other.getGongzffsj()))
            && (this.getGongztfsj() == null ? other.getGongztfsj() == null : this.getGongztfsj().equals(other.getGongztfsj()))
            && (this.getRenyjfxs() == null ? other.getRenyjfxs() == null : this.getRenyjfxs().equals(other.getRenyjfxs()))
            && (this.getRenyxz() == null ? other.getRenyxz() == null : this.getRenyxz().equals(other.getRenyxz()))
            && (this.getTigbl() == null ? other.getTigbl() == null : this.getTigbl().equals(other.getTigbl()))
            && (this.getJiangjbl() == null ? other.getJiangjbl() == null : this.getJiangjbl().equals(other.getJiangjbl()))
            && (this.getShenpdwfl() == null ? other.getShenpdwfl() == null : this.getShenpdwfl().equals(other.getShenpdwfl()))
            && (this.getXingzfl() == null ? other.getXingzfl() == null : this.getXingzfl().equals(other.getXingzfl()))
            && (this.getTuixsj() == null ? other.getTuixsj() == null : this.getTuixsj().equals(other.getTuixsj()))
            && (this.getTxTxfqssj() == null ? other.getTxTxfqssj() == null : this.getTxTxfqssj().equals(other.getTxTxfqssj()))
            && (this.getTxLtxlb() == null ? other.getTxLtxlb() == null : this.getTxLtxlb().equals(other.getTxLtxlb()))
            && (this.getTxTxyy() == null ? other.getTxTxyy() == null : this.getTxTxyy().equals(other.getTxTxyy()))
            && (this.getTxGznx() == null ? other.getTxGznx() == null : this.getTxGznx().equals(other.getTxGznx()))
            && (this.getTxShenf() == null ? other.getTxShenf() == null : this.getTxShenf().equals(other.getTxShenf()))
            && (this.getTxZhiw() == null ? other.getTxZhiw() == null : this.getTxZhiw().equals(other.getTxZhiw()))
            && (this.getTxZhengzshdy() == null ? other.getTxZhengzshdy() == null : this.getTxZhengzshdy().equals(other.getTxZhengzshdy()))
            && (this.getTxZhiwdc() == null ? other.getTxZhiwdc() == null : this.getTxZhiwdc().equals(other.getTxZhiwdc()))
            && (this.getTxJib() == null ? other.getTxJib() == null : this.getTxJib().equals(other.getTxJib()))
            && (this.getTxJiaohl() == null ? other.getTxJiaohl() == null : this.getTxJiaohl().equals(other.getTxJiaohl()))
            && (this.getTxZhesbl() == null ? other.getTxZhesbl() == null : this.getTxZhesbl().equals(other.getTxZhesbl()))
            && (this.getTxSczzsj() == null ? other.getTxSczzsj() == null : this.getTxSczzsj().equals(other.getTxSczzsj()))
            && (this.getTxXczzsj() == null ? other.getTxXczzsj() == null : this.getTxXczzsj().equals(other.getTxXczzsj()))
            && (this.getTxTesbz() == null ? other.getTxTesbz() == null : this.getTxTesbz().equals(other.getTxTesbz()))
            && (this.getTxZhongd() == null ? other.getTxZhongd() == null : this.getTxZhongd().equals(other.getTxZhongd()))
            && (this.getYinhbm() == null ? other.getYinhbm() == null : this.getYinhbm().equals(other.getYinhbm()))
            && (this.getYinhzh() == null ? other.getYinhzh() == null : this.getYinhzh().equals(other.getYinhzh()))
            && (this.getTxState() == null ? other.getTxState() == null : this.getTxState().equals(other.getTxState()))
            && (this.getTxShenpbz() == null ? other.getTxShenpbz() == null : this.getTxShenpbz().equals(other.getTxShenpbz()))
            && (this.getRenySort() == null ? other.getRenySort() == null : this.getRenySort().equals(other.getRenySort()))
            && (this.getNewBz1() == null ? other.getNewBz1() == null : this.getNewBz1().equals(other.getNewBz1()))
            && (this.getNewBz2() == null ? other.getNewBz2() == null : this.getNewBz2().equals(other.getNewBz2()))
            && (this.getNewBz3() == null ? other.getNewBz3() == null : this.getNewBz3().equals(other.getNewBz3()))
            && (this.getNewBz4() == null ? other.getNewBz4() == null : this.getNewBz4().equals(other.getNewBz4()))
            && (this.getNewBz5() == null ? other.getNewBz5() == null : this.getNewBz5().equals(other.getNewBz5()))
            && (this.getNewNumBz1() == null ? other.getNewNumBz1() == null : this.getNewNumBz1().equals(other.getNewNumBz1()))
            && (this.getNewNumBz2() == null ? other.getNewNumBz2() == null : this.getNewNumBz2().equals(other.getNewNumBz2()))
            && (this.getNewNumBz3() == null ? other.getNewNumBz3() == null : this.getNewNumBz3().equals(other.getNewNumBz3()))
            && (this.getGongzlbbm() == null ? other.getGongzlbbm() == null : this.getGongzlbbm().equals(other.getGongzlbbm()))
            && (this.getGongzxzbm() == null ? other.getGongzxzbm() == null : this.getGongzxzbm().equals(other.getGongzxzbm()))
            && (this.getGiukbm() == null ? other.getGiukbm() == null : this.getGiukbm().equals(other.getGiukbm()))
            && (this.getYskmbm() == null ? other.getYskmbm() == null : this.getYskmbm().equals(other.getYskmbm()))
            && (this.getGongztfbj() == null ? other.getGongztfbj() == null : this.getGongztfbj().equals(other.getGongztfbj()))
            && (this.getTesgxQudsj() == null ? other.getTesgxQudsj() == null : this.getTesgxQudsj().equals(other.getTesgxQudsj()))
            && (this.getTesgxZhixsj() == null ? other.getTesgxZhixsj() == null : this.getTesgxZhixsj().equals(other.getTesgxZhixsj()))
            && (this.getTesgxBil() == null ? other.getTesgxBil() == null : this.getTesgxBil().equals(other.getTesgxBil()))
            && (this.getTesgxRongy() == null ? other.getTesgxRongy() == null : this.getTesgxRongy().equals(other.getTesgxRongy()))
            && (this.getTxShiwyy() == null ? other.getTxShiwyy() == null : this.getTxShiwyy().equals(other.getTxShiwyy()))
            && (this.getTxShiwdd() == null ? other.getTxShiwdd() == null : this.getTxShiwdd().equals(other.getTxShiwdd()))
            && (this.getTxAnzdd() == null ? other.getTxAnzdd() == null : this.getTxAnzdd().equals(other.getTxAnzdd()))
            && (this.getTxShifxsysbz() == null ? other.getTxShifxsysbz() == null : this.getTxShifxsysbz().equals(other.getTxShifxsysbz()))
            && (this.getTxShifls() == null ? other.getTxShifls() == null : this.getTxShifls().equals(other.getTxShifls()))
            && (this.getEmployeeidOld() == null ? other.getEmployeeidOld() == null : this.getEmployeeidOld().equals(other.getEmployeeidOld()))
            && (this.getNewBz6() == null ? other.getNewBz6() == null : this.getNewBz6().equals(other.getNewBz6()))
            && (this.getNewBz7() == null ? other.getNewBz7() == null : this.getNewBz7().equals(other.getNewBz7()))
            && (this.getNewBz8() == null ? other.getNewBz8() == null : this.getNewBz8().equals(other.getNewBz8()))
            && (this.getNewBz9() == null ? other.getNewBz9() == null : this.getNewBz9().equals(other.getNewBz9()))
            && (this.getNewBz10() == null ? other.getNewBz10() == null : this.getNewBz10().equals(other.getNewBz10()))
            && (this.getGongghzdnx() == null ? other.getGongghzdnx() == null : this.getGongghzdnx().equals(other.getGongghzdnx()))
            && (this.getKaohzd() == null ? other.getKaohzd() == null : this.getKaohzd().equals(other.getKaohzd()))
            && (this.getShenpreny() == null ? other.getShenpreny() == null : this.getShenpreny().equals(other.getShenpreny()))
            && (this.getIsFup() == null ? other.getIsFup() == null : this.getIsFup().equals(other.getIsFup()))
            && (this.getGaoddc() == null ? other.getGaoddc() == null : this.getGaoddc().equals(other.getGaoddc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeid() == null) ? 0 : getEmployeeid().hashCode());
        result = prime * result + ((getUnitno() == null) ? 0 : getUnitno().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getDepno() == null) ? 0 : getDepno().hashCode());
        result = prime * result + ((getEmpnm() == null) ? 0 : getEmpnm().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getInentityNo() == null) ? 0 : getInentityNo().hashCode());
        result = prime * result + ((getNativeplace() == null) ? 0 : getNativeplace().hashCode());
        result = prime * result + ((getNationNo() == null) ? 0 : getNationNo().hashCode());
        result = prime * result + ((getWorktime() == null) ? 0 : getWorktime().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getEntertime() == null) ? 0 : getEntertime().hashCode());
        result = prime * result + ((getCauseNo() == null) ? 0 : getCauseNo().hashCode());
        result = prime * result + ((getCatano() == null) ? 0 : getCatano().hashCode());
        result = prime * result + ((getCataflag() == null) ? 0 : getCataflag().hashCode());
        result = prime * result + ((getPolitic() == null) ? 0 : getPolitic().hashCode());
        result = prime * result + ((getPartytime() == null) ? 0 : getPartytime().hashCode());
        result = prime * result + ((getInterrup() == null) ? 0 : getInterrup().hashCode());
        result = prime * result + ((getEduYear() == null) ? 0 : getEduYear().hashCode());
        result = prime * result + ((getInMoney() == null) ? 0 : getInMoney().hashCode());
        result = prime * result + ((getReserved() == null) ? 0 : getReserved().hashCode());
        result = prime * result + ((getArmySal() == null) ? 0 : getArmySal().hashCode());
        result = prime * result + ((getDecleveldate() == null) ? 0 : getDecleveldate().hashCode());
        result = prime * result + ((getChgdate() == null) ? 0 : getChgdate().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getShenpstate() == null) ? 0 : getShenpstate().hashCode());
        result = prime * result + ((getShenpno() == null) ? 0 : getShenpno().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getVchar1() == null) ? 0 : getVchar1().hashCode());
        result = prime * result + ((getVchar2() == null) ? 0 : getVchar2().hashCode());
        result = prime * result + ((getVarchar3() == null) ? 0 : getVarchar3().hashCode());
        result = prime * result + ((getDanId() == null) ? 0 : getDanId().hashCode());
        result = prime * result + ((getRybzId() == null) ? 0 : getRybzId().hashCode());
        result = prime * result + ((getGongzlx() == null) ? 0 : getGongzlx().hashCode());
        result = prime * result + ((getBianzlx() == null) ? 0 : getBianzlx().hashCode());
        result = prime * result + ((getZhengrjhkh() == null) ? 0 : getZhengrjhkh().hashCode());
        result = prime * result + ((getYonggxs() == null) ? 0 : getYonggxs().hashCode());
        result = prime * result + ((getRenylyly() == null) ? 0 : getRenylyly().hashCode());
        result = prime * result + ((getKuadybz() == null) ? 0 : getKuadybz().hashCode());
        result = prime * result + ((getRenybz() == null) ? 0 : getRenybz().hashCode());
        result = prime * result + ((getPgjzBz() == null) ? 0 : getPgjzBz().hashCode());
        result = prime * result + ((getGongzffsj() == null) ? 0 : getGongzffsj().hashCode());
        result = prime * result + ((getGongztfsj() == null) ? 0 : getGongztfsj().hashCode());
        result = prime * result + ((getRenyjfxs() == null) ? 0 : getRenyjfxs().hashCode());
        result = prime * result + ((getRenyxz() == null) ? 0 : getRenyxz().hashCode());
        result = prime * result + ((getTigbl() == null) ? 0 : getTigbl().hashCode());
        result = prime * result + ((getJiangjbl() == null) ? 0 : getJiangjbl().hashCode());
        result = prime * result + ((getShenpdwfl() == null) ? 0 : getShenpdwfl().hashCode());
        result = prime * result + ((getXingzfl() == null) ? 0 : getXingzfl().hashCode());
        result = prime * result + ((getTuixsj() == null) ? 0 : getTuixsj().hashCode());
        result = prime * result + ((getTxTxfqssj() == null) ? 0 : getTxTxfqssj().hashCode());
        result = prime * result + ((getTxLtxlb() == null) ? 0 : getTxLtxlb().hashCode());
        result = prime * result + ((getTxTxyy() == null) ? 0 : getTxTxyy().hashCode());
        result = prime * result + ((getTxGznx() == null) ? 0 : getTxGznx().hashCode());
        result = prime * result + ((getTxShenf() == null) ? 0 : getTxShenf().hashCode());
        result = prime * result + ((getTxZhiw() == null) ? 0 : getTxZhiw().hashCode());
        result = prime * result + ((getTxZhengzshdy() == null) ? 0 : getTxZhengzshdy().hashCode());
        result = prime * result + ((getTxZhiwdc() == null) ? 0 : getTxZhiwdc().hashCode());
        result = prime * result + ((getTxJib() == null) ? 0 : getTxJib().hashCode());
        result = prime * result + ((getTxJiaohl() == null) ? 0 : getTxJiaohl().hashCode());
        result = prime * result + ((getTxZhesbl() == null) ? 0 : getTxZhesbl().hashCode());
        result = prime * result + ((getTxSczzsj() == null) ? 0 : getTxSczzsj().hashCode());
        result = prime * result + ((getTxXczzsj() == null) ? 0 : getTxXczzsj().hashCode());
        result = prime * result + ((getTxTesbz() == null) ? 0 : getTxTesbz().hashCode());
        result = prime * result + ((getTxZhongd() == null) ? 0 : getTxZhongd().hashCode());
        result = prime * result + ((getYinhbm() == null) ? 0 : getYinhbm().hashCode());
        result = prime * result + ((getYinhzh() == null) ? 0 : getYinhzh().hashCode());
        result = prime * result + ((getTxState() == null) ? 0 : getTxState().hashCode());
        result = prime * result + ((getTxShenpbz() == null) ? 0 : getTxShenpbz().hashCode());
        result = prime * result + ((getRenySort() == null) ? 0 : getRenySort().hashCode());
        result = prime * result + ((getNewBz1() == null) ? 0 : getNewBz1().hashCode());
        result = prime * result + ((getNewBz2() == null) ? 0 : getNewBz2().hashCode());
        result = prime * result + ((getNewBz3() == null) ? 0 : getNewBz3().hashCode());
        result = prime * result + ((getNewBz4() == null) ? 0 : getNewBz4().hashCode());
        result = prime * result + ((getNewBz5() == null) ? 0 : getNewBz5().hashCode());
        result = prime * result + ((getNewNumBz1() == null) ? 0 : getNewNumBz1().hashCode());
        result = prime * result + ((getNewNumBz2() == null) ? 0 : getNewNumBz2().hashCode());
        result = prime * result + ((getNewNumBz3() == null) ? 0 : getNewNumBz3().hashCode());
        result = prime * result + ((getGongzlbbm() == null) ? 0 : getGongzlbbm().hashCode());
        result = prime * result + ((getGongzxzbm() == null) ? 0 : getGongzxzbm().hashCode());
        result = prime * result + ((getGiukbm() == null) ? 0 : getGiukbm().hashCode());
        result = prime * result + ((getYskmbm() == null) ? 0 : getYskmbm().hashCode());
        result = prime * result + ((getGongztfbj() == null) ? 0 : getGongztfbj().hashCode());
        result = prime * result + ((getTesgxQudsj() == null) ? 0 : getTesgxQudsj().hashCode());
        result = prime * result + ((getTesgxZhixsj() == null) ? 0 : getTesgxZhixsj().hashCode());
        result = prime * result + ((getTesgxBil() == null) ? 0 : getTesgxBil().hashCode());
        result = prime * result + ((getTesgxRongy() == null) ? 0 : getTesgxRongy().hashCode());
        result = prime * result + ((getTxShiwyy() == null) ? 0 : getTxShiwyy().hashCode());
        result = prime * result + ((getTxShiwdd() == null) ? 0 : getTxShiwdd().hashCode());
        result = prime * result + ((getTxAnzdd() == null) ? 0 : getTxAnzdd().hashCode());
        result = prime * result + ((getTxShifxsysbz() == null) ? 0 : getTxShifxsysbz().hashCode());
        result = prime * result + ((getTxShifls() == null) ? 0 : getTxShifls().hashCode());
        result = prime * result + ((getEmployeeidOld() == null) ? 0 : getEmployeeidOld().hashCode());
        result = prime * result + ((getNewBz6() == null) ? 0 : getNewBz6().hashCode());
        result = prime * result + ((getNewBz7() == null) ? 0 : getNewBz7().hashCode());
        result = prime * result + ((getNewBz8() == null) ? 0 : getNewBz8().hashCode());
        result = prime * result + ((getNewBz9() == null) ? 0 : getNewBz9().hashCode());
        result = prime * result + ((getNewBz10() == null) ? 0 : getNewBz10().hashCode());
        result = prime * result + ((getGongghzdnx() == null) ? 0 : getGongghzdnx().hashCode());
        result = prime * result + ((getKaohzd() == null) ? 0 : getKaohzd().hashCode());
        result = prime * result + ((getShenpreny() == null) ? 0 : getShenpreny().hashCode());
        result = prime * result + ((getIsFup() == null) ? 0 : getIsFup().hashCode());
        result = prime * result + ((getGaoddc() == null) ? 0 : getGaoddc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeid=").append(employeeid);
        sb.append(", unitno=").append(unitno);
        sb.append(", empname=").append(empname);
        sb.append(", depno=").append(depno);
        sb.append(", empnm=").append(empnm);
        sb.append(", sex=").append(sex);
        sb.append(", inentityNo=").append(inentityNo);
        sb.append(", nativeplace=").append(nativeplace);
        sb.append(", nationNo=").append(nationNo);
        sb.append(", worktime=").append(worktime);
        sb.append(", birthday=").append(birthday);
        sb.append(", entertime=").append(entertime);
        sb.append(", causeNo=").append(causeNo);
        sb.append(", catano=").append(catano);
        sb.append(", cataflag=").append(cataflag);
        sb.append(", politic=").append(politic);
        sb.append(", partytime=").append(partytime);
        sb.append(", interrup=").append(interrup);
        sb.append(", eduYear=").append(eduYear);
        sb.append(", inMoney=").append(inMoney);
        sb.append(", reserved=").append(reserved);
        sb.append(", armySal=").append(armySal);
        sb.append(", decleveldate=").append(decleveldate);
        sb.append(", chgdate=").append(chgdate);
        sb.append(", state=").append(state);
        sb.append(", shenpstate=").append(shenpstate);
        sb.append(", shenpno=").append(shenpno);
        sb.append(", note=").append(note);
        sb.append(", vchar1=").append(vchar1);
        sb.append(", vchar2=").append(vchar2);
        sb.append(", varchar3=").append(varchar3);
        sb.append(", danId=").append(danId);
        sb.append(", rybzId=").append(rybzId);
        sb.append(", gongzlx=").append(gongzlx);
        sb.append(", bianzlx=").append(bianzlx);
        sb.append(", zhengrjhkh=").append(zhengrjhkh);
        sb.append(", yonggxs=").append(yonggxs);
        sb.append(", renylyly=").append(renylyly);
        sb.append(", kuadybz=").append(kuadybz);
        sb.append(", renybz=").append(renybz);
        sb.append(", pgjzBz=").append(pgjzBz);
        sb.append(", gongzffsj=").append(gongzffsj);
        sb.append(", gongztfsj=").append(gongztfsj);
        sb.append(", renyjfxs=").append(renyjfxs);
        sb.append(", renyxz=").append(renyxz);
        sb.append(", tigbl=").append(tigbl);
        sb.append(", jiangjbl=").append(jiangjbl);
        sb.append(", shenpdwfl=").append(shenpdwfl);
        sb.append(", xingzfl=").append(xingzfl);
        sb.append(", tuixsj=").append(tuixsj);
        sb.append(", txTxfqssj=").append(txTxfqssj);
        sb.append(", txLtxlb=").append(txLtxlb);
        sb.append(", txTxyy=").append(txTxyy);
        sb.append(", txGznx=").append(txGznx);
        sb.append(", txShenf=").append(txShenf);
        sb.append(", txZhiw=").append(txZhiw);
        sb.append(", txZhengzshdy=").append(txZhengzshdy);
        sb.append(", txZhiwdc=").append(txZhiwdc);
        sb.append(", txJib=").append(txJib);
        sb.append(", txJiaohl=").append(txJiaohl);
        sb.append(", txZhesbl=").append(txZhesbl);
        sb.append(", txSczzsj=").append(txSczzsj);
        sb.append(", txXczzsj=").append(txXczzsj);
        sb.append(", txTesbz=").append(txTesbz);
        sb.append(", txZhongd=").append(txZhongd);
        sb.append(", yinhbm=").append(yinhbm);
        sb.append(", yinhzh=").append(yinhzh);
        sb.append(", txState=").append(txState);
        sb.append(", txShenpbz=").append(txShenpbz);
        sb.append(", renySort=").append(renySort);
        sb.append(", newBz1=").append(newBz1);
        sb.append(", newBz2=").append(newBz2);
        sb.append(", newBz3=").append(newBz3);
        sb.append(", newBz4=").append(newBz4);
        sb.append(", newBz5=").append(newBz5);
        sb.append(", newNumBz1=").append(newNumBz1);
        sb.append(", newNumBz2=").append(newNumBz2);
        sb.append(", newNumBz3=").append(newNumBz3);
        sb.append(", gongzlbbm=").append(gongzlbbm);
        sb.append(", gongzxzbm=").append(gongzxzbm);
        sb.append(", giukbm=").append(giukbm);
        sb.append(", yskmbm=").append(yskmbm);
        sb.append(", gongztfbj=").append(gongztfbj);
        sb.append(", tesgxQudsj=").append(tesgxQudsj);
        sb.append(", tesgxZhixsj=").append(tesgxZhixsj);
        sb.append(", tesgxBil=").append(tesgxBil);
        sb.append(", tesgxRongy=").append(tesgxRongy);
        sb.append(", txShiwyy=").append(txShiwyy);
        sb.append(", txShiwdd=").append(txShiwdd);
        sb.append(", txAnzdd=").append(txAnzdd);
        sb.append(", txShifxsysbz=").append(txShifxsysbz);
        sb.append(", txShifls=").append(txShifls);
        sb.append(", employeeidOld=").append(employeeidOld);
        sb.append(", newBz6=").append(newBz6);
        sb.append(", newBz7=").append(newBz7);
        sb.append(", newBz8=").append(newBz8);
        sb.append(", newBz9=").append(newBz9);
        sb.append(", newBz10=").append(newBz10);
        sb.append(", gongghzdnx=").append(gongghzdnx);
        sb.append(", kaohzd=").append(kaohzd);
        sb.append(", shenpreny=").append(shenpreny);
        sb.append(", isFup=").append(isFup);
        sb.append(", gaoddc=").append(gaoddc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}