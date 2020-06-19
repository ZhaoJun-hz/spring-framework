package com.zj.spring.ioc.overview.dependency.lookup;

import com.zj.spring.ioc.overview.annotation.Super;
import com.zj.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找
 */
public class DependenceLookUpDemo {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF\\dependence-lookup-context.xml");
		// 根据bean名称查找，实时查找
		lookupInRealTime(beanFactory);
		// 根据bean名称查找，延迟查找
		lookupInLazy(beanFactory);
		// 按照类型查找
		lookupByType(beanFactory);
		// 按照类型查找集合对象
		lookupByCollectionType(beanFactory);
		// 根据bean名称 + 类型查找
		lookupByNameAndType(beanFactory);
		// 通过注解查找
		lookupByAnnotation(beanFactory);
	}

	@SuppressWarnings("unchecked")
	private static void lookupByAnnotation(BeanFactory beanFactory) {
		if(beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, User> users = (Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
			System.out.println(users);
		}
	}

	private static void lookupByNameAndType(BeanFactory beanFactory) {
		User user = beanFactory.getBean("user", User.class);
		System.out.println(user);
	}

	private static void lookupByCollectionType(BeanFactory beanFactory) {
		if(beanFactory instanceof ListableBeanFactory) {
			ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
			Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
			System.out.println(users);
		}

	}

	private static void lookupByType(BeanFactory beanFactory) {
		User user = beanFactory.getBean(User.class);
		System.out.println(user);
	}

	@SuppressWarnings("unchecked")
	private static void lookupInLazy(BeanFactory beanFactory) {
		// factoryBean
		ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
		User user = objectFactory.getObject();
		System.out.println(user);

	}

	private static void lookupInRealTime(BeanFactory beanFactory) {
		User user = (User) beanFactory.getBean("user");
		System.out.println(user);
	}
}
