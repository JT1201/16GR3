package com.qhit.lh.gr3.jt.hibernate.dao;

import java.util.List;

public interface BaseDao {
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> getall(String fromOdject);
	
	public Object getObjectById(Class clazz,int id);

}
