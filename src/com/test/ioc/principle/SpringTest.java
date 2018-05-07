package com.test.ioc.principle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testLogin() {
		//UserService userServiceImpl = new UserServiceImpl();
		//userServiceImpl.login();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.根据id/name查找bean(这里不能new，要用spring工厂配置的userService，才有userDao的依赖注入)
		UserService userService = (UserService) ac.getBean("userService");
		//2.根据接口类型查找bean(要求不能有class属性相同的bean)
		//UserService userService = (UserService) ac.getBean(UserService.class);
		userService.login();
	}
}