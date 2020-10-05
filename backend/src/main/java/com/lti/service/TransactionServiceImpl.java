package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Order;
import com.lti.entity.Transaction;
import com.lti.repo.TransactionRepo;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Service
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepo repo;
	
	@Override
	public void persist(Transaction trans) {
		// TODO Auto-generated method stub
		repo.save(trans);
	}

	@Override
	public List<Transaction> load(int id) {
		// TODO Auto-generated method stub
         List<Transaction> res=repo.list(id);
		return res;
	}

}
