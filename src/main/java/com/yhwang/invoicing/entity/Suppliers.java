package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Suppliers implements Serializable {

	private static final long serialVersionUID = 9104709945379923874L;

  
    /**
     * 供货商编号
     */
  private Integer suppId;

  
    /**
     * 拼音编码
     */
  private String suppSpellCode;

  
    /**
     * 简称
     */
  private String suppShortName;

  
    /**
     * 名称
     */
  private String suppName;

  
    /**
     * 地址
     */
  private String suppAddress;

  
    /**
     * 邮编
     */
  private String suppPostCode;

  
    /**
     * 类型
     */
  private String suppSort;

  
    /**
     * 电话
     */
  private String suppTel;

  
    /**
     * 传真
     */
  private String suppFax;

	  
    /**
     * 供货商编号
     */
	public Integer getsuppId() {
		return this.suppId;
	}

	  
    /**
     * 供货商编号
     */
	public void setsuppId(Integer suppId) {
		this.suppId = suppId;
	}
	  
    /**
     * 拼音编码
     */
	public String getsuppSpellCode() {
		return this.suppSpellCode;
	}

	  
    /**
     * 拼音编码
     */
	public void setsuppSpellCode(String suppSpellCode) {
		this.suppSpellCode = suppSpellCode;
	}
	  
    /**
     * 简称
     */
	public String getsuppShortName() {
		return this.suppShortName;
	}

	  
    /**
     * 简称
     */
	public void setsuppShortName(String suppShortName) {
		this.suppShortName = suppShortName;
	}
	  
    /**
     * 名称
     */
	public String getsuppName() {
		return this.suppName;
	}

	  
    /**
     * 名称
     */
	public void setsuppName(String suppName) {
		this.suppName = suppName;
	}
	  
    /**
     * 地址
     */
	public String getsuppAddress() {
		return this.suppAddress;
	}

	  
    /**
     * 地址
     */
	public void setsuppAddress(String suppAddress) {
		this.suppAddress = suppAddress;
	}
	  
    /**
     * 邮编
     */
	public String getsuppPostCode() {
		return this.suppPostCode;
	}

	  
    /**
     * 邮编
     */
	public void setsuppPostCode(String suppPostCode) {
		this.suppPostCode = suppPostCode;
	}
	  
    /**
     * 类型
     */
	public String getsuppSort() {
		return this.suppSort;
	}

	  
    /**
     * 类型
     */
	public void setsuppSort(String suppSort) {
		this.suppSort = suppSort;
	}
	  
    /**
     * 电话
     */
	public String getsuppTel() {
		return this.suppTel;
	}

	  
    /**
     * 电话
     */
	public void setsuppTel(String suppTel) {
		this.suppTel = suppTel;
	}
	  
    /**
     * 传真
     */
	public String getsuppFax() {
		return this.suppFax;
	}

	  
    /**
     * 传真
     */
	public void setsuppFax(String suppFax) {
		this.suppFax = suppFax;
	}
}
