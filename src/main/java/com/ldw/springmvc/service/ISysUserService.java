package com.ldw.springmvc.service;

import java.util.List;

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
	 * 1������SqlSessionFactory��
	 * @param user
	 */
	int saveUser(SysUser user);
	SysUser queryUser(int uId);
	
	void delUser(int uId);
	
	/**
	 * 2�����ڽӿڵ�
	 * @param user
	 */
	int saveUserIterface(SysUser user);
	SysUser	queryUserInterface(int uId);
	int delUserInterface(int uId);
	List<SysUser> selectAllInterface();
	/**
	 *3������jdbcTemplate 
	 */
//	void saveUserTmpl(SysUser user);
//	void updateUserTmpl(SysUser user);
//	List<SysUser> selectAllTmpl();
}
