package com.qhit.lh.gr3.jt.strutsSBM.user.service;

import java.util.List;

import com.qhit.lh.gr3.jt.strutsSBM.user.bean.User;

/**
 * @author 刘金涛
 *TODO
 * 2017年12月10日下午6:05:31
 */
public interface UserService {

	public List<User> getAll() throws Exception;

	public int addUser(User user);

	public User doLogin(String userName,String userPassword);

}
