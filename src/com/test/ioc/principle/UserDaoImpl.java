package com.test.ioc.principle;

public class UserDaoImpl implements UserDao {

	@Override
	public void selectOne() {
		System.out.println("dao层被调用了");
	}

}
