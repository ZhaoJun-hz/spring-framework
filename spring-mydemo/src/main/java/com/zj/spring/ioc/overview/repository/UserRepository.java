package com.zj.spring.ioc.overview.repository;

import com.zj.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

public class UserRepository {
	// 内定义bean
	private Collection<User> users;

	// 注入容器内建 非 bean对象
	private BeanFactory beanFactory;

	private ObjectFactory<User> objectFactory;

	private ObjectFactory<ApplicationContext> factory;

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public ObjectFactory<User> getObjectFactory() {
		return objectFactory;
	}

	public void setObjectFactory(ObjectFactory<User> objectFactory) {
		this.objectFactory = objectFactory;
	}

	public ObjectFactory<ApplicationContext> getFactory() {
		return factory;
	}

	public void setFactory(ObjectFactory<ApplicationContext> factory) {
		this.factory = factory;
	}
}
