package com.zj.spring.demo;

import com.zj.spring.demo.pojo.aware.TestAware;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AwareTest {
	@Test
	public void testAware() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aware.xml");
		TestAware testAware = (TestAware) applicationContext.getBean("testAware");
		testAware.testAware();
	}
}
