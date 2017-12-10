package com.qhit.lh.gr3.jt.strutsSBM.user.service.impl;

import java.util.List;

import com.qhit.lh.gr3.jt.strutsSBM.user.bean.User;
import com.qhit.lh.gr3.jt.strutsSBM.user.dao.UserDao;
import com.qhit.lh.gr3.jt.strutsSBM.user.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.jt.strutsSBM.user.service.UserService;

/**
 * @author 刘金涛
 *TODO
 * 2017年12月10日下午6:06:09
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName, userPassword);
	}

}
