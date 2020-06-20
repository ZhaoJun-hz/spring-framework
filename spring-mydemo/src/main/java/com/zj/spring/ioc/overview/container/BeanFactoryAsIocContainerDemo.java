package com.zj.spring.ioc.overview.container;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class BeanFactoryAsIocContainerDemo {
	public static void main(String[] args) {
		// 创建BeanFactory容器
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 加载配置
		XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(beanFactory);
		// XML 配置文件路径 META-INF\dependence-injection-context.xml
		String location = "META-INF\\dependence-injection-context.xml";
		int beanNumber = reader.loadBeanDefinitions(location);
		System.out.println("beanNumber = " + beanNumber);
		// 依赖查找集合对象
		lookupByCollectionType(beanFactory);
	}

	private static void lookupByCollectionType(BeanFactory beanFactory) {
		if(beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
			System.out.println(users);
		}

	}
}
