package com.lti.service;

import java.util.List;

import com.lti.entity.Order;
import com.lti.entity.User;

/**
 * 
 * @author akshara
 *
 */
public interface OrderService {
	
	void persist(Order ord);
	
	void edit(Order ord);
	
	List<Order> load(String uname);
}