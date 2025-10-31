package com.lovecal.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration.Dynamic;


//public class MyDispatcherServletInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		
//		// Context Initalition
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//		context.register(BeansAppConf.class);
//		// Create DispatcherServlet Object - excepts config (xml/java) based.
//		DispatcherServlet servlet = new DispatcherServlet(context);
//		
//		Dynamic dynamic = servletContext.addServlet("myDispatcherServlet", servlet);
//		// Setting Load on startup and url pattern
//		dynamic.setLoadOnStartup(1);
//		dynamic.addMapping("/");
//	}
//}