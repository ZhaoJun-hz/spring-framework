package com.zj;

import com.zj.pojo.CustomUser;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CustomTest {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("customeruser.xml"));
		// ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("customeruser.xml");
		CustomUser testBean = (CustomUser) beanFactory.getBean("testBean");
		System.out.println(testBean);
	}
}
