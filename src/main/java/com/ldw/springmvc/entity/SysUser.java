package com.ldw.springmvc.entity;

public class SysUser {
	private int uId;
	private String uName;
	private int uAge;
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getuAge() {
		return uAge;
	}
	public void setuAge(int uAge) {
		this.uAge = uAge;
	}
	@Override
	public String toString() {
		return "SysUser [uId=" + uId + ", uName=" + uName + ", uAge=" + uAge + "]";
	}
	
}
