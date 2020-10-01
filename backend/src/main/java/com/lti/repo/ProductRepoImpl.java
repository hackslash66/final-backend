package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Product;
/**
 * @author surya
 *
 * @version 1.8
 */
@Repository
public class ProductRepoImpl implements ProductRepo{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Product prod) {
		// TODO Auto-generated method stub
		em.persist(prod);
	}

	@Override
	public Product fetch(String pname) {
		// TODO Auto-generated method stub
		return em.find(Product.class, pname);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return (List<Product>)em.createQuery("from product").getResultList();
	}

}
