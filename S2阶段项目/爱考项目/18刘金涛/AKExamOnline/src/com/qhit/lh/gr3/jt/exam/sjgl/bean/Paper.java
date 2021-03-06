package com.qhit.lh.gr3.jt.exam.sjgl.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;

public class Paper {

		// Fields

		private Integer pid;
		private String pname;
		private Integer ptime;
		private Integer ptotalScore;
		private Integer csId;
		private Integer qtotal;
		private Integer qscore;
		private String ptype;
		private String pstate;
		
		//n-1
		private Course course;

		//1-n
		private Set<PaperClass> paperClasses = new HashSet<>(); 

		// Constructors

		/** default constructor */
		public Paper() {
		}

		/** full constructor */
		public Paper(String pname, Integer ptime, Integer ptotalScore,
				Integer csId, Integer qtotal, Integer qscore, String ptype,
				String pstate) {
			this.pname = pname;
			this.ptime = ptime;
			this.ptotalScore = ptotalScore;
			this.csId = csId;
			this.qtotal = qtotal;
			this.qscore = qscore;
			this.ptype = ptype;
			this.pstate = pstate;
		}

		// Property accessors

		public Integer getPid() {
			return this.pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

		public String getPname() {
			return this.pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public Integer getPtime() {
			return this.ptime;
		}

		public void setPtime(Integer ptime) {
			this.ptime = ptime;
		}

		public Integer getPtotalScore() {
			return this.ptotalScore;
		}

		public void setPtotalScore(Integer ptotalScore) {
			this.ptotalScore = ptotalScore;
		}

		public Integer getCsId() {
			return this.csId;
		}

		public void setCsId(Integer csId) {
			this.csId = csId;
		}

		public Integer getQtotal() {
			return this.qtotal;
		}

		public void setQtotal(Integer qtotal) {
			this.qtotal = qtotal;
		}

		public Integer getQscore() {
			return this.qscore;
		}

		public void setQscore(Integer qscore) {
			this.qscore = qscore;
		}

		public String getPtype() {
			return this.ptype;
		}

		public void setPtype(String ptype) {
			this.ptype = ptype;
		}

		public String getPstate() {
			return this.pstate;
		}

		public void setPstate(String pstate) {
			this.pstate = pstate;
		}

		public Set<PaperClass> getPaperClasses() {
			return paperClasses;
		}

		public void setPaperClasses(Set<PaperClass> paperClasses) {
			this.paperClasses = paperClasses;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

	}


