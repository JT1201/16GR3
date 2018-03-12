package com.qhit.lh.gr3.jt.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;

public interface CourseDao {
	
	public List<Course> getCoursesList(Map<String,Object> parameter);
}
