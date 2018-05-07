package com.test.ioc.bean.xml.di;

public class Car {
	private Integer id;
	private String name;
	private Double price;
	
	//有参构造
	public Car(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}