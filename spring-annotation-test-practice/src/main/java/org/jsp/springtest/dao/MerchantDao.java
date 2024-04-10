package org.jsp.springtest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

import org.jsp.springtest.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MerchantDao {
	@Autowired
	private EntityManager entityManager;

	@Transactional
	public Merchant saveMerchant(Merchant merchant) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityManager.persist(merchant);
		entityTransaction.begin();
		entityTransaction.commit();
		return merchant;
	}
}
