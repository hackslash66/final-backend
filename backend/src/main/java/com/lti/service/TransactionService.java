package com.lti.service;

import java.util.List;

import com.lti.entity.Transaction;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

public interface TransactionService {

	void persist(Transaction trans);
	
	List<Transaction> load(int id);
}
