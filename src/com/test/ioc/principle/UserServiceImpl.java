package com.test.ioc.principle;

public class UserServiceImpl implements UserService {

	//4.IoC+DI
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login() {
		System.out.println("service层被调用了");
		//1.传统方式：自己实例化对象，再调用方法
		//UserDao userDao = new UserDao();
		
		//2.自定义工厂IOC方式：自定义工厂+反射
		/*UserDaoFactory userDaoFactory = new UserDaoFactory();
		UserDao userDao = userDaoFactory.getUserDao();
		UserDao userDao = (UserDao) userDaoFactory.getBean();*/
		
		//3.spring工厂IOC方式：spring工厂+反射+xml配置
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserDao userDao = (UserDao) ac.getBean("userDao");
		
		//4.IOC+DI
		this.userDao.selectOne();
	}
}
