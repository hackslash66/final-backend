package com.lti.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.lti.entity.Order;
import com.lti.entity.Product;
import com.lti.entity.User;


public class TestOrder {
private EntityManagerFactory factory;
	
	@Before
	public void init()
	{
		factory =Persistence.createEntityManagerFactory("SpringREST");
		
	}
	@Test
	public void testAddOrder() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		User u1 =em.find(User.class, "jkl");
		Product p1=em.find(Product.class, "vivo");
		
		Order o=new Order();
		o.setO_id(10);
		o.setUser(u1);
		o.setProduct(p1);
		
		em.persist(o);
		txn.commit();
		em.close();
	}
	

	
}