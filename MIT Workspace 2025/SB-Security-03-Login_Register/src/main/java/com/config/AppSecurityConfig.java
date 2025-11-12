package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.service.CustomerService;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	//@Autowired
	//private CustomerService customerService;
	
	@Bean
	public BCryptPasswordEncoder pswEncoder() { // Used to Encrypt and store into db
		
		return new BCryptPasswordEncoder();
	}
 	
	@Bean
	@SneakyThrows
	public SecurityFilterChain filterChain(HttpSecurity http) {
		System.out.println("\n\n>>-------|| SecurityFilterChain Landed...\n\n");

		/* Security Filter Chain:::
		 * Which url security is required and Which url security is not required */
		
			http
			.authorizeHttpRequests(request -> {
				request
					.requestMatchers("/api/register","/api/login")
					.permitAll()
					.anyRequest()
					.authenticated();
				})
				.httpBasic(Customizer.withDefaults()) // enable Basic Auth
				.csrf(csrf -> csrf.disable());   
		
		return http.build();
		
	} 

	@Bean
	public DaoAuthenticationProvider authProvider(
						CustomerService customerService,
						PasswordEncoder encoder) {
		System.out.println("\n\n>>-------|| DaoAuthenticationProvider Landed...\n\n");
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(encoder);
		provider.setPasswordEncoder(pswEncoder());
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
