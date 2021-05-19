package com.itcv.demo.rpc.service.impl;


import com.itcv.demo.rpc.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		 
		return "hello " + name;
	}

}
