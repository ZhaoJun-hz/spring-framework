package com.zj;

import com.zj.pojo.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DateDiTest {

	@Test
	public void testDateDi() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("date-di.xml");
		UserMapper userMapper1 = (UserMapper) applicationContext.getBean("userMapper1");
		System.out.println(userMapper1);

		UserMapper userMapper2 = (UserMapper) applicationContext.getBean("userMapper2");
		System.out.println(userMapper2);

	}
}
