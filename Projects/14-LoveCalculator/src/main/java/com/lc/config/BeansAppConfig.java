package com.lc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com" })
public class BeansAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	public JdbcTemplate jdbcTemp() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}

	@Bean
	public DataSource dataSource() {


		String url="jdbc:mysql://localhost:3306/lovecalculator";
		String un = "root";
		String psw = "root";

		DriverManagerDataSource ds = new DriverManagerDataSource(url, un, psw);
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
}
