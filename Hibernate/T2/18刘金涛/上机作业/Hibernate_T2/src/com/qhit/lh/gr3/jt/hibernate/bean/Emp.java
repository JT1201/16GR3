package com.qhit.lh.gr3.jt.hibernate.bean;

public class Emp {
	private int eid;
	private String empName;
	private String enpSex;
	private int DeptId;
	
	private User user;

	public Emp(int eid, String empName, String enpSex, 
			int deptId, User user) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.enpSex = enpSex;
		DeptId = deptId;
		this.user = user;
	}

	public Emp(int eid, String empName, String enpSex, String birthday,
			int deptId) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.enpSex = enpSex;
		DeptId = deptId;
	}

	public Emp() {
		super();
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

	public int getDeptId() {
		return DeptId;
	}

	public void setDeptId(int deptId) {
		DeptId = deptId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return eid+"/"+empName+"/"+"/"+DeptId;
	}
	
	

}
