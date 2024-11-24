package com.hexa.abstractclass;

abstract class BankService {
	abstract float checkBalance(long accountNumber); //method declaration/ abstract method
	
	float depositMoney(long accountNumber, float amount) {
		System.out.println("depositMoney()");
		return 0;
	}
}
