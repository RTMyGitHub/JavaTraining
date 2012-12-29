package com.training.java.struts.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		System.out.println("contextInitialized called");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		servletContextEvent.getServletContext().setAttribute(Constants.SPRING_APP_CTX_NAME, context);
	}

}
