package com.capgemini.jdbc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserBean implements Serializable {
	private int userid;
	private String name;
	private String email;
	private String password;
//	public int getUserid() {
//		return userid;
//	}
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	@Override
//	public String toString() {
//		return "UserBean [userid=" + userid + ", name=" + name + ", email=" + email + "]";
//	}
//
//	
//
//	

}
