package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class PurchaseInBill implements Serializable {

    private static final long serialVersionUID = 7146124824044325640L;


    /**
     * 进货单编号
     */
    private Integer pibId;


    /**
     * 供货商编号
     */
    private Integer suppId;


    /**
     * 进货日期
     */
    private java.time.LocalDateTime pibDate;


    /**
     * 业务员编号
     */
    private Integer operId;


    /**
     * 制单人
     */
    private String cbill;


    /**
     * 验收员
     */
    private String inspector;


    /**
     * 保管员
     */
    private String keeper;

    /**
     * 进货单编号
     */
    public Integer getpibId() {
        return this.pibId;
    }


    /**
     * 进货单编号
     */
    public void setpibId(Integer pibId) {
        this.pibId = pibId;
    }

    /**
     * 供货商编号
     */
    public Integer getsuppId() {
        return this.suppId;
    }


    /**
     * 供货商编号
     */
    public void setsuppId(Integer suppId) {
        this.suppId = suppId;
    }

    /**
     * 进货日期
     */
    public java.time.LocalDateTime getpibDate() {
        return this.pibDate;
    }


    /**
     * 进货日期
     */
    public void setpibDate(java.time.LocalDateTime pibDate) {
        this.pibDate = pibDate;
    }

    /**
     * 业务员编号
     */
    public Integer getoperId() {
        return this.operId;
    }


    /**
     * 业务员编号
     */
    public void setoperId(Integer operId) {
        this.operId = operId;
    }

    /**
     * 制单人
     */
    public String getcbill() {
        return this.cbill;
    }


    /**
     * 制单人
     */
    public void setcbill(String cbill) {
        this.cbill = cbill;
    }

    /**
     * 验收员
     */
    public String getinspector() {
        return this.inspector;
    }


    /**
     * 验收员
     */
    public void setinspector(String inspector) {
        this.inspector = inspector;
    }

    /**
     * 保管员
     */
    public String getkeeper() {
        return this.keeper;
    }


    /**
     * 保管员
     */
    public void setkeeper(String keeper) {
        this.keeper = keeper;
    }
}
