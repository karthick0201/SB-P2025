package com.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Page<Product> getProducts(int pageNo, int records);
	
	public Page<Product> getProducts(int pageNo, int pageSize, String sortField, String sortDirection);
	
	public boolean addProduct(List<Product> productsList);
	
	public boolean addProduct(Product product);

}
