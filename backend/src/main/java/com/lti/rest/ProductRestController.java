package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Product;
import com.lti.service.ProductService;

/**
 * 
 * @author  venkat
 *
 */
@CrossOrigin
@RestController
public class ProductRestController {
 
	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/addproduct", consumes = "application/json")
	public String addProduct(@RequestBody Product product) {
		service.persist(product);
		return "Product added successfully";
	}
	
	@GetMapping(value = "/fetchproduct/{pId}", produces = "application/json")
	public Product fetchProduct(@PathVariable int pId) {
		return service.find(pId);
	}
	
	@GetMapping(value = "/listproducts", produces = "application/json")
	public List<Product> listProducts(){
		return service.load();
	}
	
}
