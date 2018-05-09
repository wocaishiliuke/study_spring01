package com.test.ioc.bean.xml.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void testDi() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person1 = (Person) ac.getBean("person1");
		System.out.println(person1);
		Person person2 = (Person) ac.getBean("person2");
		System.out.println(person2);
		Person person3 = (Person) ac.getBean("person3");
		System.out.println(person3);
		Person person4 = (Person) ac.getBean("person4");
		System.out.println(person4);
	}
}