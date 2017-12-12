package com.qhit.lh.gr3.jt.t2;

import static org.junit.Assert.*;

import java.util.List;

import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

public class Test {
	private BaseService bs=new BaseServiceImpl();
	@org.junit.Test
	public void add(){
		Emp emp = new Emp();
		emp.setEmpName("JT");
		emp.setEnpSex("男");
		emp.setDeptId(1);
		
		User user =new User();
		user.setUserName("admin");
		user.setPassword("123456");
		
		user.setEmp(emp);
		emp.setUser(user);
		
		bs.add(emp);
	}
	public void update(){
		Emp emp = new Emp(); 
		emp.setEid(2);
		emp.setEmpName("mot");
		emp.setEnpSex("f");
		emp.setDeptId(0);
		
		User user = new User();
		user.setUserName("mot");
		user.setPassword("654321");
		
		
		emp.setUser(user);
		user.setEmp(emp);
		
		bs.update(emp);
		
	}
	public void delete(){
		Emp emp = new Emp(); 
		emp = (Emp) bs.getObjectById(emp, 2);
		bs.delete(emp);
		
	}
	public void query(){
		List<Object> list = bs.getall("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
		
	}


}
