package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class PurchaseOrderItems implements Serializable {

	private static final long serialVersionUID = 5070619969297812836L;

  
    /**
     * 订单项编号
     */
  private Integer poiId;

  
    /**
     * 订单编号
     */
  private Integer poId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 订货数量
     */
  private String poiAmount;

  
    /**
     * 进价
     */
  private Double purcPrice;

	  
    /**
     * 订单项编号
     */
	public Integer getpoiId() {
		return this.poiId;
	}

	  
    /**
     * 订单项编号
     */
	public void setpoiId(Integer poiId) {
		this.poiId = poiId;
	}
	  
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
     * 订货数量
     */
	public String getpoiAmount() {
		return this.poiAmount;
	}

	  
    /**
     * 订货数量
     */
	public void setpoiAmount(String poiAmount) {
		this.poiAmount = poiAmount;
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
}
