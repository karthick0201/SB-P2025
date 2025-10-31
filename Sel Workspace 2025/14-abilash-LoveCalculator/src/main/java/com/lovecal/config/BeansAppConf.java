package com.lovecal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.lovecal.controller.AuthInterceptor;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com" })
public class BeansAppConf implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthInterceptor())
			.addPathPatterns("/love-calcultor", 
        					"/calculate", 
        					"/result-page",
        					"/view-history",
        					"save-user", 
        					"/deletehistory/**")
			.excludePathPatterns("/login", "/register", "/validate-user");

	}
	
	/*@Bean
	public ServletRegistrationBean<DispatcherServlet> dispatcherRegistration(DispatcherServlet dispatcherServlet) {
	    ServletRegistrationBean<DispatcherServlet> registration = new ServletRegistrationBean<>(dispatcherServlet, "/");
	    registration.setInitParameters(Collections.singletonMap("sessionTimeout", "15")); // 15 minutes
	    return registration;
	}
	 */
	
}
