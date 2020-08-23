package com.lti.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.dto.IncomeDto;
import com.lti.dto.StatusDto;
import com.lti.entity.AccountDetails;
import com.lti.entity.IncomeDetails;
import com.lti.exception.IncomeServiceException;
import com.lti.repository.IncomeDetailsImpl;
import com.lti.service.IncomeService;

public class AddIncomeController {

	@Autowired
	private IncomeService incomeServ;

	@PostMapping(path = "/addIncome", consumes= "multipart/form-data", produces= "application/json")
	public StatusDto addIncome(@RequestBody IncomeDto incomeDto) {
		try {
			IncomeDetails incomeDetails = new IncomeDetails();
			double accountNo = incomeDto.getAccountNo();
			//incomeDetails.setIncome(incomeDto.getIncome());
		
			incomeServ.addIncomeDetails(accountNo, incomeDetails);
			
		/*	BeanUtils.copyProperties(incomeDto, incomeDetails);

IncomeDetailsImpl repo = new IncomeDetailsImpl();
//IncomeDto incomeDto = new IncomeDto();
AccountDetails accountDetails  = repo.findByAccountNo(incomeDto.getAccountNo());

incomeDetails.setAccountDetails(accountDetails);
incomeServ.addIncomeDetails(incomeDetails);
//incomeServ.addIncomeDetails(incomeDetails); */
			StatusDto status = new StatusDto();
			status.setMessage("Registered successfully!");
			status.setStatus(StatusDto.StatusType.SUCCESS);
			return status;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			StatusDto status = new StatusDto();

			if (e instanceof IncomeServiceException) {
				status.setMessage(e.getMessage());
			} else {
				status.setMessage(e.getMessage());
			}

			status.setStatus(StatusDto.StatusType.FAILURE);
			return status;
		}
	}

}
