package com.whr.demo.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 这个类就叫切面
 * 切面里面有通知，通知分为前置通知，后置通知，环绕通知，异常通知，返回通知。通知就是对目标方法的增强
 * 通知的执行顺序：
 * try {
 * 			前置通知
 * 			目标方法
 * 			返回通知
 *     } catch (Exception e) {
 * 			异常通知
 *     } finally {
 * 			后置通知
 *        }
 @author wanghaoran
 @date 2025-06-30
 */
@Aspect
@Component//！！！切面也是容器中的组件
public class LogAspect {

	/**
	 * 前置通知，在目标方法执行之前执行
	 * After注解里面的叫切入点，这里是一个execution表达式，前面的*表示任意返回类型的方法
	 */
	@Before("execution(* com.whr.demo.aop.HelloService.helloAop())")
	public void beforeHello() {
		System.out.println("前置通知方法。。。");
	}

	@After("execution(* com.whr.demo.aop.HelloService.helloAop())")
	public void afterHello() {
		System.out.println("后置通知方法。。。");
	}

	@AfterReturning("execution(* com.whr.demo.aop.HelloService.helloAop())")
	public void afterReturningHello() {
		System.out.println("返回通知方法。。。");
	}

//	@Around("execution(* com.whr.demo.aop.HelloService.helloAop())")
//	public void aroundHello() {
//		System.out.println("aroundHello。。。");
//	}

	@AfterThrowing("execution(* com.whr.demo.aop.HelloService.helloAop())")
	public void afterThrowingHello() {
		System.out.println("异常通知方法。。。");
	}
}
