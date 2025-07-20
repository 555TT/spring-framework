package com.whr.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
@Component
@DependsOn("person")
public class Cat implements ApplicationContextAware {
	private String name = "小猫";
	private int age;
	private ApplicationContext applicationContext;
	private Person person;

	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

	public Cat() {
		System.out.println("构造器方法");
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("构造器方法");
	}

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", age=" + age +
				", applicationContext=" + applicationContext +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext);
	}
}
