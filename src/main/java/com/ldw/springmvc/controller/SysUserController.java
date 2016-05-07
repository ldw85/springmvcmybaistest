package com.ldw.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ldw.springmvc.entity.SysUser;
import com.ldw.springmvc.service.ISysUserService;

@Controller
@RequestMapping("/sysuser")
public class SysUserController {
	
	@Autowired
	ISysUserService userService;
	
	@RequestMapping(value="/adduser")
	public String addUser(SysUser user){
		userService.saveUser(user);
		return "addresult";
	}
	
	@RequestMapping(value="/query/{uId}",method=RequestMethod.GET)
	public String queryUser(@PathVariable("uId") Integer uId,ModelMap map){
		SysUser user = userService.queryUserInterface(uId);
		System.out.println(user);
		map.put("user", user);
		return "userdetail";
	}
	
	@RequestMapping(value="/list")
	public String listUser(ModelMap map){
		List<SysUser> list = userService.selectAllInterface();
		map.put("list", list);
		return "userlist";
	}
	
	@ResponseBody
	@RequestMapping(value="/listjson")
	public List<SysUser> listUser(){
		List<SysUser> list = userService.selectAllInterface();
		return list;
	}
	
	@RequestMapping("/useradd")
	public String userAddJsp(){
		return "adduser";
	}
	
	@RequestMapping("/del/{uId}")
	public String deluser(@PathVariable("uId") Integer uId,ModelMap map){
		int ret = userService.delUserInterface(uId);
		if(ret!=-1){
			return listUser(map);
		}else{
			return "../error/error";
		}
	}
	
	@RequestMapping("/hello")
	public String sayhello(){
		return "hello";
	}
	
}
