package com.test.ioc.bean.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void testScope() {
		//对于单例此时也会创建和初始化
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取bean
		LifeCycleBean lifeCycleBean=(LifeCycleBean) applicationContext.getBean("lifeCycleBean");
		System.out.println(lifeCycleBean);
		//此时没有调用销毁方法
		//原因是：使用debug模式jvm直接就关了，spring容器/工厂还没有来得及销毁对象。
		//解决：手动关闭spring容器，此时自动销毁单例的对象
		((ClassPathXmlApplicationContext)applicationContext).close();  //要有外括号；ApplicationContext接口中没有close方法，子类中有
	}
}