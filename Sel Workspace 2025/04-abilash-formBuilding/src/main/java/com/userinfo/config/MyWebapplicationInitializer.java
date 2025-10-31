package com.userinfo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebapplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	
	public MyWebapplicationInitializer() {
		System.out.println("~~~~~~~~~~> MyWebapplicationInitializer - Class - Default COnstructor...");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClass = {BeansConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings = {"/"};
		return mappings;
	}

}
