package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class OperatorBill implements Serializable {

	private static final long serialVersionUID = 4667453370319417369L;

  
    /**
     * 业务员编号
     */
  private Integer operId;

  
    /**
     * 拼音编号
     */
  private String operSpellCode;

  
    /**
     * 姓名
     */
  private String operName;

  
    /**
     * 性别
     */
  private String operSex;

  
    /**
     * 电话
     */
  private String operTel;

  
    /**
     * 手机
     */
  private String operMoblieTel;

  
    /**
     * 地址
     */
  private String operAddress;

  
    /**
     * 邮编
     */
  private String operPostcode;

  
    /**
     * 身份证号
     */
  private String operIdMunber;

  
    /**
     * 类别
     */
  private String operSort;

	  
    /**
     * 业务员编号
     */
	public Integer getoperId() {
		return this.operId;
	}

	  
    /**
     * 业务员编号
     */
	public void setoperId(Integer operId) {
		this.operId = operId;
	}
	  
    /**
     * 拼音编号
     */
	public String getoperSpellCode() {
		return this.operSpellCode;
	}

	  
    /**
     * 拼音编号
     */
	public void setoperSpellCode(String operSpellCode) {
		this.operSpellCode = operSpellCode;
	}
	  
    /**
     * 姓名
     */
	public String getoperName() {
		return this.operName;
	}

	  
    /**
     * 姓名
     */
	public void setoperName(String operName) {
		this.operName = operName;
	}
	  
    /**
     * 性别
     */
	public String getoperSex() {
		return this.operSex;
	}

	  
    /**
     * 性别
     */
	public void setoperSex(String operSex) {
		this.operSex = operSex;
	}
	  
    /**
     * 电话
     */
	public String getoperTel() {
		return this.operTel;
	}

	  
    /**
     * 电话
     */
	public void setoperTel(String operTel) {
		this.operTel = operTel;
	}
	  
    /**
     * 手机
     */
	public String getoperMoblieTel() {
		return this.operMoblieTel;
	}

	  
    /**
     * 手机
     */
	public void setoperMoblieTel(String operMoblieTel) {
		this.operMoblieTel = operMoblieTel;
	}
	  
    /**
     * 地址
     */
	public String getoperAddress() {
		return this.operAddress;
	}

	  
    /**
     * 地址
     */
	public void setoperAddress(String operAddress) {
		this.operAddress = operAddress;
	}
	  
    /**
     * 邮编
     */
	public String getoperPostcode() {
		return this.operPostcode;
	}

	  
    /**
     * 邮编
     */
	public void setoperPostcode(String operPostcode) {
		this.operPostcode = operPostcode;
	}
	  
    /**
     * 身份证号
     */
	public String getoperIdMunber() {
		return this.operIdMunber;
	}

	  
    /**
     * 身份证号
     */
	public void setoperIdMunber(String operIdMunber) {
		this.operIdMunber = operIdMunber;
	}
	  
    /**
     * 类别
     */
	public String getoperSort() {
		return this.operSort;
	}

	  
    /**
     * 类别
     */
	public void setoperSort(String operSort) {
		this.operSort = operSort;
	}
}
