package com.qhit.lh.gr3.jt.exam.tkgl.dao.impl;

import java.util.List;
import java.util.Map;


import org.hibernate.Query;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.jt.exam.common.bean.PageBean;
import com.qhit.lh.gr3.jt.exam.common.dao.BaseDao;
import com.qhit.lh.gr3.jt.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.jt.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.jt.exam.tkgl.dao.QuestionDao;

public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	@Override
	public List<Course> getCoursesInfo(Map parameter) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where 1 = 1");
		// 拼接hql
		if (parameter.get("major") != null && !"".equals(parameter.get("major"))) {
			hql.append(" and course.major = :major");
		}
		if (parameter.get("stage") != null && !"".equals(parameter.get("stage"))) {
			hql.append(" and course.stage = :stage");
		}
		// 获取查询器
		Query query = getSession().createQuery(hql.toString());
		// 设置参数
		if (parameter.get("major") != null && !"".equals(parameter.get("major"))) {
			query.setString("major", (String) parameter.get("major"));
		}
		if (parameter.get("stage") != null && !"".equals(parameter.get("stage"))) {
			query.setString("stage", (String) parameter.get("stage"));
		}
		// 执行查询
		return query.list();
	}

	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, 
			Course course,
			int pageIndex) {
		System.out.println("进入Dao");
		//hql语句
		StringBuffer hql = new StringBuffer();
		hql.append("select w from WrittenQuestion w where w.csId = :csId");
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置分页查询参数
		query.setInteger("csId", course.getCsId());
		//总记录数
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setCurrentIndex(pageIndex);
		//当前页数据
		List<WrittenQuestion> items = query.setFirstResult((pageBean.getCurrentIndex()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();
		//设置pagebean的数据集合
		pageBean.setItems(items);
		
		return pageBean;
	}

	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		System.out.println("进入Dao");
		//开启事务
		Transaction ts = getSession().beginTransaction();
		//执行添加，返回新纪录的主键
		long id = (Integer) getSession().save(writtenQuestion);
		//提交事务
		ts.commit();
	}

	@Override
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return (WrittenQuestion) getSession().get(WrittenQuestion.class, writtenQuestion.getQid());
	}

	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		Transaction ts = getSession().beginTransaction();
		getSession().update(writtenQuestion);
		ts.commit();

	}

}
