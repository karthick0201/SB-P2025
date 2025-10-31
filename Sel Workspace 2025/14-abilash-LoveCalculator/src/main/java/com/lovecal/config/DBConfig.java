package com.lovecal.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = {"classpath:databaseconfig.properties"})
public class DBConfig {
  public DBConfig() {
	  
	  System.out.println("~~~~~~~~ DBCOnfig callled!!!");
}
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
		
		System.out.println("USER NAME : " + userName);
		System.out.println("URL : " + url);
		System.out.println("pASSWORD : " + password);
		
		DriverManagerDataSource ds = new DriverManagerDataSource(url, userName, password);
		 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
	
}
