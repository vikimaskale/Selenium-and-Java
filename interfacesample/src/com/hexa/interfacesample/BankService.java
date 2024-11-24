package com.hexa.interfacesample;

public class BankService implements IBankService{

	public float checkBalance(long accountNumber) {
		System.out.println("checkbalance()....");
		return 0;
	}

	public float depositMoney(long accountNumber, float amount) {
		System.out.println("depositeMoney()...");
		return 0;
	}

}
