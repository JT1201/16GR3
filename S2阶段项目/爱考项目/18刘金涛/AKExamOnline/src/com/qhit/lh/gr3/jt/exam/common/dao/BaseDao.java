package com.qhit.lh.gr3.jt.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.gr3.jt.exam.common.utils.HibernateSessionFactory;

/**
 * @author 刘金涛
 *TODO
 * 2018年1月2日下午7:51:22
 */
public class BaseDao {
	
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}

}
