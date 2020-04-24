package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class CargoTransferBill implements Serializable {

    private static final long serialVersionUID = 5728557958158519867L;


    /**
     * 调拨单编号
     */
    private Integer ctbId;


    /**
     * 门店编号
     */
    private Integer storId;


    /**
     * 货物编号
     */
    private Integer commId;


    /**
     * 调货数量
     */
    private Integer ctbAmount;


    /**
     * 日期
     */
    private java.sql.Date ctbDate;


    /**
     * 调拨状态
     */
    private String isctb;

    /**
     * 调拨单编号
     */
    public Integer getctbId() {
        return this.ctbId;
    }


    /**
     * 调拨单编号
     */
    public void setctbId(Integer ctbId) {
        this.ctbId = ctbId;
    }

    /**
     * 门店编号
     */
    public Integer getstorId() {
        return this.storId;
    }


    /**
     * 门店编号
     */
    public void setstorId(Integer storId) {
        this.storId = storId;
    }

    /**
     * 货物编号
     */
    public Integer getcommId() {
        return this.commId;
    }


    /**
     * 货物编号
     */
    public void setcommId(Integer commId) {
        this.commId = commId;
    }

    /**
     * 调货数量
     */
    public Integer getctbAmount() {
        return this.ctbAmount;
    }


    /**
     * 调货数量
     */
    public void setctbAmount(Integer ctbAmount) {
        this.ctbAmount = ctbAmount;
    }

    /**
     * 日期
     */
    public java.sql.Date getctbDate() {
        return this.ctbDate;
    }


    /**
     * 日期
     */
    public void setctbDate(java.sql.Date ctbDate) {
        this.ctbDate = ctbDate;
    }

    /**
     * 调拨状态
     */
    public String getisctb() {
        return this.isctb;
    }


    /**
     * 调拨状态
     */
    public void setisctb(String isctb) {
        this.isctb = isctb;
    }
}
