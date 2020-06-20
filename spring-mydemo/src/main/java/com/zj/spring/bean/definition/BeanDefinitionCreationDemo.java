package com.zj.spring.bean.definition;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanDefinitionCreationDemo {
	public static void main(String[] args) {
		// 通过 BeanDefinitionBuilder 构建
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
		// beanDefinitionBuilder.addPropertyValue("id", 34);
		// beanDefinitionBuilder.addPropertyValue("userName", "zhaoliu");
		beanDefinitionBuilder.addPropertyValue("id", 34)
				.addPropertyValue("userName", "zhaoliu");
		// 获取 BeanDefinition 实例
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		// BeanDefinition 并非 Bean 的终态，可以自定义修改


		// 通过 AbstractBeanDefinition以及派生类
		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		// 设置 Bean 类型
		genericBeanDefinition.setBeanClass(User.class);
		// 通过 MutablePropertyValues 批量操作属性
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		// propertyValues.addPropertyValue("id", 34);
		// propertyValues.addPropertyValue("userName", "zhaoliu");
		propertyValues.add("id", 34)
				.add("userName", "zhaoliu");
		// 通过 set MutablePropertyValues 批量操作属性
		genericBeanDefinition.setPropertyValues(propertyValues);
	}
}
