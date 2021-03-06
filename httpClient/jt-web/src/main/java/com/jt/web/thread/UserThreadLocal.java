package com.jt.web.thread;

import java.util.Map;

import com.jt.web.pojo.User;

public class UserThreadLocal {
	/**
	 * 关于参数的说明
	 * 	如果需要传递多值则使用Map集合封装
	 */
	private static ThreadLocal<User> userThread = 
			new ThreadLocal<User>();
	
	public static void set(User user){
		
		userThread.set(user);
	}
	
	public static User get(){
		
		return userThread.get();
	}
	
	//防止内存泄漏
	public static void remove(){
		
		userThread.remove();
	}
}
