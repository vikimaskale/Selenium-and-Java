package com.hexaware.assignment4;

import java.util.Arrays;

public class Bank implements IBankServiceProvider{
	private BankAccount[] bankAccounts;
	private int lastAssignedNo=0;
	
	//constructor
	public Bank() {
		
	}
	public Bank(int totAccount) {
		bankAccounts= new BankAccount[totAccount];
	}
	
	public BankAccount createBankAccount(String accountName, long balance ) {
		BankAccount newBankAccount= null;
		if(lastAssignedNo<this.bankAccounts.length) {
			lastAssignedNo++;
			newBankAccount= new BankAccount(Integer.toString(lastAssignedNo),
					accountName, balance);
			this.bankAccounts[lastAssignedNo-1]=newBankAccount;
		}
		return newBankAccount;
	}
	
	//getters and setters
	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(BankAccount[] bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	@Override
	public BankAccount checkAccount(String accountNo) {
		BankAccount account=null;
		for(BankAccount currBankAccount: this.bankAccounts) {
			if(currBankAccount.getAccountNo().equals(accountNo)) {
				account=currBankAccount;
			}
		}
		return account;
	}

	@Override
	public double getBalance(BankAccount account) {
		return account.getBalance();
	}

	@Override
	public boolean depositMoney(BankAccount account, double amount) {
		boolean isMoneyDeposited=false;
		if(checkAccount(account.getAccountNo()) != null) {
			account.setBalance(account.getBalance()+amount);
			isMoneyDeposited=true;
		}
		return isMoneyDeposited;
	}

	@Override
	public boolean withdrawMoney(BankAccount account, double amount) {
		boolean isMoneyWithdrawed=false;
		if(checkAccount(account.getAccountNo()) != null) {
			double currBalance= account.getBalance();
			if(currBalance>= amount) {
				account.setBalance(currBalance-amount);
				isMoneyWithdrawed=true;
			}
		}
		return isMoneyWithdrawed;
	}

	@Override
	public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount, long amount) {
		boolean hasTransferMoney=false;
		if(withdrawMoney(fromAccount,amount) && depositMoney(toAccount, amount)) {
			hasTransferMoney=true;
		}
		return hasTransferMoney;
	}
	@Override
	public String toString() {
		return "Bank [bankAccounts=" + Arrays.toString(bankAccounts) + ", lastAssignedNo=" + lastAssignedNo + "]";
	}
	
	
}
