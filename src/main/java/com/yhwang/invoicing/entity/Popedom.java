package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class Popedom implements Serializable {

	private static final long serialVersionUID = 9018532401647226470L;

  
    /**
     * 权限编号
     */
  private Integer popeId;

  
    /**
     * 权限名称
     */
  private String popeName;

	  
    /**
     * 权限编号
     */
	public Integer getpopeId() {
		return this.popeId;
	}

	  
    /**
     * 权限编号
     */
	public void setpopeId(Integer popeId) {
		this.popeId = popeId;
	}
	  
    /**
     * 权限名称
     */
	public String getpopeName() {
		return this.popeName;
	}

	  
    /**
     * 权限名称
     */
	public void setpopeName(String popeName) {
		this.popeName = popeName;
	}
}
