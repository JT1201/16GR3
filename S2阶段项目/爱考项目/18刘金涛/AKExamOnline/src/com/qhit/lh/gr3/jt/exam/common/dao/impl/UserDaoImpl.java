package com.qhit.lh.gr3.jt.exam.common.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.qhit.lh.gr3.jt.exam.common.bean.User;
import com.qhit.lh.gr3.jt.exam.common.dao.BaseDao;
import com.qhit.lh.gr3.jt.exam.common.dao.UserDao;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User login(User user) {
				String hql = "select user from User user "
						+ "where user.name = ? and "
						+ "user.pwd = ? and "
						+ "user.role = ?";
				Query query =  getSession().createQuery(hql);
				query.setString(0, user.getName());
				query.setString(1, user.getPwd());
				query.setInteger(2, user.getRole());
				
				List<User> list = query.list();
				
				if(list != null && list.size() == 1){
					//登录成功
					return list.get(0);
				}
		return null;
	}

}
