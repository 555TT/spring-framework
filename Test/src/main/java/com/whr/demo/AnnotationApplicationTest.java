package com.whr.demo;

import com.whr.demo.config.MainConfig;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
public class AnnotationApplicationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContext.getBeanFactory();
		System.out.println();
	}
}

