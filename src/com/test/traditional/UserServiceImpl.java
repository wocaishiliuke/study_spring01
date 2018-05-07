package com.test.traditional;

public class UserServiceImpl implements UserService {

	@Override
	public void login() {
		System.out.println("service层被调用了");
		//传统方式-自己实例化对象，再调用方法
		UserDao userDao = new UserDaoImpl();
		userDao.selectOne();
	}

}
