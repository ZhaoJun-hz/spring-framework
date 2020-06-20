package com.zj.spring.bean.definition;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AnnotationBeanDefinitionDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		// 通过@Bean 方式定义

		applicationContext.refresh();

		applicationContext.close();
	}

	public static class Config {
		@Bean
		public User user() {
			User user = new User();
			user.setId(1L);
			user.setUserName("zhnagsan");
			return user;
		}
	}
}
