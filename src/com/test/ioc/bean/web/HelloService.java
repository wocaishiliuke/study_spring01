package com.test.ioc.bean.web;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public void sayHello(){
		System.out.println("HelloService-sayHello调用了");
	}

}