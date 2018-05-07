package com.test.ioc.bean.lifecycle;

public class LifeCycleBean {
	//空参构造
	public LifeCycleBean() {
		System.out.println("LifeCycleBean空参构造调用了");		
	}
	
	//初始化后自动调用方法：方法名随意，要配置到xml中
	public void init(){
		System.out.println("LifeCycleBean-init初始化时调用");
	}
	
	//bean销毁时调用的方法
	public void destroy(){
		System.out.println("LifeCycleBean-destroy销毁时调用");
	}
}
