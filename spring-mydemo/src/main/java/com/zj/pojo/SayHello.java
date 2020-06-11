package com.zj.pojo;

public class SayHello {

	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void sayHello() {
		System.out.println("hello " + userName);
	}
}
