package com.conversion;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

	@XmlElement
	private int orderId;
	
	@XmlElement
	private String customerName;
	
	@XmlElementWrapper(name = "products_list")
	@XmlElement(name = "product")
	private List<Product> products;
	
	public Order(int orderId, String customerName, List<Product> products) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.products = products;
	}
	
	public Order() {
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", products=" + products + "]";
	}

	
	
	
	
}
