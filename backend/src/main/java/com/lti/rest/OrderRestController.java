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
import com.lti.entity.Product;
import com.lti.entity.User;
import com.lti.service.OrderService;
import com.lti.service.ProductService;
import com.lti.service.UserService;

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
	@Autowired
	private UserService uservice;
	@Autowired
	private ProductService pservice;
	
	@PostMapping(value = "/ord" )
	public String AddOrd(
			@RequestParam(value="duration",required=false) String duration,
			@RequestParam(value="username") String username,
			@RequestParam(value="orderDate") String date,
			@RequestParam(value="productId") int productID){
		User u = uservice.find(username);
		Product p = pservice.find(productID);
		Order o = new Order();
		o.setOrderDate(date);
		o.setEmiDuration("4");
		o.setProduct(p);
		o.setUser(u);
		service.persist(o);
		return "order added";
	}
	
	@PostMapping(value = "/order" )
	public String AddOrd(
			@RequestBody Order order)
			{
		
		System.out.println(order.getUser().getUname()+"  "+
				 order.getProduct().getpId() +"  "+order.getProduct().getpRate()+ order.getOrderDate()+ "  "
				+order.getOrderID());
		User u = uservice.find(order.getUser().getUname());
		Product p = pservice.find(order.getProduct().getpId());
//		Order o = new Order();
//		o.setOrderDate(order.getOrderDate());
//		o.setEmiDuration(order.getEmiDuration());
		order.setProduct(p);
		order.setUser(u);
		
		service.persist(order);
		return "order added";
	}
	
	@GetMapping(value="/u_orders")
	public List<Order> fetchOrder(@RequestParam("username") String username) {
		System.out.println(username);
		List<Order> res=service.load(username);
		return res;
	}
}
