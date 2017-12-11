package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

public class UserTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void addUser() {
		User user = new User();
		user.setName("tom");
		user.setPwd("123456");
		user.setSex("f");
		
		baseService.add(user);
		
	}

}
