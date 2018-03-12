package com.qhit.lh.gr3.jt.exam.sjgl.dao.impl;

import java.util.Map;

import com.qhit.lh.gr3.jt.exam.common.bean.PageBean;
import com.qhit.lh.gr3.jt.exam.common.dao.BaseDao;
import com.qhit.lh.gr3.jt.exam.sjgl.bean.Paper;
import com.qhit.lh.gr3.jt.exam.sjgl.dao.PaperDao;

public class PaperDaoImpl extends BaseDao implements PaperDao {

	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> PageBean, Map<String, Object> Parameter, int PageIndex) {
		// TODO Auto-generated method stub
		//getSession.clear();
		StringBuffer hql = new StringBuffer();
		hql.append("select paper from Paper paper where 1 = 1");
		if(parameter.get("csId")){
			
		}
		return null;
	}

}
