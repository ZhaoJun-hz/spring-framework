package com.zj.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private Set<String> obscenities;

	public ObscenityRemovingBeanFactoryPostProcessor() {
		this.obscenities = new HashSet<String>();
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for(String beanName : beanDefinitionNames) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = new StringValueResolver() {
				@Override
				public String resolveStringValue(String strVal) {
					if (isObscene(strVal)) return "*****";
					return strVal;
				}
			};
			BeanDefinitionVisitor beanDefinitionVisitor = new BeanDefinitionVisitor(valueResolver);
			beanDefinitionVisitor.visitBeanDefinition(beanDefinition);
		}

	}

	private boolean isObscene(String strVal) {
		String s = strVal.toString().toUpperCase();
		return this.obscenities.contains(s);
	}

	public void setObscenities(Set<String> obscenities) {
		this.obscenities.clear();
		for(String obscenity : obscenities) {
			this.obscenities.add(obscenity.toUpperCase());
		}
	}
}
