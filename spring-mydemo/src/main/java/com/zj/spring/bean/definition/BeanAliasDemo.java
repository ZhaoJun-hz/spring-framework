package com.zj.spring.bean.definition;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAliasDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF\\bean-definition-context.xml");
		User user = applicationContext.getBean("user", User.class);
		User user2 =  applicationContext.getBean("user2", User.class);
		User user3 =  applicationContext.getBean("user3", User.class);
		User user4 =  applicationContext.getBean("user4", User.class);

		System.out.println(user == user2);
		System.out.println(user == user3);
		System.out.println(user == user4);
		System.out.println(user2 == user3);
		System.out.println(user2 == user4);
		System.out.println(user3 == user4);

	}
}
