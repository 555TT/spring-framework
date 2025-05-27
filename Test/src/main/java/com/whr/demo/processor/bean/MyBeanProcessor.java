package com.whr.demo.processor.bean;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 @author: wanghaoran1
 @create: 2025-05-27
 */
@Component
public class MyBeanProcessor implements BeanPostProcessor {
	public MyBeanProcessor() {
		System.out.println("MyBeanProcessor init....");
	}

	@Override
	public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanProcessor postProcessBeforeInitialization....");
		return bean;
	}

	@Override
	public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanProcessor postProcessAfterInitialization");
		return bean;
	}
}
