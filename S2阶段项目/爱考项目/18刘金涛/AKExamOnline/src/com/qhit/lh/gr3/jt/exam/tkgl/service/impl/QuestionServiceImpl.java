package com.qhit.lh.gr3.jt.exam.tkgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.jt.exam.common.bean.PageBean;
import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.jt.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.jt.exam.tkgl.dao.QuestionDao;
import com.qhit.lh.gr3.jt.exam.tkgl.dao.impl.QuestionDaoImpl;
import com.qhit.lh.gr3.jt.exam.tkgl.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();

	@Override
	public List<Course> getCoursesInfo(Map parameter) {
		// TODO Auto-generated method stub
		return questionDao.getCoursesInfo(parameter);
	}

	@Override
	public PageBean<WrittenQuestion> getWrittenList(PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	@Override
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

}
