package com.test.ioc.bean.xml;

import org.springframework.beans.factory.FactoryBean;

public class Bean4FactoryBean implements FactoryBean<Bean4> {

	@Override
	public Bean4 getObject() throws Exception {
		//do other things,like Connection to Driver
		return new Bean4();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
