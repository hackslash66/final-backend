package com.lti.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;


import com.lti.entity.Product;
import com.lti.entity.User;




public class TestUser {
private EntityManagerFactory factory;
	
	@Before
	public void init()
	{
		factory =Persistence.createEntityManagerFactory("SpringREST");
		
	}
	@Test
	public void testAddProduct() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Product p1 =new Product();
		p1.setPname("sam");
		p1.setPdetails("good");
		p1.setPrate(5512);	
		em.persist(p1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testAddUser() {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =new User();
		u1.setName("Yash");
		u1.setAddress("jdjd");
		u1.setStatus("yes");
		u1.setAccount("45123");
		u1.setCard("gold");
		u1.setPhone("97845623");
		u1.setIfsc("45552");
		u1.setUname("qwerty");
		u1.setPassword("mejdj");
		u1.setEmail("yash@gmail.com");
		u1.setBank("HDFC");
		
		em.persist(u1);
		txn.commit();
		em.close();
		
	}
	
	

	@Test
	public void testDeleteUser() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =em.find(User.class, "jkl");
		em.remove(u1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testFetchUser() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =em.find(User.class, "jkl");
		System.out.println(u1.getName()+"\t"+u1.getBank());
	}
	
	@Test
	public void testfetchUsers() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		List<User> li=em.createQuery("from User").getResultList();
		for (User u : li) {
			System.out.println(u.getUname());
		}
		txn.commit();
		em.close();
	}
	
}