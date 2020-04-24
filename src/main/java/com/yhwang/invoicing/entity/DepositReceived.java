package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class DepositReceived implements Serializable {

	private static final long serialVersionUID = 3449592809029494087L;

  
    /**
     * 预收款编号
     */
  private Integer drId;

  
    /**
     * 发票号
     */
  private Integer drInv;

  
    /**
     * 填票日期
     */
  private java.sql.Date drInvDate;

  
    /**
     * 客户编号
     */
  private Integer clieId;

  
    /**
     * 预收款总额
     */
  private Double drMoney;

  
    /**
     * 收款日期
     */
  private java.sql.Date drDate;

	  
    /**
     * 预收款编号
     */
	public Integer getdrId() {
		return this.drId;
	}

	  
    /**
     * 预收款编号
     */
	public void setdrId(Integer drId) {
		this.drId = drId;
	}
	  
    /**
     * 发票号
     */
	public Integer getdrInv() {
		return this.drInv;
	}

	  
    /**
     * 发票号
     */
	public void setdrInv(Integer drInv) {
		this.drInv = drInv;
	}
	  
    /**
     * 填票日期
     */
	public java.sql.Date getdrInvDate() {
		return this.drInvDate;
	}

	  
    /**
     * 填票日期
     */
	public void setdrInvDate(java.sql.Date drInvDate) {
		this.drInvDate = drInvDate;
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
     * 预收款总额
     */
	public Double getdrMoney() {
		return this.drMoney;
	}

	  
    /**
     * 预收款总额
     */
	public void setdrMoney(Double drMoney) {
		this.drMoney = drMoney;
	}
	  
    /**
     * 收款日期
     */
	public java.sql.Date getdrDate() {
		return this.drDate;
	}

	  
    /**
     * 收款日期
     */
	public void setdrDate(java.sql.Date drDate) {
		this.drDate = drDate;
	}
}
