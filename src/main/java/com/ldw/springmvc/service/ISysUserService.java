package com.ldw.springmvc.service;

import org.springframework.stereotype.Repository;

import com.ldw.springmvc.entity.SysUser;

/**
 * 1������ģ���mybatis���
 * 2������ӿڵ�mybatis���
 * @author ldw
 *
 */

public interface ISysUserService {
	/**
	 * 1������ģ���
	 * @param user
	 */
	void saveUser(SysUser user);
	SysUser queryUser(int uId);
	
	void delUser(int uId);
	
	/**
	 * 2�����ڽӿڵ�
	 * @param user
	 */
	void saveUserIterface(SysUser user);
	SysUser	queryUserInterface(int uId);
	void delUserInterface(int uId);
}
