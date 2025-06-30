package com.whr.demo.bean;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 @author wanghaoran
 @date 2025-05-29
 */
@Component
public class HelloFactoryBean implements SmartFactoryBean<Hello> {
	@Override
	public @Nullable Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		return Hello.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
