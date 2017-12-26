package com.qhit.lh.gr3.jt.hibernate.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String password;
	
	private Emp emp;
	private Set<Role> roles = new HashSet<>();

	// Constructors
			

	/** default constructor */
	public User(){
	}

	public User(Integer userId, String userName, String password, Emp emp,
			Set<Role> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emp = emp;
		this.roles = roles;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/** full constructor */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}