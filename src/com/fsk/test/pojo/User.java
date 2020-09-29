package com.fsk.test.pojo;

public class User {

	private Long aid;
	private String aname;
	private int apassword;
	
	public User() {
		
	}
	public User(Long aid,String aname,int apassword) {
		this.aid = aid;
		this.aname = aname;
		this.apassword = apassword;
		
	}

	public Long getAid() {
		return aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getApassword() {
		return apassword;
	}

	public void setApassword(int apassword) {
		this.apassword = apassword;
	}

	@Override
	public String toString() {
		return "User [aid=" + aid + ", aname=" + aname + ", apassword=" + apassword + "]";
	}
	
}
