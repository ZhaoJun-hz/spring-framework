package com.zj.spring.demo.pojo;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public Car getObject() throws Exception {
		return new Car(brand, "FengTian", 200);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}
