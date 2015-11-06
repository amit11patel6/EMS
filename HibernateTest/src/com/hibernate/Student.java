package com.hibernate;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int  sId;
	private String sName;
	public int getsId() {
		return sId;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void test(){
		
		System.out.println("test method");
		
	}

}
