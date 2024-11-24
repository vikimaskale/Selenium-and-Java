package com.hexaware.assignment4;

public class BankAccount {
	private String accountNo;
	private String accountName;
	private double balance;
	
	//constructors
	public BankAccount() {
		
	}

	public BankAccount(String accountNo, String accountName, long balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public BankAccount(String accountNo, String accountName) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.balance= 1000;
	}

	//getters and setters
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
}
