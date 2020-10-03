package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Order;
import com.lti.repo.OrderRepo;
import com.lti.repo.UserRepo;

/**
 * 
 * @author akshara
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo repo;
	@Override
	public void persist(Order ord) {
		repo.save(ord);

	}

	@Override
	public List<Order> load(String uname) {
		
		List<Order> res=repo.list(uname);

		
		
		return res;
	}

}