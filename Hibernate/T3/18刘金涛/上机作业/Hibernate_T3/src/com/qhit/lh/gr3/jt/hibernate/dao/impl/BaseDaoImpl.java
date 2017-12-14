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
		// 鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		// 寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		// 鎵ц
		session.save(obj);
		// 鎻愪氦浜嬪姟
		ts.commit();
		// 閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();

	}

	@Override
	public void update(Object obj) {
		// 鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		// 寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		// 鎵ц
		session.update(obj);
		// 鎻愪氦浜嬪姟
		ts.commit();
		// 閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();

	}

	@Override
	public void delete(Object obj) {
		// 鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		// 寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		// 鎵ц
		session.delete(obj);
		// 鎻愪氦浜嬪姟
		ts.commit();
		// 閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();

	}

	@Override
	public List<Object> getall(String fromOdject) {
		// 鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		// 寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		// 鑾峰彇鏌ヨ鍣ㄥ璞�
		Query query = session.createQuery(fromOdject);
		List<Object> list = query.list();
		// 鎻愪氦浜嬪姟
		ts.commit();
		// 閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		// 鑾峰彇session瀵硅薄
		Session session = HibernateSessionFactory.getSession();
		// 寮�惎浜嬪姟
		Transaction ts = session.beginTransaction();
		// 鑾峰彇鏌ヨ鍣ㄥ璞�
		obj = session.get(obj.getClass(), id);
		// 鎻愪氦浜嬪姟
		ts.commit();
		// 閲婃斁璧勬簮
		HibernateSessionFactory.closeSession();
		return obj;
	}

}
