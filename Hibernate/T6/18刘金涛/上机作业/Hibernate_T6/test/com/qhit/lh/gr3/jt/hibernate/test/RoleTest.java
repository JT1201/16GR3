package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.bean.Role;
import com.qhit.lh.gr3.jt.hibernate.bean.User;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;

public class RoleTest {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void add() {
		Role role = new Role();
		role.setRoleName("经理");
		role.setMemo("财政");
		
		User user = (User) bs.getObjectById(User.class, 1);
		
		role.getUsers().add(user);
		
		bs.add(role);
	}
	@Test
	public void update() {
		Role role = (Role) bs.getObjectById(Role.class, 1);
		role.setMemo("财务");

		bs.update(role);
	}
	@Test
	public void query() {
		Role role = (Role) bs.getObjectById(Role.class,1);
		
		for(User user : role.getUsers()){
			System.out.println(role.getRoleName()+":"+user.getUserName());
		}
	}
	@Test
	public void delete() {
		Role role = (Role) bs.getObjectById(Role.class,1);
		
		bs.delete(role);
	}


}
