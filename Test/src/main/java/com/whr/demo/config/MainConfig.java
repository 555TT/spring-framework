package com.whr.demo.config;

import com.whr.demo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
@Configuration
@ComponentScan(basePackages = "com.whr.demo")
public class MainConfig {
	@Bean(initMethod = "init")
	public Person person() {
		Person person = new Person();
		person.setName("whr");
		return person;
	}
}
