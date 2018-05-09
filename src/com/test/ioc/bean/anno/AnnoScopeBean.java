package com.test.ioc.bean.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("prototype")
public class AnnoScopeBean {

	public AnnoScopeBean() {
		super();
		System.out.println("AnnoScopeBean的构造执行了");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("AnnoScopeBean-init初始化时调用");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("AnnoScopeBean-destroy销毁时调用");
	}
}
