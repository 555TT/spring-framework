package com.whr.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
@Configuration
@ComponentScan(basePackages = "com.whr.demo")
@EnableAspectJAutoProxy
public class MainConfig {
//	@Bean(initMethod = "init")
//	public Person person() {
//		Person person = new Person();
//		person.setName("whr");
//		return person;
//	}

}
