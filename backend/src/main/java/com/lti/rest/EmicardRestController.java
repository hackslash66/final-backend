package com.lti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.EMICard;
import com.lti.entity.Order;
import com.lti.entity.Transaction;
import com.lti.entity.User;
import com.lti.service.EmicardService;
import com.lti.service.UserService;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@CrossOrigin
@RestController
public class EmicardRestController {

	@Autowired
	private EmicardService service;
	
	@PostMapping(value = "/emicard" )
	public String addCard(@RequestBody EMICard emicard)
	{
		
		service.persist(emicard);
		return "Card added successfully";
	}
	
	@GetMapping(value="/listemidetails")
	public EMICard fetchCard(@RequestParam("cardNo") String cardNo) {
		System.out.println(cardNo);
		EMICard res=service.load(cardNo);
		return res;
	}
	
	
	@PutMapping(value = "/editemicard", consumes = "application/json")
	public String updateCard(@RequestBody EMICard card) {
		service.edit(card);
		return "Card updated successfully";
	}
}
