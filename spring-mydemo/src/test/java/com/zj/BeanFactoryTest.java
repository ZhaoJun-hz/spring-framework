package com.zj;

import com.zj.pojo.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		assertEquals("testStr", myTestBean.getTestStr());

	}
}
