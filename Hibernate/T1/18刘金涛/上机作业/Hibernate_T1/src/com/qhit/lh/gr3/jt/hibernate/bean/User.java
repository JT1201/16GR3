package com.qhit.lh.gr3.jt.hibernate.bean;

public class User {
	private int id;
	private String name;
	private String pwd;
	private String sex;
	public User(int id, String name, String pwd, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.sex = sex;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return id+"/"+name+"/"+pwd+"/"+sex;
	}
	
	

}
