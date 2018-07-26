package com.finger.dubbotest.impl;

import org.springframework.stereotype.Service;

import com.finger.dubbotest.api.IDubboTest;

/**
 * 测试dubbo实现类
 * @author 87612
 *
 */
@Service
public class DubboTestImpl implements IDubboTest{

	public String getFirstDubboMethod() {
		String result = "这是提供者返回的第一个dubbo测试内容。";
		return result;
	}
	
}
