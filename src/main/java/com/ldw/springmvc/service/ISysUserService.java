package com.ldw.springmvc.service;

import java.util.List;

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
	 * 1、基于SqlSessionFactory的
	 * @param user
	 */
	int saveUser(SysUser user);
	SysUser queryUser(int uId);
	
	void delUser(int uId);
	
	/**
	 * 2、基于接口的
	 * @param user
	 */
	int saveUserIterface(SysUser user);
	SysUser	queryUserInterface(int uId);
	int delUserInterface(int uId);
	List<SysUser> selectAllInterface();
	/**
	 *3、基于jdbcTemplate 
	 */
//	void saveUserTmpl(SysUser user);
//	void updateUserTmpl(SysUser user);
//	List<SysUser> selectAllTmpl();
}
