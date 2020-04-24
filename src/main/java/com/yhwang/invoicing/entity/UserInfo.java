package com.yhwang.invoicing.entity;


import java.io.Serializable;

public class UserInfo implements Serializable {

	private static final long serialVersionUID = 8118427538488862113L;

  
    /**
     * null
     */
  private Integer userId;

  
    /**
     * null
     */
  private String userName;

  
    /**
     * null
     */
  private String userPassword;

  
    /**
     * null
     */
  private Integer popedomId;

	  
    /**
     * null
     */
	public Integer getuserId() {
		return this.userId;
	}

	  
    /**
     * null
     */
	public void setuserId(Integer userId) {
		this.userId = userId;
	}
	  
    /**
     * null
     */
	public String getuserName() {
		return this.userName;
	}

	  
    /**
     * null
     */
	public void setuserName(String userName) {
		this.userName = userName;
	}
	  
    /**
     * null
     */
	public String getuserPassword() {
		return this.userPassword;
	}

	  
    /**
     * null
     */
	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	  
    /**
     * null
     */
	public Integer getpopedomId() {
		return this.popedomId;
	}

	  
    /**
     * null
     */
	public void setpopedomId(Integer popedomId) {
		this.popedomId = popedomId;
	}
}
