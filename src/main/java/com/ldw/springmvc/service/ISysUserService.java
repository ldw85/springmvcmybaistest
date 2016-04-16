package com.ldw.springmvc.service;

import org.springframework.stereotype.Repository;

import com.ldw.springmvc.entity.SysUser;

/**
 * 1、基于模板的mybatis编程
 * 2、面向接口的mybatis编程
 * @author ldw
 *
 */

public interface ISysUserService {
	/**
	 * 1、基于模板的
	 * @param user
	 */
	void saveUser(SysUser user);
	SysUser queryUser(int uId);
	
	void delUser(int uId);
	
	/**
	 * 2、基于接口的
	 * @param user
	 */
	void saveUserIterface(SysUser user);
	SysUser	queryUserInterface(int uId);
	void delUserInterface(int uId);
}
