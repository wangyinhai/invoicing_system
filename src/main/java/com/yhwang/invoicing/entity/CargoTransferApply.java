package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class CargoTransferApply implements Serializable {

	private static final long serialVersionUID = 9203900396369940650L;

  
    /**
     * 申请编号
     */
  private Integer ctaId;

  
    /**
     * 门店编号
     */
  private Integer storId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 申请数量
     */
  private Integer ctaAmount;

  
    /**
     * 日期
     */
  private java.sql.Date ctaDate;

  
    /**
     * 申请说明
     */
  private String ctaDesc;

  
    /**
     * 回复状态
     */
  private String ctaIsreply;

  
    /**
     * 申请人
     */
  private String ctaPerson;

	  
    /**
     * 申请编号
     */
	public Integer getctaId() {
		return this.ctaId;
	}

	  
    /**
     * 申请编号
     */
	public void setctaId(Integer ctaId) {
		this.ctaId = ctaId;
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
     * 申请数量
     */
	public Integer getctaAmount() {
		return this.ctaAmount;
	}

	  
    /**
     * 申请数量
     */
	public void setctaAmount(Integer ctaAmount) {
		this.ctaAmount = ctaAmount;
	}
	  
    /**
     * 日期
     */
	public java.sql.Date getctaDate() {
		return this.ctaDate;
	}

	  
    /**
     * 日期
     */
	public void setctaDate(java.sql.Date ctaDate) {
		this.ctaDate = ctaDate;
	}
	  
    /**
     * 申请说明
     */
	public String getctaDesc() {
		return this.ctaDesc;
	}

	  
    /**
     * 申请说明
     */
	public void setctaDesc(String ctaDesc) {
		this.ctaDesc = ctaDesc;
	}
	  
    /**
     * 回复状态
     */
	public String getctaIsreply() {
		return this.ctaIsreply;
	}

	  
    /**
     * 回复状态
     */
	public void setctaIsreply(String ctaIsreply) {
		this.ctaIsreply = ctaIsreply;
	}
	  
    /**
     * 申请人
     */
	public String getctaPerson() {
		return this.ctaPerson;
	}

	  
    /**
     * 申请人
     */
	public void setctaPerson(String ctaPerson) {
		this.ctaPerson = ctaPerson;
	}
}
