package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Depot implements Serializable {

	private static final long serialVersionUID = 5766223154913585149L;

  
    /**
     * 仓库编号
     */
  private Integer depotId;

  
    /**
     * 仓库名
     */
  private String depotName;

  
    /**
     * 类别
     */
  private String depotSort;

  
    /**
     * 备注
     */
  private String depotDesc;

	  
    /**
     * 仓库编号
     */
	public Integer getdepotId() {
		return this.depotId;
	}

	  
    /**
     * 仓库编号
     */
	public void setdepotId(Integer depotId) {
		this.depotId = depotId;
	}
	  
    /**
     * 仓库名
     */
	public String getdepotName() {
		return this.depotName;
	}

	  
    /**
     * 仓库名
     */
	public void setdepotName(String depotName) {
		this.depotName = depotName;
	}
	  
    /**
     * 类别
     */
	public String getdepotSort() {
		return this.depotSort;
	}

	  
    /**
     * 类别
     */
	public void setdepotSort(String depotSort) {
		this.depotSort = depotSort;
	}
	  
    /**
     * 备注
     */
	public String getdepotDesc() {
		return this.depotDesc;
	}

	  
    /**
     * 备注
     */
	public void setdepotDesc(String depotDesc) {
		this.depotDesc = depotDesc;
	}
}
