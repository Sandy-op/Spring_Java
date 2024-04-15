package org.jsp.springtest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.springtest.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
	@Autowired
	private EntityManager entityManager;

	public Merchant saveMerchant(Merchant merchant) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.persist(merchant);
		entityTransaction.begin();
		entityTransaction.commit();
		return merchant;
	}
	
	public Merchant updateMerchant(Merchant merchant) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Merchant dbmerchant = entityManager.find(Merchant.class, merchant.getId());
		if(dbmerchant != null) {
			dbmerchant.setName(merchant.getName());
			dbmerchant.setPhone(merchant.getPhone());
			dbmerchant.setEmail(merchant.getEmail());
			dbmerchant.setGst_number(merchant.getGst_number());
			dbmerchant.setPassword(merchant.getPassword());
			entityTransaction.begin();
			entityTransaction.commit();
			return dbmerchant;
		}
		return null;
	}

}
