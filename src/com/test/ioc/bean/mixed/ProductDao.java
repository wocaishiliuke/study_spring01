package com.test.ioc.bean.mixed;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	public void save(){
		System.out.println("ProductDao-save()执行了");
	}
}