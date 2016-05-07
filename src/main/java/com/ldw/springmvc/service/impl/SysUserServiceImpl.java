package com.ldw.springmvc.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ldw.springmvc.dao.ISysUserDao;
import com.ldw.springmvc.entity.SysUser;
import com.ldw.springmvc.service.ISysUserService;
import com.ldw.sqlhelper.SqlSessionHelper;

@Service
public class SysUserServiceImpl implements ISysUserService {
	
	@Resource
	ISysUserDao userDao;
	
	@Resource
	JdbcTemplate jdbcTemplate;

	public int saveUser(SysUser user) {
	    SqlSessionFactory sqlsf;
		try {
			sqlsf = SqlSessionHelper.getInstance().getSqlSessionFactory("mybatis/Configuration.xml");
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		
		SqlSession session = null;
		int ret = 0;
		try {
			session = sqlsf.openSession();
			
			ret =session.insert("com.ldw.springmvc.dao.ISysUserDao.saveUser",user);
			System.out.println("saveUser ret = "+ret);
			
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		} finally {
			session.commit();
			session.close();
		}
	    return ret;
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

	@Transactional
	public int saveUserIterface(SysUser user) {
		int ret = userDao.saveUser(user);
		return ret;
	}

	public SysUser queryUserInterface(int uId) {
		System.out.println();
		return userDao.selectById(uId);
	}

	@Delete("delete from sys_user where uId=#{uId}")
	public void delUser(int uId) {
		
	}

	@Transactional
	public int delUserInterface(int uId) {
		int ret = userDao.deleteById(uId);
		return ret;
	}

	public List<SysUser> selectAllInterface() {
		List<SysUser> ulist = userDao.selectAll();
		
		return ulist;
	}	

}
