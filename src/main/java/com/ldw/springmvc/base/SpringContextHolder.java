package com.ldw.springmvc.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHolder implements ApplicationContextAware {
	private static ApplicationContext context = null;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextHolder.context = applicationContext;
	}
	
	public static ApplicationContext getApplicationContext(){
		checkApplicationContext();
		return context;
	}
	
	public static <T> T getBean(String name){
		checkApplicationContext();
		return (T)context.getBean(name);
	} 
	
	public static <T> T getBean(Class<T> clazz){
		checkApplicationContext();
		return (T) context.getBean(clazz);
	}
	
	public static void cleanApplicationContext(){
		context = null;
	}
	
	private static void checkApplicationContext(){
		if(context==null)
			throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");
	}

}
