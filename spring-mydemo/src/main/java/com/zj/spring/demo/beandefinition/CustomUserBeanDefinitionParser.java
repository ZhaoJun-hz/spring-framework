package com.zj.spring.demo.beandefinition;

import com.zj.spring.demo.pojo.CustomUser;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CustomUserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return CustomUser.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		if(StringUtils.hasText(userName)){
			bean.addPropertyValue("userName", userName);
		}

		if(StringUtils.hasText(email)) {
			bean.addPropertyValue("email", email);
		}
	}
}
