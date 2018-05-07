package com.test.ioc.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//bean后处理器：用来对bean进行功能增强，可以实现，对所有或某个bean的初始化进行增强
public class MyBeanPostProcessor implements BeanPostProcessor {

	//初始化前调用
	//参数1：要增强的bean对象（xml配置文件中的，即spring管理的）；参数2：bean的名字，id/name
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		//System.out.println(beanName+"在初始化前开始增强了");//增强所有bean
		//只增强一个bean
		if(beanName.equals("lifeCycleBean")){
			System.out.println(beanName + "在初始化前开始增强了");
		}
		return bean;//放行
	}

	//初始化后调用
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		//System.out.println(beanName+"在初始化后开始增强了");//增强所有bean
		if(beanName.equals("lifeCycleBean")){
			System.out.println(beanName + "在初始化后开始增强了");
		}
		return bean;
	}

}