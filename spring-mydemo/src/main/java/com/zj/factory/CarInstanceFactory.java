package com.zj.factory;

import com.zj.pojo.Car;

import java.util.HashMap;
import java.util.Map;

public class CarInstanceFactory {
	private Map<String, Car> cars= new HashMap<String, Car>();

	public CarInstanceFactory() {
		// TODO Auto-generated constructor stub
		cars.put("DaZhong", new Car("PaSaTe", "DaZhong", 600000));
		cars.put("BenTian", new Car("YaGe", "BenTian", 400000));
	}

	public Car getCar(String key) {

		return cars.get(key);
	}
}
