package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getAllProducts() {
	
		return productDao.findAll();
	}

	@Override
	public Page<Product> getProducts(int pageNo, int records) {
			
		Pageable pageable = PageRequest.of(pageNo-1, pageNo);
		return productDao.findAll(pageable);
	}

	@Override
	public Page<Product> getProducts(int pageNo, int pageSize,
										String sortField, String sortDirection) {

		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) 
				? Sort.by(sortField).ascending() 
				: Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
		
		return productDao.findAll(pageable);
	}

	@Override
	public boolean addProduct(List<Product> productsList) {
		
		productDao.saveAll(productsList);
		
		return true;
	}
	@Override
	public boolean addProduct(Product product) {
		
		productDao.save(product);
		
		return true;
	}
	

}
