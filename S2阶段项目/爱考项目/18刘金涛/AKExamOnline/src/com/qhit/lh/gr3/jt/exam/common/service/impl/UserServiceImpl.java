package com.qhit.lh.gr3.jt.exam.common.service.impl;

import com.qhit.lh.gr3.jt.exam.common.bean.User;
import com.qhit.lh.gr3.jt.exam.common.dao.UserDao;
import com.qhit.lh.gr3.jt.exam.common.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.jt.exam.common.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
