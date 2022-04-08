package com.hackerearth.receiver.model;

public class Transaction {
	
	private String accountNumber;
	private String type;
	private Long amount;
	private String currency;
	private String accountForm;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAccountForm() {
		return accountForm;
	}
	public void setAccountForm(String accountForm) {
		this.accountForm = accountForm;
	}

}
