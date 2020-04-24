package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class AccountPayable implements Serializable {

	private static final long serialVersionUID = 7897961032295066883L;

  
    /**
     * 应付款编号
     */
  private Integer apId;

  
    /**
     * 发票号
     */
  private Integer apInv;

  
    /**
     * 填票日期
     */
  private java.time.LocalDateTime apInvDate;

  
    /**
     * 进货单编号
     */
  private Integer pibId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 供货商编号
     */
  private Integer suppId;

  
    /**
     * 数量
     */
  private Double apCommAmount;

  
    /**
     * 进货单价
     */
  private Double apPurchasePrice;

  
    /**
     * 应付款金额
     */
  private String apMoney;

  
    /**
     * 付款日期
     */
  private java.time.LocalDateTime apDate;

  
    /**
     * 详细说明
     */
  private String apDesc;

  
    /**
     * 状态
     */
	private String isap;
  
    /**
     * （减）预付
     */
  private Integer dpId;

	  
    /**
     * 应付款编号
     */
	public Integer getapId() {
		return this.apId;
	}

	  
    /**
     * 应付款编号
     */
	public void setapId(Integer apId) {
		this.apId = apId;
	}
	  
    /**
     * 发票号
     */
	public Integer getapInv() {
		return this.apInv;
	}

	  
    /**
     * 发票号
     */
	public void setapInv(Integer apInv) {
		this.apInv = apInv;
	}
	  
    /**
     * 填票日期
     */
	public java.time.LocalDateTime getapInvDate() {
		return this.apInvDate;
	}

	  
    /**
     * 填票日期
     */
	public void setapInvDate(java.time.LocalDateTime apInvDate) {
		this.apInvDate = apInvDate;
	}
	  
    /**
     * 进货单编号
     */
	public Integer getpibId() {
		return this.pibId;
	}

	  
    /**
     * 进货单编号
     */
	public void setpibId(Integer pibId) {
		this.pibId = pibId;
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
     * 数量
     */
	public Double getapCommAmount() {
		return this.apCommAmount;
	}

	  
    /**
     * 数量
     */
	public void setapCommAmount(Double apCommAmount) {
		this.apCommAmount = apCommAmount;
	}
	  
    /**
     * 进货单价
     */
	public Double getapPurchasePrice() {
		return this.apPurchasePrice;
	}

	  
    /**
     * 进货单价
     */
	public void setapPurchasePrice(Double apPurchasePrice) {
		this.apPurchasePrice = apPurchasePrice;
	}
	  
    /**
     * 应付款金额
     */
	public String getapMoney() {
		return this.apMoney;
	}

	  
    /**
     * 应付款金额
     */
	public void setapMoney(String apMoney) {
		this.apMoney = apMoney;
	}
	  
    /**
     * 付款日期
     */
	public java.time.LocalDateTime getapDate() {
		return this.apDate;
	}

	  
    /**
     * 付款日期
     */
	public void setapDate(java.time.LocalDateTime apDate) {
		this.apDate = apDate;
	}
	  
    /**
     * 详细说明
     */
	public String getapDesc() {
		return this.apDesc;
	}

	  
    /**
     * 详细说明
     */
	public void setapDesc(String apDesc) {
		this.apDesc = apDesc;
	}
	  
    /**
     * 状态
     */
	public String getisap() {
		return this.isap;
	}

	  
    /**
     * 状态
     */
	public void setisap(String isap) {
		this.isap = isap;
	}
	  
    /**
     * （减）预付
     */
	public Integer getdpId() {
		return this.dpId;
	}

	  
    /**
     * （减）预付
     */
	public void setdpId(Integer dpId) {
		this.dpId = dpId;
	}
}
