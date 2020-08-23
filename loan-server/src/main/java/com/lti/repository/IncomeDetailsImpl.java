package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.AccountDetails;
import com.lti.entity.Customer;
import com.lti.entity.IncomeDetails;

@Repository
public class IncomeDetailsImpl {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public AccountDetails findByAccountNo(double accountNo) {
		return entityManager.find(AccountDetails.class, accountNo);
		//return entityManager.create
	}

	public void save(IncomeDetails incomeDetails) {
		entityManager.merge(incomeDetails);
	}
}
