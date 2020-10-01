package com.lti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Order;
import com.lti.service.OrderService;

/**
 * 
 * @author akshara
 *
 */

@CrossOrigin
@RestController
public class OrderRestController {

	@Autowired
	private OrderService service;
	
	@PostMapping(value = "/ord", consumes = "application/json")
	public String AddOrd(@RequestBody Order ord)
	{
		service.persist(ord);
		return "order added";
	}
}