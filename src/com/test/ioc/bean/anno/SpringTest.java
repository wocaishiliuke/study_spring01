package com.test.ioc.bean.anno;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testAnno() {
		//spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取bean
		CustomerService customerService=(CustomerService) ac.getBean("customerService");
		customerService.save();
	}
	
	@Test
	public void testLifeCycle() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//单例；此时，构造和初始化后调用的方法，都已经被调用（创建applicationContext的同时）
		AnnoLifeCycleBean lifeCycleBean = (AnnoLifeCycleBean)applicationContext.getBean("annoLifeCycleBean");
	     //关闭spring容器
		//方案一：强转到子类
	     //((ClassPathXmlApplicationContext)applicationContext).close();
	        
		//方案二：反射机制调用close方法
		//获取引用applicationContext的运行时类（即子类ClassPathXmlApplicationContext），再获取该子类的close方法
		Method method = applicationContext.getClass().getMethod("close");
		//方法调用。invoke参数1：拥有该方法的对象的名字，参数2：方法里面的参数的值
		method.invoke(applicationContext);
	}
	
	@Test
	public void testScope() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//多例；此时，才执行构造和初始化后调用的方法
		AnnoScopeBean annoScopeBean = (AnnoScopeBean)applicationContext.getBean("annoScopeBean");
	     //关闭spring容器
		//方案一：强转到子类
	     //((ClassPathXmlApplicationContext)applicationContext).close();
	        
		//方案二：反射机制调用close方法
		//获取引用applicationContext的运行时类（即子类ClassPathXmlApplicationContext），再获取该子类的close方法
		Method method = applicationContext.getClass().getMethod("close");
		//方法调用。invoke参数1：拥有该方法的对象的名字，参数2：方法里面的参数的值
		method.invoke(applicationContext);
	}
	
}