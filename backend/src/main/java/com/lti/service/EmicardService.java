package com.lti.service;

import java.util.List;

import com.lti.entity.EMICard;
import com.lti.entity.Order;
import com.lti.entity.Transaction;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

public interface EmicardService {

	void persist(EMICard emicard);
	
	EMICard load(String cardNo);
	
	void edit(EMICard card);
}
