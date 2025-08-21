package com.whr.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
@Component
public class Person {
	public Person() {
		System.out.println("初始化Person对象");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}

	public void init() {
		System.out.println("自定义初始化方法");
	}
}
