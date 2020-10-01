package com.lti.repo;
/**
 * @author Akshara
 *
 * @version 1.8
 */
import java.util.List;

import com.lti.entity.Order;

public interface OrderRepo {
void save(Order order);
	
	List<Order> list(String uname);
}
