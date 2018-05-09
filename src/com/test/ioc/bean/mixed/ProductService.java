package com.test.ioc.bean.mixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void save(){
		System.out.println("ProductService-save执行了");
		productDao.save();
	}

}