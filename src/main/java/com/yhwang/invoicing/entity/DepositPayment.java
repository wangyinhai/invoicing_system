package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class DepositPayment implements Serializable {

	private static final long serialVersionUID = 1283285078980225455L;

  
    /**
     * 预付款编号
     */
  private Integer dpId;

  
    /**
     * 发票号
     */
  private Integer dpInv;

  
    /**
     * 填票日期
     */
  private java.sql.Date dpInvDate;

  
    /**
     * 客户编号
     */
  private Integer clieId;

  
    /**
     * 预付款总额
     */
  private Double dpMoney;

  
    /**
     * 付款日期
     */
  private java.sql.Date dpDate;

	  
    /**
     * 预付款编号
     */
	public Integer getdpId() {
		return this.dpId;
	}

	  
    /**
     * 预付款编号
     */
	public void setdpId(Integer dpId) {
		this.dpId = dpId;
	}
	  
    /**
     * 发票号
     */
	public Integer getdpInv() {
		return this.dpInv;
	}

	  
    /**
     * 发票号
     */
	public void setdpInv(Integer dpInv) {
		this.dpInv = dpInv;
	}
	  
    /**
     * 填票日期
     */
	public java.sql.Date getdpInvDate() {
		return this.dpInvDate;
	}

	  
    /**
     * 填票日期
     */
	public void setdpInvDate(java.sql.Date dpInvDate) {
		this.dpInvDate = dpInvDate;
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
     * 预付款总额
     */
	public Double getdpMoney() {
		return this.dpMoney;
	}

	  
    /**
     * 预付款总额
     */
	public void setdpMoney(Double dpMoney) {
		this.dpMoney = dpMoney;
	}
	  
    /**
     * 付款日期
     */
	public java.sql.Date getdpDate() {
		return this.dpDate;
	}

	  
    /**
     * 付款日期
     */
	public void setdpDate(java.sql.Date dpDate) {
		this.dpDate = dpDate;
	}
}
