package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class AccountReceviable implements Serializable {

    private static final long serialVersionUID = 3945434089827905946L;


    /**
     * 应付款编号
     */
    private Integer arId;


    /**
     * 发票号
     */
    private Integer arInv;


    /**
     * 填票日期
     */
    private java.sql.Date arInvDate;


    /**
     * 销售单编号
     */
    private Integer soId;


    /**
     * 货物编号
     */
    private Integer commId;


    /**
     * 客户编号
     */
    private Integer clieId;


    /**
     * 数量
     */
    private Integer arCommAmount;


    /**
     * 销售价
     */
    private Double arSalePrice;


    /**
     * 应收款金额
     */
    private Double arMoney;


    /**
     * 收款日期
     */
    private java.sql.Date arDate;


    /**
     * 详细说明
     */
    private String arDesc;


    /**
     * 销售日期
     */
    private java.sql.Date arSaleDate;


    /**
     * 状态
     */
    private Integer isar;

    /**
     * （减）预收
     */
    private Integer drId;


    /**
     * 应付款编号
     */
    public Integer getarId() {
        return this.arId;
    }


    /**
     * 应付款编号
     */
    public void setarId(Integer arId) {
        this.arId = arId;
    }

    /**
     * 发票号
     */
    public Integer getarInv() {
        return this.arInv;
    }


    /**
     * 发票号
     */
    public void setarInv(Integer arInv) {
        this.arInv = arInv;
    }

    /**
     * 填票日期
     */
    public java.sql.Date getarInvDate() {
        return this.arInvDate;
    }


    /**
     * 填票日期
     */
    public void setarInvDate(java.sql.Date arInvDate) {
        this.arInvDate = arInvDate;
    }

    /**
     * 销售单编号
     */
    public Integer getsoId() {
        return this.soId;
    }


    /**
     * 销售单编号
     */
    public void setsoId(Integer soId) {
        this.soId = soId;
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
     * 客户编号
     */
    public Integer getclieId() {
        return this.clieId;
    }


    /**
     * 客户编号
     */
    public void setclieId(Integer clieId) {
        this.clieId = clieId;
    }

    /**
     * 数量
     */
    public Integer getarCommAmount() {
        return this.arCommAmount;
    }


    /**
     * 数量
     */
    public void setarCommAmount(Integer arCommAmount) {
        this.arCommAmount = arCommAmount;
    }

    /**
     * 销售价
     */
    public Double getarSalePrice() {
        return this.arSalePrice;
    }


    /**
     * 销售价
     */
    public void setarSalePrice(Double arSalePrice) {
        this.arSalePrice = arSalePrice;
    }

    /**
     * 应收款金额
     */
    public Double getarMoney() {
        return this.arMoney;
    }


    /**
     * 应收款金额
     */
    public void setarMoney(Double arMoney) {
        this.arMoney = arMoney;
    }

    /**
     * 收款日期
     */
    public java.sql.Date getarDate() {
        return this.arDate;
    }


    /**
     * 收款日期
     */
    public void setarDate(java.sql.Date arDate) {
        this.arDate = arDate;
    }

    /**
     * 详细说明
     */
    public String getarDesc() {
        return this.arDesc;
    }


    /**
     * 详细说明
     */
    public void setarDesc(String arDesc) {
        this.arDesc = arDesc;
    }

    /**
     * 销售日期
     */
    public java.sql.Date getarSaleDate() {
        return this.arSaleDate;
    }


    /**
     * 销售日期
     */
    public void setarSaleDate(java.sql.Date arSaleDate) {
        this.arSaleDate = arSaleDate;
    }

    /**
     * 状态
     */
    public Integer getisar() {
        return this.isar;
    }


    /**
     * 状态
     */
    public void setisar(Integer isar) {
        this.isar = isar;
    }

    /**
     * （减）预收
     */
    public Integer getdrId() {
        return this.drId;
    }


    /**
     * （减）预收
     */
    public void setdrId(Integer drId) {
        this.drId = drId;
    }
}
