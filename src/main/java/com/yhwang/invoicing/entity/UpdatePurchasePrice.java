package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class UpdatePurchasePrice implements Serializable {

	private static final long serialVersionUID = 2773897782865094979L;

  
    /**
     * 进价调整单号
     */
  private Integer uppId;

  
    /**
     * 进货单项编号
     */
  private Integer piiId;

  
    /**
     * 进货数量
     */
  private Integer uppAmount;

  
    /**
     * 旧进价
     */
  private Double oldPurchasePrice;

  
    /**
     * 新进价
     */
  private Double newPurchasePrice;

  
    /**
     * 调整日期
     */
  private java.time.LocalDateTime uppDate;

  
    /**
     * 制单人
     */
  private String cbill;

	  
    /**
     * 进价调整单号
     */
	public Integer getuppId() {
		return this.uppId;
	}

	  
    /**
     * 进价调整单号
     */
	public void setuppId(Integer uppId) {
		this.uppId = uppId;
	}
	  
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
     * 进货数量
     */
	public Integer getuppAmount() {
		return this.uppAmount;
	}

	  
    /**
     * 进货数量
     */
	public void setuppAmount(Integer uppAmount) {
		this.uppAmount = uppAmount;
	}
	  
    /**
     * 旧进价
     */
	public Double getoldPurchasePrice() {
		return this.oldPurchasePrice;
	}

	  
    /**
     * 旧进价
     */
	public void setoldPurchasePrice(Double oldPurchasePrice) {
		this.oldPurchasePrice = oldPurchasePrice;
	}
	  
    /**
     * 新进价
     */
	public Double getnewPurchasePrice() {
		return this.newPurchasePrice;
	}

	  
    /**
     * 新进价
     */
	public void setnewPurchasePrice(Double newPurchasePrice) {
		this.newPurchasePrice = newPurchasePrice;
	}
	  
    /**
     * 调整日期
     */
	public java.time.LocalDateTime getuppDate() {
		return this.uppDate;
	}

	  
    /**
     * 调整日期
     */
	public void setuppDate(java.time.LocalDateTime uppDate) {
		this.uppDate = uppDate;
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
