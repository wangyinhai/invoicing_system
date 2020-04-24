package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Commodity implements Serializable {

	private static final long serialVersionUID = 4723651484624917524L;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 条形码
     */
  private String commBarCode;

  
    /**
     * 商品名
     */
  private String commName;

  
    /**
     * 拼音编码
     */
  private String commSpellCode;

  
    /**
     * 规格
     */
  private String commStandard;

  
    /**
     * 单位
     */
  private String commUnit;

  
    /**
     * 产地
     */
  private String commProducingArea;

  
    /**
     * 类别
     */
  private String commSort;

  
    /**
     * 进价
     */
  private Double purchasePrice;

  
    /**
     * 销售价1
     */
  private Double salePrice1;

  
    /**
     * 销售价2
     */
  private Double salePrice2;

  
    /**
     * 最低售价
     */
  private Double lowestSalePrice;

	  
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
     * 条形码
     */
	public String getcommBarCode() {
		return this.commBarCode;
	}

	  
    /**
     * 条形码
     */
	public void setcommBarCode(String commBarCode) {
		this.commBarCode = commBarCode;
	}
	  
    /**
     * 商品名
     */
	public String getcommName() {
		return this.commName;
	}

	  
    /**
     * 商品名
     */
	public void setcommName(String commName) {
		this.commName = commName;
	}
	  
    /**
     * 拼音编码
     */
	public String getcommSpellCode() {
		return this.commSpellCode;
	}

	  
    /**
     * 拼音编码
     */
	public void setcommSpellCode(String commSpellCode) {
		this.commSpellCode = commSpellCode;
	}
	  
    /**
     * 规格
     */
	public String getcommStandard() {
		return this.commStandard;
	}

	  
    /**
     * 规格
     */
	public void setcommStandard(String commStandard) {
		this.commStandard = commStandard;
	}
	  
    /**
     * 单位
     */
	public String getcommUnit() {
		return this.commUnit;
	}

	  
    /**
     * 单位
     */
	public void setcommUnit(String commUnit) {
		this.commUnit = commUnit;
	}
	  
    /**
     * 产地
     */
	public String getcommProducingArea() {
		return this.commProducingArea;
	}

	  
    /**
     * 产地
     */
	public void setcommProducingArea(String commProducingArea) {
		this.commProducingArea = commProducingArea;
	}
	  
    /**
     * 类别
     */
	public String getcommSort() {
		return this.commSort;
	}

	  
    /**
     * 类别
     */
	public void setcommSort(String commSort) {
		this.commSort = commSort;
	}
	  
    /**
     * 进价
     */
	public Double getpurchasePrice() {
		return this.purchasePrice;
	}

	  
    /**
     * 进价
     */
	public void setpurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	  
    /**
     * 销售价1
     */
	public Double getsalePrice1() {
		return this.salePrice1;
	}

	  
    /**
     * 销售价1
     */
	public void setsalePrice1(Double salePrice1) {
		this.salePrice1 = salePrice1;
	}
	  
    /**
     * 销售价2
     */
	public Double getsalePrice2() {
		return this.salePrice2;
	}

	  
    /**
     * 销售价2
     */
	public void setsalePrice2(Double salePrice2) {
		this.salePrice2 = salePrice2;
	}
	  
    /**
     * 最低售价
     */
	public Double getlowestSalePrice() {
		return this.lowestSalePrice;
	}

	  
    /**
     * 最低售价
     */
	public void setlowestSalePrice(Double lowestSalePrice) {
		this.lowestSalePrice = lowestSalePrice;
	}
}
