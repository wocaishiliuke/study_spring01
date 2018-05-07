package com.test.ioc.bean.xml;

public class Bean3Factory {
	//非静态方法，需要先创建工厂实例，才能调用
	public Bean3 getBean3() {
		//do other things,like Connection to Driver
		return new Bean3();
	} 
}
