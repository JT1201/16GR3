package com.qhit.lh.gr3.jt.hibernate.bean;

public class Emp {
	private int eid;
	private String empName;
	private String enpSex;
	private String birthday;
	private int deptId;
	
	private User user;
	private Dept dept;


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String empName, String enpSex, String birthday,
			int deptId, User user, Dept dept) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.enpSex = enpSex;
		this.birthday = birthday;
		this.deptId = deptId;
		this.user = user;
		this.dept = dept;
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEnpSex() {
		return enpSex;
	}



	public void setEnpSex(String enpSex) {
		this.enpSex = enpSex;
	}



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public int getDeptId() {
		return deptId;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Dept getDept() {
		return dept;
	}



	public void setDept(Dept dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return eid+"/"+empName+"/"+birthday+"/"+deptId;
	}

}
