package com.qhit.lh.gr3.jt.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
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
		emp.setEmpName("ft");
		emp.setEmpSex("m");
		emp.setBirthday("1121313");
		
		User user = new User();
		user.setUserName("ft");
		user.setPassword("123456");
		
		Dept dept = (Dept) bs.getObjectById(Dept.class, 3);
		
		emp.setUser(user);
		user.setEmp(emp);
		emp.setDept(dept);
		
		bs.add(emp);
	}
	@Test
	public void query(){
		String hql = "select e from Emp e where e.empName like :ename";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		query.setString("ename","%t%");
		
		List<Emp> result = query.list();
		for(Emp e : result){
			System.out.println("结果："+e.getEmpName()+"/"+e.getEmpSex());
		}
	}


}
