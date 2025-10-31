package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses = {BeansConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[] = {"/"};
		return mapping;
		
	}
	
	
	

}
