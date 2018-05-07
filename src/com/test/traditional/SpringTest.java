package com.test.traditional;

import org.junit.Test;

public class SpringTest {

	@Test
	public void testLogin() {
		UserService userServiceImpl = new UserServiceImpl();
		userServiceImpl.login();
	}

}
