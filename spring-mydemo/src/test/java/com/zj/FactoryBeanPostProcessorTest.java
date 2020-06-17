package com.zj;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanCollectionTests;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class FactoryBeanPostProcessorTest {

	@Test
	public void testFactoryBeanPostProcessor() {
		// ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContextlicationContext("beanfactory.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
		BeanFactoryPostProcessor bfpp = (BeanFactoryPostProcessor) beanFactory.getBean("bfpp");
		bfpp.postProcessBeanFactory(beanFactory);

		System.out.println(beanFactory.getBean("simplePostProcessor"));
	}
}
