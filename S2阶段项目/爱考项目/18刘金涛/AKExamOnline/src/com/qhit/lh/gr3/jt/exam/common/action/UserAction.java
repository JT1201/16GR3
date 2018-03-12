package com.qhit.lh.gr3.jt.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.jt.exam.common.bean.User;
import com.qhit.lh.gr3.jt.exam.common.service.UserService;
import com.qhit.lh.gr3.jt.exam.common.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	
	private User user;
	
	public String login(){
		user = userService.login(user);
		if(user != null	){
			//登陆成功
			System.out.println(user.toString());
			ServletActionContext.getRequest().getSession().setAttribute("user",user);
			return "loginSuccess";
		}else{
			super.addActionError("登录失败，用户名或密码错误！");
			return "loginFail";
		}
	}
	public String logout(){
		//获取Session对象，并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
