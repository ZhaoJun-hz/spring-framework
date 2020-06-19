package com.zj.spring.demo.namespacehandler;

import com.zj.spring.demo.beandefinition.CustomUserBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("customeruser", new CustomUserBeanDefinitionParser());
	}
}
