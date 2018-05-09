package com.test.ioc.bean.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//测试生命周期过程中的初始化和销毁bean
@Component("annoLifeCycleBean")
public class AnnoLifeCycleBean {
	
	public AnnoLifeCycleBean() {
		System.out.println("AnnoLifeCycleBean构造器调用了");
	}
	
	//初始化后调用方法：方法名随意，但也不能太随便，一会要配置
	@PostConstruct
	public void init(){
		System.out.println("AnnoLifeCycleBean-init初始化时调用");
	}
	
	//bean销毁时调用的方法
	@PreDestroy
	public void destroy(){
		System.out.println("AnnoLifeCycleBean-destroy销毁时调用");
	}
}