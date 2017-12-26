package com.qhit.lh.gr3.jt.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.jt.hibernate.bean.Dept;
import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void add() {
		Dept dept = new Dept();
		dept.setDeptName("信息部");
		dept.setDeptAdress("E");
		
		Emp emp = new Emp();
		emp.setEmpName("qqq");
		emp.setEmpSex("f");
		emp.setBirthday("123456");
		
		dept.getEmps().add(emp);
		
		bs.add(dept);
	}
	
	@Test
	public void update() {
		Dept dept = (Dept) bs.getObjectById(Dept.class, 3);
		dept.setDeptAdress("F");
		
		bs.update(dept);
	}
	
	@Test
	public void delete() {
		Dept dept = (Dept) bs.getObjectById(Dept.class, 5);
		
		
		bs.delete(dept);
	}
	
	@Test
	public void query() {
		Dept dept  = (Dept) bs.getObjectById(Dept.class, 3);
		
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDeptName()+":"+emp.getEmpName());
			
		}
		
		
		bs.delete(dept);
	}

}
