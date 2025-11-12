package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.service.CustomerService;

import lombok.SneakyThrows;

@Configuration
public class AppSecurityConfig {

	@Autowired
	private JWTFilter jwtFilter;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	@SneakyThrows
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.authorizeHttpRequests(reqMatcher -> {
			
			reqMatcher
				.requestMatchers("/api/register","/api/login")
				.permitAll()
				.anyRequest()
				.authenticated();
		})
		.httpBasic(Customizer.withDefaults())
		.csrf(csrf -> csrf.disable());  
		
		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
		
	}
	
	@Bean
	public DaoAuthenticationProvider authProvider(CustomerService customerService) {
		System.out.println("\n\n>>-------|| SecurityFilterChain Landed...\n\n");

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		provider.setPasswordEncoder(passwordEncoder());
		provider.setUserDetailsService(customerService);
		
		return provider;
	}
	@Bean
	@SneakyThrows
	public AuthenticationManager authManager(AuthenticationConfiguration config) {
		System.out.println("\n\n>>-------|| AuthenticationManager Landed...\n\n");

		return config.getAuthenticationManager();
	}
}
