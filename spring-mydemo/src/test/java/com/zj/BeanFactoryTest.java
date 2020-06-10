package com.zj;

import com.zj.pojo.GetBeanTest;
import com.zj.pojo.MyTestBean;
import com.zj.pojo.TestChangeMethod;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		assertEquals("testStr", myTestBean.getTestStr());

	}

	@Test
	public void testLookUp() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");
		GetBeanTest test = (GetBeanTest) context.getBean("getBeanTest");
		test.showMe();
	}

	@Test
	public void testReplaceMethod() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("replaceMethod.xml");
		TestChangeMethod test = (TestChangeMethod) context.getBean("testChangeMethod");
		test.changeMe();
	}


}
