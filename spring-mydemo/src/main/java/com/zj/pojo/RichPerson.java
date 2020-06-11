package com.zj.pojo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RichPerson {

	private String name;
	private int age;
	private HashSet<Car> cars;
	private Map<String, Car> carMap;

	public RichPerson(String name, int age, HashSet<Car> cars, Map<String, Car> carMap) {
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.carMap = carMap;
	}

	@Override
	public String toString() {
		return "RichPerson{" +
				"name='" + name + '\'' +
				", age=" + age +
				", cars=" + cars +
				", carMap=" + carMap +
				'}';
	}
}
