package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class SaleOrder implements Serializable {

	private static final long serialVersionUID = 3565814219727664402L;

  
    /**
     * 销售订单编号
     */
  private Integer soId;

  
    /**
     * 客户编号
     */
  private Integer clieId;

  
    /**
     * 销售日期
     */
  private java.sql.Date soDate;

  
    /**
     * 有效起日
     */
  private java.sql.Date soBegainDate;

  
    /**
     * 有效止日
     */
  private java.sql.Date soEndDate;

  
    /**
     * 业务员编号
     */
  private Integer operId;



	/**
     * 制单人
     */
	private String cbill;
	  
    /**
     * 销售订单编号
     */
	public Integer getsoId() {
		return this.soId;
	}

	  
    /**
     * 销售订单编号
     */
	public void setsoId(Integer soId) {
		this.soId = soId;
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
     * 销售日期
     */
	public java.sql.Date getsoDate() {
		return this.soDate;
	}

	  
    /**
     * 销售日期
     */
	public void setsoDate(java.sql.Date soDate) {
		this.soDate = soDate;
	}
	  
    /**
     * 有效起日
     */
	public java.sql.Date getsoBegainDate() {
		return this.soBegainDate;
	}

	  
    /**
     * 有效起日
     */
	public void setsoBegainDate(java.sql.Date soBegainDate) {
		this.soBegainDate = soBegainDate;
	}
	  
    /**
     * 有效止日
     */
	public java.sql.Date getsoEndDate() {
		return this.soEndDate;
	}

	  
    /**
     * 有效止日
     */
	public void setsoEndDate(java.sql.Date soEndDate) {
		this.soEndDate = soEndDate;
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
}
