package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.entity.Order;

/**
 * @author Akshara
 *
 * @version 1.8
 */
@Repository
public class OrderRepoImpl implements OrderRepo {

private JdbcTemplate jdbcTemp;
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public void save(Order order) {
		
		em.persist(order);
	}

	@Override
	public List<Order> list(String uname) {
		// TODO Auto-generated method stub
		String sql="select * from orders where uname=?";
		List result = jdbcTemp.queryForList(sql, uname);
		
		return result;
	}

}
