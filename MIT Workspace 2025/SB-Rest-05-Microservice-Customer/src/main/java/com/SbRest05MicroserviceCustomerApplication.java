package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.util.CustomerUtil;

@SpringBootApplication
@EnableFeignClients
//@EnableEurekaServer
@EnableDiscoveryClient
public class SbRest05MicroserviceCustomerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SbRest05MicroserviceCustomerApplication.class, args);
	}
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private Environment environment;
	@Override
	public void run(String... args) throws Exception {
		

		List<Customer> customerList = CustomerUtil.getCustomerList();
		//customerDao.saveAll(customerList);
		//System.out.println(">>-----| TEST CUSTOMERS ARE SAVED... |------<<");
		
		
		String message = environment.getProperty("message");
		System.out.println("\n\n\n\n>>---------------------------------<<\n\n");
		System.out.println(">>----|| Message : " + message);
		System.out.println("\n\n\n\n>>---------------------------------<<\n\n");
	}

}