package com.lti.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dto.IncomeDto;
import com.lti.entity.AccountDetails;
import com.lti.entity.IncomeDetails;
import com.lti.repository.IncomeDetailsImpl;

public class IncomeServiceImpl implements IncomeService {

	@Autowired
	private IncomeDetailsImpl incomeDet;

	@Override
	public void addIncomeDetails(double accountNo, IncomeDetails incomeDetails) {
		
		//incomeDet.save(incomeDetails);
		
		
	}

}
