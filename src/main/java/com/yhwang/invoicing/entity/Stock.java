package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Stock implements Serializable {

	private static final long serialVersionUID = 8382677146344939784L;

  
    /**
     * 货物编号
     */
  private Integer commId;

  
    /**
     * 商品数量
     */
  private String amount;

  
    /**
     * 商品金额
     */
  private Double money;

  
    /**
     * 存放仓库编号
     */
  private Integer depoId;

	  
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
     * 商品数量
     */
	public String getamount() {
		return this.amount;
	}

	  
    /**
     * 商品数量
     */
	public void setamount(String amount) {
		this.amount = amount;
	}
	  
    /**
     * 商品金额
     */
	public Double getmoney() {
		return this.money;
	}

	  
    /**
     * 商品金额
     */
	public void setmoney(Double money) {
		this.money = money;
	}
	  
    /**
     * 存放仓库编号
     */
	public Integer getdepoId() {
		return this.depoId;
	}

	  
    /**
     * 存放仓库编号
     */
	public void setdepoId(Integer depoId) {
		this.depoId = depoId;
	}
}
