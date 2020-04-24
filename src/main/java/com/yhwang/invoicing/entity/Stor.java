package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Stor implements Serializable {

	private static final long serialVersionUID = 5810612039179105603L;

  
    /**
     * 门店编号
     */
  private Integer storId;

  
    /**
     * 门店名称
     */
  private String storName;

  
    /**
     * 门店地址
     */
  private String storAddress;

  
    /**
     * 备注
     */
  private String storDesc;

	  
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
     * 门店名称
     */
	public String getstorName() {
		return this.storName;
	}

	  
    /**
     * 门店名称
     */
	public void setstorName(String storName) {
		this.storName = storName;
	}
	  
    /**
     * 门店地址
     */
	public String getstorAddress() {
		return this.storAddress;
	}

	  
    /**
     * 门店地址
     */
	public void setstorAddress(String storAddress) {
		this.storAddress = storAddress;
	}
	  
    /**
     * 备注
     */
	public String getstorDesc() {
		return this.storDesc;
	}

	  
    /**
     * 备注
     */
	public void setstorDesc(String storDesc) {
		this.storDesc = storDesc;
	}
}
