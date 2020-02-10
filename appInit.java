package com.cts.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class appInit implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
	AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
	context.register(AppCofig.class);
	context.setServletContext(servletContext);
	ServletRegistration.Dynamic serv=servletContext.addServlet("dispatcher", new DispatcherServlet(context));
	
		serv.setLoadOnStartup(1);
		serv.addMapping("/");
	}

}
