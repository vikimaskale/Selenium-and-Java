package com.hexaware.assignment4;

public class Main {
	public static void main(String[] args) {
		Bank bank= new Bank(3);
		BankAccount account1=bank.createBankAccount("Vikram", 2000);
		BankAccount account2=bank.createBankAccount("Raj", 1000);
		BankAccount account3=bank.createBankAccount("Rajas", 3000);
		
		//checking account created or not
		System.out.println(bank.checkAccount("3")); //print account details
		System.out.println(bank.checkAccount("6")); //null
	
		//checking my balance
		System.out.println(bank.getBalance(account1)); //2000
		
		//deposit money
		System.out.println(bank.depositMoney(account1, 1000)); //true
		System.out.println(bank.getBalance(account1)); //3000
		
		//withdraw money
		System.out.println(bank.withdrawMoney(account2, 1000)); //true
		System.out.println(bank.getBalance(account2)); //0
		System.out.println(bank.withdrawMoney(account2, 1000));
		System.out.println(bank.getBalance(account2)); //0
		
		System.out.println(bank.transferMoney(account1, account3, 3000));
		System.out.println(bank.getBalance(account1)); //0
		System.out.println(bank.getBalance(account3)); //6000
		
		
	}
}
