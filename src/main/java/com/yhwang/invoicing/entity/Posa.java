package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Posa implements Serializable {

	private static final long serialVersionUID = 1912134274304438750L;

  
    /**
     * 日期编号
     */
  private Integer posaId;

  
    /**
     * 门店编号
     */
  private Integer storId;

  
    /**
     * 收款机号
     */
  private Integer posaPos;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 班次
     */
  private Integer posaShift;

  
    /**
     * 销售数量
     */
  private Integer posaSaleAmount;

  
    /**
     * 应收金额
     */
  private Double posaReceviableMoney;

  
    /**
     * 实收金额
     */
  private Double posaReceviedMoney;

  
    /**
     * 库存单价
     */
  private Double posaPrice;

	  
    /**
     * 日期编号
     */
	public Integer getposaId() {
		return this.posaId;
	}

	  
    /**
     * 日期编号
     */
	public void setposaId(Integer posaId) {
		this.posaId = posaId;
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
     * 收款机号
     */
	public Integer getposaPos() {
		return this.posaPos;
	}

	  
    /**
     * 收款机号
     */
	public void setposaPos(Integer posaPos) {
		this.posaPos = posaPos;
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
     * 班次
     */
	public Integer getposaShift() {
		return this.posaShift;
	}

	  
    /**
     * 班次
     */
	public void setposaShift(Integer posaShift) {
		this.posaShift = posaShift;
	}
	  
    /**
     * 销售数量
     */
	public Integer getposaSaleAmount() {
		return this.posaSaleAmount;
	}

	  
    /**
     * 销售数量
     */
	public void setposaSaleAmount(Integer posaSaleAmount) {
		this.posaSaleAmount = posaSaleAmount;
	}
	  
    /**
     * 应收金额
     */
	public Double getposaReceviableMoney() {
		return this.posaReceviableMoney;
	}

	  
    /**
     * 应收金额
     */
	public void setposaReceviableMoney(Double posaReceviableMoney) {
		this.posaReceviableMoney = posaReceviableMoney;
	}
	  
    /**
     * 实收金额
     */
	public Double getposaReceviedMoney() {
		return this.posaReceviedMoney;
	}

	  
    /**
     * 实收金额
     */
	public void setposaReceviedMoney(Double posaReceviedMoney) {
		this.posaReceviedMoney = posaReceviedMoney;
	}
	  
    /**
     * 库存单价
     */
	public Double getposaPrice() {
		return this.posaPrice;
	}

	  
    /**
     * 库存单价
     */
	public void setposaPrice(Double posaPrice) {
		this.posaPrice = posaPrice;
	}
}
