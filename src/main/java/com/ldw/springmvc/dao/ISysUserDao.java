package com.ldw.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ldw.springmvc.entity.SysUser;

@Repository
public interface ISysUserDao {
	public void saveUser(SysUser user);
	public SysUser selectById(int uId);
	public void deleteById(int uId);
	public List<SysUser> selectAll();
}
