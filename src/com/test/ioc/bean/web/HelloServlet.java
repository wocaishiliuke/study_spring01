package com.test.ioc.bean.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

//@WebServlet(name = "HelloServlet", urlPatterns="/", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//传统方式：
		//HelloService helloService = new HelloService();
		
		//使用new，多个请求还是会多次加载xml，多次创建ac实例
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-web.xml");
		
		//方式1
		//ApplicationContext ac = (ApplicationContext) request.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//ApplicationContext ac = (ApplicationContext) this.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		//方式2
		//WebApplicationContext是ApplicationContext的子接口
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
		HelloService helloService=(HelloService)ac.getBean("helloService");
		helloService.sayHello();
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().print("来自HelloServlet响应");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
