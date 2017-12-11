package com.qhit.lh.gr3.jt.hibernate.dao.impl;

import java.util.List;




import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.jt.hibernate.dao.BaseDao;
import com.qhit.lh.gr3.jt.hibernate.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.save(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void update(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.update(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void delete(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.delete(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public List<Object> getall(String fromOdject) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//获取查询器对象
		Query query = session.createQuery(fromOdject);
		List<Object> list = query.list();
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}

}
