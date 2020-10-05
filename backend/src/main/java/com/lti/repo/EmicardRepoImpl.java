package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.EMICard;
import com.lti.entity.Transaction;
import com.lti.entity.User;

/**
 * @author Yashwanth
 *
 * @version 1.8
 */

@Repository
public class EmicardRepoImpl implements EmicardRepo{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void save(EMICard carddetails) {
		// TODO Auto-generated method stub
		em.persist(carddetails);
		
	}

	@Override
	public EMICard list(String cardNo) {
		Query query = em.createNamedQuery("carddetails");
		query.setParameter("cardNo", cardNo);
		return (EMICard) query.getSingleResult();
	}

	@Override
	public void update(EMICard card) {
		// TODO Auto-generated method stub
		em.merge(card);
	}

}
