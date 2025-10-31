package com.util;

import java.util.Arrays;
import java.util.List;

import com.entity.Customer;

public class CustomerUtil {

	public static List<Customer> getCustomerList() {
		Customer customer1 = Customer.builder().email("chin.cdp@example.com").name("Pran").phoneNo("784512963")
				.location("Chennai").gender("female").build();
		Customer customer2 = Customer.builder().email("dharan.p@example.com").name("Dharan").phoneNo("9784512963")
				.location("Virudhunagar").gender("male").build();

		Customer customer3 = Customer.builder().email("raji.p@example.com").name("Raji").phoneNo("8784512963")
				.location("Tenkasi").gender("female").build();
		Customer customer4 = Customer.builder().email("kannan.t@example.com").name("Kannan").phoneNo("6784512963")
				.location("Madurai").gender("male").build();
		Customer customer5 = Customer.builder().email("nandhu.a@example.com").name("Nandhu").phoneNo("994512963")
				.location("Madurai").gender("male").build();

		return Arrays.asList(customer1, customer2, customer3, customer4, customer5);

	}
	

}
