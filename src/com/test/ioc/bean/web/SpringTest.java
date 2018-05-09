package com.test.ioc.bean.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//目标：测试一下spring的bean的某些功能
@RunWith(SpringJUnit4ClassRunner.class)//junit整合spring的测试,开启了spring的注解
@ContextConfiguration(locations="classpath:applicationContext-web.xml")//加载核心配置文件，（也是在该类中）自动构建spring容器
public class SpringTest {
	//使用Autowired注入（不使用ac.getBean了）
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testHello(){
		//1.获取spring容器
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从spring容器中获取bean对象
		//HelloService helloService=(HelloService)applicationContext.getBean("helloService");
		
		helloService.sayHello();
		
	}
}