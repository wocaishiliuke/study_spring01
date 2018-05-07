package com.test.ioc.bean.lifescope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testScope() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//单例：每次从spring容器中获取的对象，是同一个对象
		//单例初始化：在spring容器ac初始化的时候，就初始化了
		System.out.println("------准备get单例1------");
		SingletonBean sb1=(SingletonBean)ac.getBean("singletonBean");
		System.out.println("------准备get单例2------");
		SingletonBean sb2=(SingletonBean)ac.getBean("singletonBean");
		System.out.println(sb1);
		System.out.println(sb2);
		//多例：每次从spring容器中获取的对象，不是同一个对象
		//多例初始化：在getBean的时候才创建和初始化，相当于每次getbean就是new Bean()
		System.out.println("------准备get多例1------");
		PrototypeBean pb1=(PrototypeBean)ac.getBean("prototypeBean");
		System.out.println("------准备get多例1------");
		PrototypeBean pb2=(PrototypeBean)ac.getBean("prototypeBean");
		System.out.println(pb1);
		System.out.println(pb2);
	}
}