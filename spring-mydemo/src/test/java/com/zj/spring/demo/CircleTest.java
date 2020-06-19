package com.zj.spring.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleTest {
	@Test
	public void testCircleConstruct() {
		// 构造器注入构成的循环依赖，是无法解决的，只能抛出BeanCurrentlyInCreationException异常表示循环依赖
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle-constructor.xml");
	}

	@Test
	public void testCircleSetter() {
		// setter循环依赖，只能解决单例作用域的bean循环依赖，通过提前暴露一个单例工厂方法
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle-setter.xml");
	}

	@Test
	public void testCircleSetterPrototype() {
		// setter循环依赖，只能解决单例作用域的bean循环依赖，因为Spring容器不进行缓存"prototype"作用域的bean，无法提前暴露一个单例工厂方法
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("circle-setter-prototype.xml");
		System.out.println(applicationContext.getBean("testA"));
	}
}
