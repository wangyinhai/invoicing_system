package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class PurchaseOrder implements Serializable {

	private static final long serialVersionUID = 1635568108760580911L;

  
    /**
     * 订单编号
     */
  private Integer poId;

  
    /**
     * 供货商编号
     */
  private Integer suppId;

  
    /**
     * 订货日期
     */
  private java.time.LocalDateTime poDate;

  
    /**
     * 有效起日
     */
  private java.time.LocalDateTime poBegainDate;

  
    /**
     * 有效止日
     */
  private java.time.LocalDateTime poEndDate;

  
    /**
     * 业务员编号
     */
  private Integer operId;



	/**
     * 制单人
     */
	private String cbill;
	  
    /**
     * 订单编号
     */
	public Integer getpoId() {
		return this.poId;
	}

	  
    /**
     * 订单编号
     */
	public void setpoId(Integer poId) {
		this.poId = poId;
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
     * 订货日期
     */
	public java.time.LocalDateTime getpoDate() {
		return this.poDate;
	}

	  
    /**
     * 订货日期
     */
	public void setpoDate(java.time.LocalDateTime poDate) {
		this.poDate = poDate;
	}
	  
    /**
     * 有效起日
     */
	public java.time.LocalDateTime getpoBegainDate() {
		return this.poBegainDate;
	}

	  
    /**
     * 有效起日
     */
	public void setpoBegainDate(java.time.LocalDateTime poBegainDate) {
		this.poBegainDate = poBegainDate;
	}
	  
    /**
     * 有效止日
     */
	public java.time.LocalDateTime getpoEndDate() {
		return this.poEndDate;
	}

	  
    /**
     * 有效止日
     */
	public void setpoEndDate(java.time.LocalDateTime poEndDate) {
		this.poEndDate = poEndDate;
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
