package com.test.ioc.bean.mixed;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	@Test
	public void testAnno() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-mixed.xml");
		ProductService productService=(ProductService) ac.getBean("productService");
		productService.save();
	}
}