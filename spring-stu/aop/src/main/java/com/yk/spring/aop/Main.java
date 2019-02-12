package com.yk.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class Main {

	@Autowired
	private IUserDao userDao;
	@Autowired
	private OrderDao orderDao;

	@Test
	public void testProxy() {
		System.out.println(userDao.getClass());
		userDao.save();
	}

	@Test
	public void testCglib() {
		System.out.println(orderDao.getClass());
		orderDao.save();
	}

}
