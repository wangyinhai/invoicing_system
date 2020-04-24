package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class SaleOrderItems implements Serializable {

	private static final long serialVersionUID = 9116754364597111954L;

  
    /**
     * 销售订单项编号
     */
  private Integer soiId;

  
    /**
     * 销售订单编号
     */
  private Integer soId;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 销售数量
     */
  private String soAmount;

  
    /**
     * 销售价
     */
  private Double salePrice;

	  
    /**
     * 销售订单项编号
     */
	public Integer getsoiId() {
		return this.soiId;
	}

	  
    /**
     * 销售订单项编号
     */
	public void setsoiId(Integer soiId) {
		this.soiId = soiId;
	}
	  
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
     * 销售数量
     */
	public String getsoAmount() {
		return this.soAmount;
	}

	  
    /**
     * 销售数量
     */
	public void setsoAmount(String soAmount) {
		this.soAmount = soAmount;
	}
	  
    /**
     * 销售价
     */
	public Double getsalePrice() {
		return this.salePrice;
	}

	  
    /**
     * 销售价
     */
	public void setsalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
}
