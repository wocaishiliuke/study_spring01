package com.test.ioc.bean.xml.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void testLogin() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) ac.getBean("car");
		System.out.println(car);
	}
}