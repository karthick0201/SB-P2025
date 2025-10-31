package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebapplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c = {BeansAppConfig.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] m = {"/"};
		return m;
	}
	

}
