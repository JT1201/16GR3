package com.qhit.lh.gr3.jt.hibernate.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.jt.hibernate.bean.Dept;
import com.qhit.lh.gr3.jt.hibernate.bean.Emp;
import com.qhit.lh.gr3.jt.hibernate.service.BaseService;
import com.qhit.lh.gr3.jt.hibernate.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.jt.hibernate.utils.HibernateSessionFactory;

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
		Dept dept = (Dept) bs.getObjectById(Dept.class, 3);

		for (Emp emp : dept.getEmps()) {
			System.out.println(dept.getDeptName() + ":" + emp.getEmpName());

		}

		bs.delete(dept);
	}

	@Test
	public void getDeptInfo() {
		// 1获取session对象
		Session session = HibernateSessionFactory.getSession();

		// 2通过session对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		
		//设置分组条件和查询结果
		ProjectionList proList = Projections.projectionList()
				.add(Projections.groupProperty("deptId"))
				.add(Projections.groupProperty("deptName"))
				.add(Projections.groupProperty("adress"))
				.add(Projections.count("e.eid"));
		
		//关联条件查询器和结果
		criteria.setProjection(proList);

		// 3通过criteria条件查询器进行查询
		List<Object[]> list = criteria.list();

		// 4遍历输出
		for (Object[] obj : list) {
			System.out.println(""+obj[0]+obj[1]+obj[2]+obj[3]);
		}
	}

}
