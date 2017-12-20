package com.qhit.lh.gr3.jt.hibernate.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer depeId;
	private String deptName;
	private String deptAdress;
	
	private Set<Emp> emps = new HashSet<>();

	// Constructors

	/** default constructor */
	public Dept() {
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	/** full constructor */
	public Dept(String deptName, String deptAdress) {
		this.deptName = deptName;
		this.deptAdress = deptAdress;
	}

	// Property accessors

	public Integer getDepeId() {
		return this.depeId;
	}

	public void setDepeId(Integer depeId) {
		this.depeId = depeId;
	}

	public String getDeptName() {
		return this.deptName;
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