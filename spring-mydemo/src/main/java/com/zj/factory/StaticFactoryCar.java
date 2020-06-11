package com.zj.factory;

import com.zj.pojo.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticFactoryCar {
	private static Map<String, Car> cars = new HashMap<String, Car>();

	static {

		cars.put("DaZhong", new Car("PaSaTe", "DaZhong", 300000));
		cars.put("BenTian", new Car("YaGe", "BenTian", 300000));
	}

	public  static Car getCar(String key) {
		return cars.get(key);
	}
}
