package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.jt.hibernate.bean.Dept;
import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

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
		
		Dept dept = new Dept();
		dept = (Dept) bs.getObjectById(dept, 3);
		
		emp.setUser(user);
		user.setEmp(emp);
		emp.setDept(dept);
		
		bs.add(emp);
	}


}
