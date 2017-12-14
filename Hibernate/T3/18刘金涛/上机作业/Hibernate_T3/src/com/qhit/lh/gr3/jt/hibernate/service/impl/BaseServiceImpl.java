package com.qhit.lh.gr3.jt.hibernate.service.impl;

import java.util.List;

import com.qhit.lh.gr3.jt.hibernate.dao.BaseDao;
import com.qhit.lh.gr3.jt.hibernate.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		baseDao.add(obj);
		
	}

	@Override
	public void update(Object obj) {
		baseDao.update(obj);
		
	}

	@Override
	public void delete(Object obj) {
		baseDao.delete(obj);
		
	}

	@Override
	public List<Object> getall(String fromOdject) {
		
		return baseDao.getall(fromOdject);
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(obj, id);
	}

}
