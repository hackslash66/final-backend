package com.lti.service;

import java.util.List;

import com.lti.entity.Transaction;


public interface TransactionService {

	void persist(Transaction trans);
	
	List<Transaction> load(int id);
}
