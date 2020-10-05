package com.lti.repo;

import java.util.List;

import com.lti.entity.Transaction;

public interface TransactionRepo {
	
     void save(Transaction trans);
	
	List<Transaction> list(int orderID);
}
