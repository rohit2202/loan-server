package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import com.lti.dto.CustomerDto.GENDER;

@Entity
@Table(name= "Customer")
@NamedQuery(name = "fetch-all", query = "select c from Customer c")
@NamedQuery(name = "fetch-login", query = ("select c.customerId from Customer c where c.email = :email and c.password = :password"))
public class Customer {

	@Id
	@GeneratedValue
	private long customerId;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="dateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="gender")
	@Enumerated(EnumType.STRING)
	private GENDER gender;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="aadharNo")
	private String aadharNo;
	
	@Column(name="panNo")
	private String panNo;
	
	public static enum GENDER{
		MALE,FEMALE;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	
}
