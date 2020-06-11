package com.zj;

import com.zj.pojo.*;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAllTest {
	@Test
	public void testBeanAll() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-all.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		System.out.println(hello);
		Car carByStaticFactory = (Car) applicationContext.getBean("carByStaticFactory");
		System.out.println(carByStaticFactory);
		Car carByInstanceFactory = (Car) applicationContext.getBean("carByInstanceFactory");
		System.out.println(carByInstanceFactory);
		Car carFactoryBean = (Car) applicationContext.getBean("carFactoryBean");
		System.out.println(carFactoryBean);

		SayHello sayHello = (SayHello) applicationContext.getBean("sayHello");
		sayHello.sayHello();

		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println(car1);

		Car car2 = (Car) applicationContext.getBean("car2");
		System.out.println(car2);

		Car car3 = (Car) applicationContext.getBean("car3");
		System.out.println(car3);

		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);

		Car car4 = (Car) applicationContext.getBean("car4");
		System.out.println(car4);

		Person person1 = (Person) applicationContext.getBean("person1");
		System.out.println(person1);

		Person person2 = (Person) applicationContext.getBean("person2");
		System.out.println(person2);

		RichPerson richPerson = (RichPerson) applicationContext.getBean("richPerson");
		System.out.println(richPerson);

		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		System.out.println(dataSource);

		Person person3 = (Person) applicationContext.getBean("person3");
		System.out.println(person3);
	}
}
