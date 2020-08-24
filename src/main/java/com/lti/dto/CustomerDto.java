package com.lti.dto;

//package com.lti.entity;

import java.time.LocalDate;

public class CustomerDto {
	private String customerName;
	private LocalDate dateOfBirth;
	private String email;
	private String password;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerDto() {
		super();
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
	}
	
	
	

}