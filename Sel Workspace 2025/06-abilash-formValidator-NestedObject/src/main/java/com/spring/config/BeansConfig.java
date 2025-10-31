package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.dto.formatter.PhoneDtoFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com"})
public class BeansConfig implements WebMvcConfigurer {

	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		PhoneDtoFormatter formatter = new PhoneDtoFormatter();
		registry.addFormatter(formatter);
	}
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
