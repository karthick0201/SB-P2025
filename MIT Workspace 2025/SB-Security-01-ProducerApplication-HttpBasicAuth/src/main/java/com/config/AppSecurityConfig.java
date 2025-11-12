package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	/*
	@Bean
	public SecurityFilterChain secutiyFilterChain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.authorizeHttpRequests(req -> {
			
			req
				.requestMatchers("/api/about-us","/api/message")
				.permitAll()
				.anyRequest()
				.authenticated();
			});
		
		return httpSecurity.build();
	}
*/
	
	  @Bean
	    public UserDetailsService userDetailsService() {
	        UserDetails user = User
	                .withUsername("karthick")
	                .password("{noop}cdp") // {noop} means plain text (for testing only)
	                .roles("USER") // ✅ Assign role
	                .build();

	        return new InMemoryUserDetailsManager(user);
	    }

	    @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> 
	            	auth
	                .requestMatchers("/api/about-us", "/api/message")
	                .permitAll()
	                .requestMatchers("/api/balance", "/api/transfer")
	                .hasRole("USER") // ✅ Require role
	                .anyRequest()
	                .authenticated()
	            )
	            .httpBasic();

	        return http.build();
	    }

}
