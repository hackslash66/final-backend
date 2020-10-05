package com.lti.repo;

import java.util.List;

import com.lti.entity.EMICard;
import com.lti.entity.Order;
import com.lti.entity.Transaction;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

public interface EmicardRepo {

	
	void save(EMICard carddetails);
	
	EMICard list(String cardNo);
	
	void update(EMICard card);
}
