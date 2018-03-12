package com.qhit.lh.gr3.jt.exam.sjgl.bean;

import java.util.Date;

import com.qhit.lh.gr3.jt.exam.bjgl.bean.ClassInfo;

public class PaperClass {
	// Fields

	private Integer pcId;
	private Integer pid;
	private String ccode;
	private Date examDate;
	private Date endDate;
	
	//n-1
	private ClassInfo classInfo;
	//n-1
	private Paper paper;

	// Constructors

	/** default constructor */
	public PaperClass() {
	}

	/** full constructor */
	public PaperClass(Integer pid, String ccode, Date examDate, Date endDate) {
		this.pid = pid;
		this.ccode = ccode;
		this.examDate = examDate;
		this.endDate = endDate;
	}

	// Property accessors

	public Integer getPcId() {
		return this.pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCcode() {
		return this.ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}


}
