package com.zj.spring.demo.pojo;

public class Person {
	private String name;

	private Integer age;

	private int sonNumber;

	private Car car;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setSonNumber(int sonNumber) {
		this.sonNumber = sonNumber;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public int getSonNumber() {
		return sonNumber;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sonNumber=" + sonNumber +
				", car=" + car +
				'}';
	}
}
