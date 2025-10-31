package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInialitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?>[] c= {BeansAppConfig.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		String[] s= {"/"};
		return s;
	}
}