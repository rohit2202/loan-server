package com.lti.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dto.IncomeDto;
import com.lti.entity.IncomeDetails;
import com.lti.repository.IncomeDetailsImpl;

public class IncomeServiceImpl implements IncomeService {

	@Autowired
	private IncomeDetailsImpl incomeDet;

	@Override
	public void addIncomeDetails(IncomeDetails incomeDetails) {
		
		//incomeDet.save(incomeDetails);
		incomeDet.save(incomeDetails);
		
		
	}

}
//primary key for each entity is different