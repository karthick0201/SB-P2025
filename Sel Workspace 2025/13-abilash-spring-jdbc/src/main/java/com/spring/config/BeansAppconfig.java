package com.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com"})
@PropertySource(value = {"classpath:databaseconfig.properties"})
public class BeansAppconfig {

	@Value("${mysql.userName}")
	private String userName;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.url}")
	private String url;
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean
	public DataSource getDataSource() {
		DataSource ds = new DriverManagerDataSource(url, userName, password);
		return ds;
	}
	
	
}
