package com.zj.spring.ioc.overview.dependency.injection;

import com.zj.spring.ioc.overview.domain.User;
import com.zj.spring.ioc.overview.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 */
public class DependencyInjectionDemo {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF\\dependence-injection-context.xml");
		UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
		// System.out.println(userRepository.getUsers());
		// 依赖注入
		// System.out.println(userRepository.getBeanFactory());
		// System.out.println(beanFactory == userRepository.getBeanFactory());
		// 依赖查找
		// System.out.println(beanFactory.getBean(BeanFactory.class)); // 该行代码有问题
		ObjectFactory<User> userFactory = userRepository.getObjectFactory();
		System.out.println(userFactory.getObject());

		ObjectFactory<ApplicationContext> factory = userRepository.getFactory();
		System.out.println(factory);
		System.out.println(beanFactory == factory.getObject());

	}
}
