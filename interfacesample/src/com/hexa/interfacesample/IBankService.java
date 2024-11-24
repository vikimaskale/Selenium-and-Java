package com.hexa.interfacesample;

import com.hexa.customexceptions.AccountNumberNotFoundException;

public interface IBankService {
	float checkBalance(long accountNumber) throws AccountNumberNotFoundException; //method declaration
	float depositMoney(long accountNumber, float amount);
}
