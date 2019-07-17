package com.tiomn.entity;

import java.io.Serializable;//序列化接口
import java.util.Date;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String email;
	private Date registdate;
	
	private String rdate;
	
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegistdate() {
		return registdate;
	}
	public void setRegistdate(Date registdate) {
		this.registdate = registdate;
	}

	
	
}
