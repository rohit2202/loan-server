package com.lti.dto;

//package com.lti.entity;

import java.time.LocalDate;

public class CustomerDto {
	private String customerName;
	private LocalDate dateOfBirth;
	private String email;
	private String password;
	private String nationality;
	private int aadharNo;
	private String panNo;
	private int phone;
	private GENDER gender;
	
	public enum GENDER{
		MALE,FEMALE
	}
	
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
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
		this.nationality = nationality;
		this.panNo = panNo;
		this.aadharNo = aadharNo;
		this.phone = phone;
		this.gender = gender;
	}
	
	
	

}