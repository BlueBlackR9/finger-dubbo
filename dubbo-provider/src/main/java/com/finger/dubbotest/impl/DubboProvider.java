package com.finger.dubbotest.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvider {
	
	public static void main(String[] args) throws IOException {
        @SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
