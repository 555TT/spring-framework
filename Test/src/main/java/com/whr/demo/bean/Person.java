package com.whr.demo.bean;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */

public class Person {
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
