package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.EMICard;
import com.lti.entity.Transaction;
import com.lti.repo.EmicardRepo;
import com.lti.repo.TransactionRepo;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Service
public class EmicardServiceImpl implements EmicardService{

	@Autowired
	private EmicardRepo repo;
	
	@Override
	public void persist(EMICard emicard) {
		// TODO Auto-generated method stub
		repo.save(emicard);
	}

	@Override
	public EMICard load(String cardNo) {
		// TODO Auto-generated method stub
		 EMICard res=repo.list(cardNo);
			return res;
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void edit(EMICard card) {
		// TODO Auto-generated method stub
		repo.update(card);
	}

}
