package com.ldw.test.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;

@WebAppConfiguration 
@ContextConfiguration(locations = { "classpath*:springmvc.xml" })
public class JUnitActionBase {
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private MockServletContext servletContext;

	@Autowired
	private MockHttpServletRequest request;

	@Autowired
	private MockHttpServletResponse response;

	@Autowired
	private MockHttpSession session;

	@Autowired
	private ServletWebRequest webRequest;
	
	@Autowired
	private HandlerMapping handlerMapping;
	
	@Autowired
	private HandlerAdapter handlerAdapter;
	
	public ModelAndView executeAction(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HandlerExecutionChain chain = handlerMapping.getHandler(request);
		final ModelAndView model = handlerAdapter.handle(request, response, chain.getHandler());
		return model;
	}
}
