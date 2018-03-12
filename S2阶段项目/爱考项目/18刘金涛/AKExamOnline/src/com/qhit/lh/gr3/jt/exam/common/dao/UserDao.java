package com.qhit.lh.gr3.jt.exam.common.dao;

import com.qhit.lh.gr3.jt.exam.common.bean.User;

/**
 * @author 刘金涛
 *TODO
 * 2018年1月2日下午7:55:33
 */
public interface UserDao {
	
	/**
	 * 
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);

}
