package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Loan")
public class Loan {

	@Id
	private int loanId;
	
	@ManyToOne
	@JoinColumn(name ="accountNo")
	private AccountDetails accountDetails;
	private double amountEligible;
	private String loanStatus;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public AccountDetails getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}
	public double getAmountEligible() {
		return amountEligible;
	}
	public void setAmountEligible(double amountEligible) {
		this.amountEligible = amountEligible;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	

}
