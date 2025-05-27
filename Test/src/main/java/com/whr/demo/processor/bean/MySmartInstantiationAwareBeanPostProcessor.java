package com.whr.demo.processor.bean;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**提供一次可以改变Bean类型的机会，比如可以将Cat类型的Bean改变为Dog类型
 * 在getBeanNamesForType方法中，判断某个Bean的类型是否是要求的类型(isTypeMatch方法)时，会调用该后置处理器，可以让你
 * 改变Bean的class类型
 @author: wanghaoran1
 @create: 2025-05-27
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.......");
	}

	@Override
	public @Nullable Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}
}
