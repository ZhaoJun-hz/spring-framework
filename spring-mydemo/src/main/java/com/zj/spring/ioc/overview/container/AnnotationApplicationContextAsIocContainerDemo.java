package com.zj.spring.ioc.overview.container;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

public class AnnotationApplicationContextAsIocContainerDemo {
	public static void main(String[] args) {
		// 创建BeanFactory容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		// 将当前类 作为配置类(Configuration Class)
		applicationContext.register(AnnotationApplicationContextAsIocContainerDemo.class);
		// 启动应用上下文
		applicationContext.refresh();

		// 依赖查找集合对象
		lookupByCollectionType(applicationContext);

		// 关闭应用上下文
		applicationContext.close();
	}

	@Bean
	public User user() {
		User user = new User();
		user.setId(1L);
		user.setUserName("lisi");
		return user;
	}

	private static void lookupByCollectionType(BeanFactory beanFactory) {
		if(beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
			System.out.println(users);
		}

	}
}
