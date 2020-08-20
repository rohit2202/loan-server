package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AccountDetails")
public class AccountDetails {

	@Id
	private double accountNo;
	
	@ManyToOne
	@JoinColumn (name = "customerId")
	private Customer customer;
	private String accountType;
	private LocalDate accountOpeningDate;
	private String accountIfscCode;
	private String branchDetails;
	private double balance;
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	public String getAccountIfscCode() {
		return accountIfscCode;
	}
	public void setAccountIfscCode(String accountIfscCode) {
		this.accountIfscCode = accountIfscCode;
	}
	public String getBranchDetails() {
		return branchDetails;
	}
	public void setBranchDetails(String branchDetails) {
		this.branchDetails = branchDetails;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
