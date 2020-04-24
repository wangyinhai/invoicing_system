package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class JxcGather implements Serializable {

	private static final long serialVersionUID = 4332224181637586930L;

  
    /**
     * 结账编号
     */
  private Integer jgId;

  
    /**
     * 结账日期
     */
  private java.sql.Date jgDate;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 上期结账数量
     */
  private Integer lastCheckoutAmount;

  
    /**
     * 上期结账金额
     */
  private Double lastCheckoutMoney;

  
    /**
     * 借方数量
     */
  private Integer debitAmount;

  
    /**
     * 借方金额
     */
  private Double debitMoney;

  
    /**
     * 贷方数量
     */
  private Integer creditAmount;

  
    /**
     * 贷方金额
     */
  private Double creditMoney;

  
    /**
     * 本期结存数量
     */
  private Integer nowCheckoutAmount;

  
    /**
     * 本期结存金额
     */
  private Double nowCheoutMoney;

  
    /**
     * 备注
     */
  private String jgDesc;

	  
    /**
     * 结账编号
     */
	public Integer getjgId() {
		return this.jgId;
	}

	  
    /**
     * 结账编号
     */
	public void setjgId(Integer jgId) {
		this.jgId = jgId;
	}
	  
    /**
     * 结账日期
     */
	public java.sql.Date getjgDate() {
		return this.jgDate;
	}

	  
    /**
     * 结账日期
     */
	public void setjgDate(java.sql.Date jgDate) {
		this.jgDate = jgDate;
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
     * 上期结账数量
     */
	public Integer getlastCheckoutAmount() {
		return this.lastCheckoutAmount;
	}

	  
    /**
     * 上期结账数量
     */
	public void setlastCheckoutAmount(Integer lastCheckoutAmount) {
		this.lastCheckoutAmount = lastCheckoutAmount;
	}
	  
    /**
     * 上期结账金额
     */
	public Double getlastCheckoutMoney() {
		return this.lastCheckoutMoney;
	}

	  
    /**
     * 上期结账金额
     */
	public void setlastCheckoutMoney(Double lastCheckoutMoney) {
		this.lastCheckoutMoney = lastCheckoutMoney;
	}
	  
    /**
     * 借方数量
     */
	public Integer getdebitAmount() {
		return this.debitAmount;
	}

	  
    /**
     * 借方数量
     */
	public void setdebitAmount(Integer debitAmount) {
		this.debitAmount = debitAmount;
	}
	  
    /**
     * 借方金额
     */
	public Double getdebitMoney() {
		return this.debitMoney;
	}

	  
    /**
     * 借方金额
     */
	public void setdebitMoney(Double debitMoney) {
		this.debitMoney = debitMoney;
	}
	  
    /**
     * 贷方数量
     */
	public Integer getcreditAmount() {
		return this.creditAmount;
	}

	  
    /**
     * 贷方数量
     */
	public void setcreditAmount(Integer creditAmount) {
		this.creditAmount = creditAmount;
	}
	  
    /**
     * 贷方金额
     */
	public Double getcreditMoney() {
		return this.creditMoney;
	}

	  
    /**
     * 贷方金额
     */
	public void setcreditMoney(Double creditMoney) {
		this.creditMoney = creditMoney;
	}
	  
    /**
     * 本期结存数量
     */
	public Integer getnowCheckoutAmount() {
		return this.nowCheckoutAmount;
	}

	  
    /**
     * 本期结存数量
     */
	public void setnowCheckoutAmount(Integer nowCheckoutAmount) {
		this.nowCheckoutAmount = nowCheckoutAmount;
	}
	  
    /**
     * 本期结存金额
     */
	public Double getnowCheoutMoney() {
		return this.nowCheoutMoney;
	}

	  
    /**
     * 本期结存金额
     */
	public void setnowCheoutMoney(Double nowCheoutMoney) {
		this.nowCheoutMoney = nowCheoutMoney;
	}
	  
    /**
     * 备注
     */
	public String getjgDesc() {
		return this.jgDesc;
	}

	  
    /**
     * 备注
     */
	public void setjgDesc(String jgDesc) {
		this.jgDesc = jgDesc;
	}
}
