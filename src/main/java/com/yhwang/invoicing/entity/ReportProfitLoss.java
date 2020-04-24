package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class ReportProfitLoss implements Serializable {

	private static final long serialVersionUID = 4581315096949611792L;

  
    /**
     * 报损报溢编号
     */
  private Integer rplId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 仓库编号
     */
  private Integer depoId;

  
    /**
     * 货物数量
     */
  private Integer rplAmount;

  
    /**
     * 货物金额
     */
  private Double rplMoney;

  
    /**
     * 制单日期
     */
  private java.sql.Date rplDate;

  
    /**
     * 责任人
     */
  private String dutyPerson;



	/**
     * 制单人
     */
	private String cbill;
	  
    /**
     * 报损报溢编号
     */
	public Integer getrplId() {
		return this.rplId;
	}

	  
    /**
     * 报损报溢编号
     */
	public void setrplId(Integer rplId) {
		this.rplId = rplId;
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
     * 仓库编号
     */
	public Integer getdepoId() {
		return this.depoId;
	}

	  
    /**
     * 仓库编号
     */
	public void setdepoId(Integer depoId) {
		this.depoId = depoId;
	}
	  
    /**
     * 货物数量
     */
	public Integer getrplAmount() {
		return this.rplAmount;
	}

	  
    /**
     * 货物数量
     */
	public void setrplAmount(Integer rplAmount) {
		this.rplAmount = rplAmount;
	}
	  
    /**
     * 货物金额
     */
	public Double getrplMoney() {
		return this.rplMoney;
	}

	  
    /**
     * 货物金额
     */
	public void setrplMoney(Double rplMoney) {
		this.rplMoney = rplMoney;
	}
	  
    /**
     * 制单日期
     */
	public java.sql.Date getrplDate() {
		return this.rplDate;
	}

	  
    /**
     * 制单日期
     */
	public void setrplDate(java.sql.Date rplDate) {
		this.rplDate = rplDate;
	}
	  
    /**
     * 责任人
     */
	public String getdutyPerson() {
		return this.dutyPerson;
	}

	  
    /**
     * 责任人
     */
	public void setdutyPerson(String dutyPerson) {
		this.dutyPerson = dutyPerson;
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
}
