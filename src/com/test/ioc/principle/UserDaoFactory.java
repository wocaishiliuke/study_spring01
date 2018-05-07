package com.test.ioc.principle;

/**
 * 工厂模式+反射+配置文件
 * @author yuzhou
 * @since 1.0.0
 */
public class UserDaoFactory {
	
	/*//依然耦合性强
	public UserDao getUserDao() {
		UserDao userDao = new UserDaoImpl();
		return userDao;
	}*/
	
	//反射+配置文件
	//class文件路径将来会放在配置文件中
	public Object getBean() {
		Object bean = null;
		try {
			bean = Class.forName("com.test.ioc.principle.UserDaoImpl").newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
