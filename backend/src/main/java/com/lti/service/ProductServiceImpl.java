package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Product;
import com.lti.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	@Override
	public void persist(Product product) {
		repo.save(product);
	}

	@Override
	public List<Product> load() {
		return repo.list();
	}

	@Override
	public Product find(String pname) {
		return repo.fetch(pname);
	}
}