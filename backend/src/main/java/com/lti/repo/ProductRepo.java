package com.lti.repo;

import java.util.List;

import com.lti.entity.Product;
/**
 * @author surya
 *
 * @version 1.8
 */
public interface ProductRepo {
void save(Product prod);
	
	Product fetch(int pId);
	
	List<Product> list();
}
