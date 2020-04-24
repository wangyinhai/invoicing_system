package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class PurchaseContract implements Serializable {

	private static final long serialVersionUID = 7545252079190384375L;

  
    /**
     * 合同编号
     */
  private Integer pcId;

  
    /**
     * 供货商编号
     */
  private Integer suppId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 进价
     */
  private Double purcPrice;

  
    /**
     * 付款方式
     */
  private String pcPayMethod;

  
    /**
     * 账期
     */
  private String pcPayPeriod;

  
    /**
     * 签订日期
     */
  private java.time.LocalDateTime pcDate;

  
    /**
     * 合同期限
     */
  private String pcPeriod;

	  
    /**
     * 合同编号
     */
	public Integer getpcId() {
		return this.pcId;
	}

	  
    /**
     * 合同编号
     */
	public void setpcId(Integer pcId) {
		this.pcId = pcId;
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
     * 进价
     */
	public Double getpurcPrice() {
		return this.purcPrice;
	}

	  
    /**
     * 进价
     */
	public void setpurcPrice(Double purcPrice) {
		this.purcPrice = purcPrice;
	}
	  
    /**
     * 付款方式
     */
	public String getpcPayMethod() {
		return this.pcPayMethod;
	}

	  
    /**
     * 付款方式
     */
	public void setpcPayMethod(String pcPayMethod) {
		this.pcPayMethod = pcPayMethod;
	}
	  
    /**
     * 账期
     */
	public String getpcPayPeriod() {
		return this.pcPayPeriod;
	}

	  
    /**
     * 账期
     */
	public void setpcPayPeriod(String pcPayPeriod) {
		this.pcPayPeriod = pcPayPeriod;
	}
	  
    /**
     * 签订日期
     */
	public java.time.LocalDateTime getpcDate() {
		return this.pcDate;
	}

	  
    /**
     * 签订日期
     */
	public void setpcDate(java.time.LocalDateTime pcDate) {
		this.pcDate = pcDate;
	}
	  
    /**
     * 合同期限
     */
	public String getpcPeriod() {
		return this.pcPeriod;
	}

	  
    /**
     * 合同期限
     */
	public void setpcPeriod(String pcPeriod) {
		this.pcPeriod = pcPeriod;
	}
}
