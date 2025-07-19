package com.whr.demo.aop;

import org.springframework.stereotype.Service;

/**
 @author wanghaoran
 @date 2025-06-30
 */
@Service
public class HelloService {

	public void helloAop(){
		System.out.println("target method run...。");
	}
}
