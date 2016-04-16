package com.ldw.springmvc.service.impl;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ldw.springmvc.dao.ISysUserDao;
import com.ldw.springmvc.entity.SysUser;
import com.ldw.springmvc.service.ISysUserService;
import com.ldw.sqlhelper.SqlSessionHelper;

@Repository
public class SysUserServiceImpl implements ISysUserService {
	
	@Resource
	ISysUserDao userDao;

	public void saveUser(SysUser user) {
	    SqlSessionFactory sqlsf;
		try {
			sqlsf = SqlSessionHelper.getInstance().getSqlSessionFactory("mybatis/Configuration.xml");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	    SqlSession session = sqlsf.openSession();

	    int ret =session.insert("com.ldw.springmvc.dao.ISysUserDao.saveUser",user);
	    System.out.println("saveUser ret = "+ret);
	    session.commit();
	    session.close();
	    
	}

	public SysUser queryUser(int uId) {
		SqlSessionFactory sqlsf;
		try {
			sqlsf = SqlSessionHelper.getInstance().getSqlSessionFactory("mybatis/Configuration.xml");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	    SqlSession session = sqlsf.openSession();

	    SysUser user = session.selectOne("com.ldw.springmvc.dao.ISysUserDao.selectById",uId);
	    System.out.println(user);
	    session.close();
		return user;
	}

	public void saveUserIterface(SysUser user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}

	public SysUser queryUserInterface(int uId) {
		// TODO Auto-generated method stub
		return userDao.selectById(uId);
	}

	@Delete("delete from sys_user where uId=#{uId}")
	public void delUser(int uId) {
		
	}

	@Transactional
	public void delUserInterface(int uId) {
		// TODO Auto-generated method stub
		userDao.deleteById(uId);
	}

}
