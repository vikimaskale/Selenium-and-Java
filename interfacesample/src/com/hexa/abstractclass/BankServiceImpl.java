package com.hexa.abstractclass;

public class BankServiceImpl extends BankService{
	private int number;
	@Override
	float checkBalance(long accountNumber) {
		// TODO Auto-generated method stub
		System.out.println("checkBalance()");
		return accountNumber;
	}
	
	void printStatus() {
		System.out.println("checkBalance()");
	}

}
