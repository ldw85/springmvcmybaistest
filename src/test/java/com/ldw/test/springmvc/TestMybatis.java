package com.ldw.test.springmvc;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ldw.springmvc.entity.SysUser;
import com.ldw.springmvc.service.ISysUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestMybatis{

	@Resource
	ISysUserService userService;
	
	@Test
	public void testSaveUser(){
		SysUser user = new SysUser();
	    user.setuId(4);
	    user.setuName("liu diwei4");
	    user.setuAge(31);
	 
	    //userService.saveUser(user);
	    userService.saveUserIterface(user);
	}
	
	@Test
	public void testQueryUser(){
		SysUser user = null;	 
		//user = userService.queryUser(2);
		user = userService.queryUserInterface(3);
		System.out.println(user.toString());
	}
	
	@Test
	public void testDelUser(){
		userService.delUserInterface(3);
		System.out.println(userService.queryUserInterface(3));
	}
	
	@Test 
	public void testQueryAllUsers(){
		List<SysUser> ulist = userService.selectAllInterface();
		for (SysUser sysUser : ulist) {
			System.out.println(sysUser.toString());
		}
	}
	
	
}
