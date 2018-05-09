package com.test.ioc.bean.anno;

import org.springframework.stereotype.Repository;

//@Component
@Repository("customerDao")
public class CustomerDao {
	
	public void save(){
		System.out.println("CustomerDao层被调用了");
	}

}