package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;




import com.qhit.lh.gr3.jt.hibernate.bean.Dept;
import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.jt.hibernate.utils.HibernateSessionFactory;

public class EmpTest {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEmpName("ttt");
		emp.setEmpSex("m");
		emp.setBirthday("1121313");
		
		User user = new User();
		user.setUserName("ttt");
		user.setPassword("123456");
		
		Dept dept = (Dept) bs.getObjectById(Dept.class, 3);
		
		emp.setUser(user);
		user.setEmp(emp);
		emp.setDept(dept);
		
		bs.add(emp);
	}
	
	@Test
	public void getEmpByDeptName(){
		//1获取session对象
		Session session = HibernateSessionFactory.getSession();
		
		//2通过session对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept",FetchMode.JOIN)
				.createAlias("dept","d")
				.add(Restrictions.eq("d.daptName", "政治部"));
		
		//3通过criteria条件查询器进行查询
		List<Emp> list = criteria.list();
		
		//4遍历输出
		for(Emp emp : list){
			System.out.println(emp.getEid()+";"+emp.getEmpName());
		}
	}


}
