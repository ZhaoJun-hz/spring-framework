package com.zj.spring.demo.pojo;

public class Teacher extends User {
	@Override
	public void showMe() {
		System.out.println("i am teacher");
	}
}
