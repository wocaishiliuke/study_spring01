package com.test.ioc.bean.xml.di;
//测试setter方法依赖注入
public class Person {
	//方式1：公开属性，配合spEL表达式
	public Integer id;
	private String name;
	private Car car;
	//默认给出空参构造
	//必须提供setter属性方法
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	//方式2：若私有属性，提供getter方法，配合spEL表达式
	/*public Integer getId() {
		return id;
	}*/
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
}