package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class PurchaseInItems implements Serializable {

	private static final long serialVersionUID = 1578129335678572475L;

  
    /**
     * 进货单项编号
     */
  private Integer piiId;

  
    /**
     * 进货单编号
     */
  private Integer pibId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 进货数量
     */
  private Integer piiAmount;

  
    /**
     * 进价
     */
  private Double purcPrice;

	  
    /**
     * 进货单项编号
     */
	public Integer getpiiId() {
		return this.piiId;
	}

	  
    /**
     * 进货单项编号
     */
	public void setpiiId(Integer piiId) {
		this.piiId = piiId;
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
     * 进货数量
     */
	public Integer getpiiAmount() {
		return this.piiAmount;
	}

	  
    /**
     * 进货数量
     */
	public void setpiiAmount(Integer piiAmount) {
		this.piiAmount = piiAmount;
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
