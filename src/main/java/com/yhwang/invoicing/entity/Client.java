package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 4159996626994239545L;

  
    /**
     * 客户编号
     */
  private Integer clieId;

  
    /**
     * 拼音编码
     */
  private String clieSpellCode;

  
    /**
     * 简称
     */
  private String clieShortname;

  
    /**
     * 名称
     */
  private String clieName;

  
    /**
     * 联系人
     */
  private String clieLinkman;

  
    /**
     * 地址
     */
  private String clieAddress;

  
    /**
     * 邮编
     */
  private String cliePostcode;

  
    /**
     * 电话
     */
  private String clieTel;

  
    /**
     * 传真
     */
  private String clieFax;

  
    /**
     * 开户行
     */
  private String clieBank;

  
    /**
     * 银行账号
     */
  private String clieIban;

  
    /**
     * 性质
     */
  private String clieSort;

  
    /**
     * 业务员
     */
  private Integer operId;

  
    /**
     * 授信额度
     */
  private String clieCreditlimt;

	  
    /**
     * 客户编号
     */
	public Integer getclieId() {
		return this.clieId;
	}

	  
    /**
     * 客户编号
     */
	public void setclieId(Integer clieId) {
		this.clieId = clieId;
	}
	  
    /**
     * 拼音编码
     */
	public String getclieSpellCode() {
		return this.clieSpellCode;
	}

	  
    /**
     * 拼音编码
     */
	public void setclieSpellCode(String clieSpellCode) {
		this.clieSpellCode = clieSpellCode;
	}
	  
    /**
     * 简称
     */
	public String getclieShortname() {
		return this.clieShortname;
	}

	  
    /**
     * 简称
     */
	public void setclieShortname(String clieShortname) {
		this.clieShortname = clieShortname;
	}
	  
    /**
     * 名称
     */
	public String getclieName() {
		return this.clieName;
	}

	  
    /**
     * 名称
     */
	public void setclieName(String clieName) {
		this.clieName = clieName;
	}
	  
    /**
     * 联系人
     */
	public String getclieLinkman() {
		return this.clieLinkman;
	}

	  
    /**
     * 联系人
     */
	public void setclieLinkman(String clieLinkman) {
		this.clieLinkman = clieLinkman;
	}
	  
    /**
     * 地址
     */
	public String getclieAddress() {
		return this.clieAddress;
	}

	  
    /**
     * 地址
     */
	public void setclieAddress(String clieAddress) {
		this.clieAddress = clieAddress;
	}
	  
    /**
     * 邮编
     */
	public String getcliePostcode() {
		return this.cliePostcode;
	}

	  
    /**
     * 邮编
     */
	public void setcliePostcode(String cliePostcode) {
		this.cliePostcode = cliePostcode;
	}
	  
    /**
     * 电话
     */
	public String getclieTel() {
		return this.clieTel;
	}

	  
    /**
     * 电话
     */
	public void setclieTel(String clieTel) {
		this.clieTel = clieTel;
	}
	  
    /**
     * 传真
     */
	public String getclieFax() {
		return this.clieFax;
	}

	  
    /**
     * 传真
     */
	public void setclieFax(String clieFax) {
		this.clieFax = clieFax;
	}
	  
    /**
     * 开户行
     */
	public String getclieBank() {
		return this.clieBank;
	}

	  
    /**
     * 开户行
     */
	public void setclieBank(String clieBank) {
		this.clieBank = clieBank;
	}
	  
    /**
     * 银行账号
     */
	public String getclieIban() {
		return this.clieIban;
	}

	  
    /**
     * 银行账号
     */
	public void setclieIban(String clieIban) {
		this.clieIban = clieIban;
	}
	  
    /**
     * 性质
     */
	public String getclieSort() {
		return this.clieSort;
	}

	  
    /**
     * 性质
     */
	public void setclieSort(String clieSort) {
		this.clieSort = clieSort;
	}
	  
    /**
     * 业务员
     */
	public Integer getoperId() {
		return this.operId;
	}

	  
    /**
     * 业务员
     */
	public void setoperId(Integer operId) {
		this.operId = operId;
	}
	  
    /**
     * 授信额度
     */
	public String getclieCreditlimt() {
		return this.clieCreditlimt;
	}

	  
    /**
     * 授信额度
     */
	public void setclieCreditlimt(String clieCreditlimt) {
		this.clieCreditlimt = clieCreditlimt;
	}
}
