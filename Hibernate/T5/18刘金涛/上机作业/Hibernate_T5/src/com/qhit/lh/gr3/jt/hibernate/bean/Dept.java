package com.qhit.lh.gr3.jt.hibernate.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer deptId;
	private String deptName;
	private String deptAdress;
	
	private Set<Emp> emps = new HashSet<>();
	

	// Constructors

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String deptName, String deptAdress) {
		this.deptName = deptName;
		this.deptAdress = deptAdress;
	}

	// Property accessors



	public String getDeptName() {
		return this.deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAdress() {
		return this.deptAdress;
	}

	public void setDeptAdress(String deptAdress) {
		this.deptAdress = deptAdress;
	}

}