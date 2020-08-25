package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.exception.CustomerServiceException;
import com.lti.repository.CustomerRepository;

//@Component
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer register(Customer customer) {
		if (!customerRepo.isCustomerPresent(customer.getEmailid())) {
			customerRepo.save(customer);
		} else {
			throw new CustomerServiceException("Customer Already Registered!");
		}
		return customer;
	}

	@Override
	public Customer login(String email, String password) {
		try {

			if (!customerRepo.isCustomerPresent(email)) {
				throw new CustomerServiceException("User does not exits!");
			}

			long id = customerRepo.findByUsernamePassword(email, password);
			Customer customer = customerRepo.findById(id);
			return customer;

		} catch (EmptyResultDataAccessException e) {
			throw new CustomerServiceException("Incorrect email or password");
		}
	}
}