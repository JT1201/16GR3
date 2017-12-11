package com.qhit.lh.gr3.jt.hibernate.service;

import java.util.List;

public interface BaseService {
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public List<Object> getall(String fromOdject);

}
