package com.qhit.lh.gr3.jt.strutsSBM.utils;

import java.util.UUID;


/**
 * @author 刘金涛
 *TODO
 * 2017年12月10日下午6:40:52
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
