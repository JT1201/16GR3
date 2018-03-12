package com.qhit.lh.gr3.jt.exam.kmgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.jt.exam.kmgl.dao.CourseDao;
import com.qhit.lh.gr3.jt.exam.kmgl.dao.impl.CourseDaoImpl;
import com.qhit.lh.gr3.jt.exam.kmgl.service.CourseService;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao = new CourseDaoImpl();

	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		// TODO Auto-generated method stub
		return courseDao.getCoursesList(parameter);
	}
	
	
}
