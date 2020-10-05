package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Order;
import com.lti.entity.Transaction;
import com.lti.service.OrderService;
import com.lti.service.TransactionService;


/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@CrossOrigin
@RestController
public class TransactionRestController {

	
	@Autowired
	private TransactionService service;
	
	@PostMapping(value = "/transaction" )
	public String AddTransaction(@RequestBody Transaction transaction) {
		service.persist(transaction);
		return "transaction added";
	}
	
	@GetMapping(value="/u_transactions")
	public List<Transaction> fetchTransaction(@RequestParam("orderID") int orderID) {
		System.out.println(orderID);
		List<Transaction> res=service.load(orderID);
		return res;
	}
}
