package com.hexa.interfacesample;

import com.hexa.customexceptions.AccountNumberNotFoundException;

public class BankServiceImpl implements IBankService{

	@Override
	public float checkBalance(long accountNumber) throws AccountNumberNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("checkBalance()");
		if(accountNumber==5) {
			throw new AccountNumberNotFoundException("Account Not found"+ accountNumber);
		}
		return 0;
	}

	@Override
	public float depositMoney(long accountNumber, float amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
