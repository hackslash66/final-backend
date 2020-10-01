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
		
		em.persist(prod);
	}

	@Override
	public Product fetch(int pId) {
		
		return em.find(Product.class, pId);
	}

	@Override
	public List<Product> list() {
		return em.createQuery("from Product").getResultList();
	}

}
