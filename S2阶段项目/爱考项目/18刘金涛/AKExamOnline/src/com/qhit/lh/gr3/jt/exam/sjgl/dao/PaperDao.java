package com.qhit.lh.gr3.jt.exam.sjgl.dao;

import java.util.Map;

import com.qhit.lh.gr3.jt.exam.common.bean.PageBean;
import com.qhit.lh.gr3.jt.exam.sjgl.bean.Paper;

public interface PaperDao {
	
	/**
	 * 查询试卷列表
	 * @param PageBean
	 * @param Parameter
	 * @param PageIndex
	 * @return
	 */
	public PageBean<Paper> getPaperList(PageBean<Paper> PageBean, Map<String, Object> Parameter, int PageIndex);
}
