package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class SaleMrb implements Serializable {

	private static final long serialVersionUID = 5340018792907108823L;

  
    /**
     * 销售退货单编号
     */
  private Integer smId;

  
    /**
     * 销售订单编号
     */
  private Integer soId;

  
    /**
     * 退货数量
     */
  private Integer smAmout;

  
    /**
     * 销售价
     */
  private Double salePrice;

  
    /**
     * 退货仓库编号
     */
  private Integer depoId;

	  
    /**
     * 销售退货单编号
     */
	public Integer getsmId() {
		return this.smId;
	}

	  
    /**
     * 销售退货单编号
     */
	public void setsmId(Integer smId) {
		this.smId = smId;
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
     * 退货数量
     */
	public Integer getsmAmout() {
		return this.smAmout;
	}

	  
    /**
     * 退货数量
     */
	public void setsmAmout(Integer smAmout) {
		this.smAmout = smAmout;
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
	  
    /**
     * 退货仓库编号
     */
	public Integer getdepoId() {
		return this.depoId;
	}

	  
    /**
     * 退货仓库编号
     */
	public void setdepoId(Integer depoId) {
		this.depoId = depoId;
	}
}
