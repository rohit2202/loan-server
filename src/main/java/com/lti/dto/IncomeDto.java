package com.lti.dto;

public class IncomeDto {
	
	private double accountNo;
	private double income;
	private String typeOfEmployment;
	private String organizationType;
	private String organizationName;
	private String employerName;
	public double getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}
	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

}
