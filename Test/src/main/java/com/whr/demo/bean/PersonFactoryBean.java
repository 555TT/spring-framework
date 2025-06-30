package com.whr.demo.bean;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;

/**
 @author wanghaoran
 @date 2025-05-29
 */
//@Component
public class PersonFactoryBean implements FactoryBean<Person> {
	@Override
	public @Nullable Person getObject() {
		return new Person();
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		return Person.class;
	}
}
