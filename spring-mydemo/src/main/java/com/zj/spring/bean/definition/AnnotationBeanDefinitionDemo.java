package com.zj.spring.bean.definition;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import(BeanAliasDemo.class)
public class AnnotationBeanDefinitionDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		// 通过@Bean 方式定义
		// 注册Configuration Class 配置类
		applicationContext.register(Config.class);

		// 通过Component方式
		applicationContext.scan("com.zj.spring.bean.definition");

		// 通过@Import来进行导入
		applicationContext.register(AnnotationBeanDefinitionDemo.class);

		applicationContext.refresh();
		applicationContext.getBean("componentTest");
		applicationContext.getBean("user");
		applicationContext.getBean(BeanAliasDemo.class);
		applicationContext.close();
	}


	// 定义当前类作为Spring Bean (组件)
	@Component("componentTest")
	public static class ComponentTest {

	}

	public static class Config {
		@Bean(name = {"user", "user1"})
		public User user() {
			User user = new User();
			user.setId(1L);
			user.setUserName("zhnagsan");
			return user;
		}
	}
}
