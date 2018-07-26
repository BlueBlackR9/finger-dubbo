package com.finger.dubbotest.comsumer;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.finger.dubbotest.api.IDubboTest;

public class DubboConsumerTest {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		IDubboTest iDubboTest = context.getBean(IDubboTest.class);
		System.out.println(iDubboTest.getFirstDubboMethod());
	}
}
