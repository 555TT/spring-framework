package com.whr.demo;

import com.whr.demo.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 @author: wanghaoran1
 @create: 2025-05-23
 */
public class XmlApplicationTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Cat bean = applicationContext.getBean(Cat.class);
		System.out.println(bean);
	}
}

