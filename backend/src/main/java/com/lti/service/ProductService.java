package com.lti.service;

import java.util.List;

import com.lti.entity.Product;

public interface ProductService {
	
	void persist(Product product);
	
	Product find(String pname);
	
	List<Product> load();
}	
