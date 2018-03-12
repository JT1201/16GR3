package com.qhit.lh.gr3.jt.exam.tkgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.jt.exam.common.bean.PageBean;
import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.jt.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.jt.exam.tkgl.service.QuestionService;
import com.qhit.lh.gr3.jt.exam.tkgl.service.impl.QuestionServiceImpl;

public class QuestionAction extends ActionSupport {
	private QuestionService questionService = new QuestionServiceImpl();
	private Course course;
	private String major;
	private String stage;
	private List<Course> listCourse = new ArrayList<>();
	private PageBean<WrittenQuestion> pageBean = new PageBean<WrittenQuestion>();
	private int pageIndex;
	private WrittenQuestion writtenQuestion;
	
	public String getCourseInfo(){
		//设置参数
		Map<String, String> parameter = new HashMap<>();
		if(major != null && !"".equals(major)){
			parameter.put("major", major);
		}
		if(stage != null && !"".equals(stage)){
			parameter.put("stage", stage);
		}
		//查询题库列表数据
		listCourse = questionService.getCoursesInfo(parameter);
		System.out.println(listCourse.size());
		return "listCourse";
	}
	/**
	 * 获取试题列表
	 * @return
	 */
	public String getWrittenList(){
		pageBean = questionService.getWrittenList(pageBean, course, pageIndex);
		System.out.println("数据大小："+pageBean.getItems().size());
		System.out.println("course.csId:"+course.getCsId());
		System.out.println("course.csName:"+course.getCsName());
		return "listWritten";
	}
	/**
	 * 添加笔试题
	 * @return
	 */
	public String addWrittenQuestion(){
		//System.out.println("进入Action");
		System.out.println("科目ID:"+writtenQuestion.getCsId());
		
		writtenQuestion.setCourse(course);
		//System.out.println("123456");
		//接收并保存参数
		//ServletActionContext.getRequest().setAttribute("csId", course.getCsId());
		//ServletActionContext.getRequest().setAttribute("csName", course.getCsId());
		questionService.addWrittenQuestion(writtenQuestion);
		return "addWrittenQuestion";
	}
	public String getWrittenQuestionById(){
		writtenQuestion = questionService.getWrittenQuestionById(writtenQuestion);
		return "getWrittenQuestionById";
	}
	/**
	 * 根据试题编号查询试题对象
	 * @return
	 */
	public String getWrittenTestById(){
		writtenQuestion = questionService.getWrittenQuestionById(writtenQuestion);
		return "getWrittenQuestionById";
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public List<Course> getListCourse() {
		return listCourse;
	}
	public void setListCourse(List<Course> listCourse) {
		this.listCourse = listCourse;
	}
	

}
