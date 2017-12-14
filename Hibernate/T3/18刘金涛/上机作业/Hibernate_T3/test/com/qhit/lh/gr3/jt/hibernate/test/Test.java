package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import java.util.List;

import com.qhit.lh.gr3.jt.hibernate.bean.Dept;
import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

public class Test {
	private BaseService baseService = new BaseServiceImpl(); 

	@org.junit.Test
	public void add() {
		Emp emp = new Emp(); 
		emp.setEmpName("tom");
		emp.setEnpSex("m");
		emp.setBirthday("2011-11-11");
		
		User user = new User();
		user.setUserName("tom");
		user.setPassword("123456");
		
		Dept dept = new Dept();
		dept = (Dept) baseService.getObjectById(dept, 1);
		
		
		emp.setUser(user);
		user.setEmp(emp);
		emp.setDept(dept);
		
		baseService.add(emp);
		
	}
	@org.junit.Test
	public void update() {
		Emp emp = new Emp(); 
		emp = (Emp) baseService.getObjectById(emp, 1);
		System.out.println(emp.toString());
		emp.setEmpName("mot");
		emp.setEnpSex("f");
		emp.setBirthday("1111-11-02");
		
		emp.getUser().setPassword("456789");
		
		Dept dept = new Dept();
		dept = (Dept) baseService.getObjectById(dept, 3);
		emp.setDept(dept);
		
		baseService.update(emp);
		
	}
	@org.junit.Test
	public void delete() {
		Emp emp = new Emp(); 
		emp = (Emp) baseService.getObjectById(emp, 1);
		baseService.delete(emp);
		
	}
	@org.junit.Test
	public void query() {
		List<Object> list = baseService.getall("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
		
	}

}
