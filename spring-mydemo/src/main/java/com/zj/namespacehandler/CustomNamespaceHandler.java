package com.zj.namespacehandler;

import com.zj.beandefinition.CustomUserBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("customeruser", new CustomUserBeanDefinitionParser());
	}
}
