package com.test.ioc.bean.xml;

public class Bean2Factory {
	//静态方法，方便调用
	public static Bean2 getBean2() {
		//do other things,like Connection to Driver
		return new Bean2();
	}
}
