package com.hexa.main;

import com.hexa.customexceptions.AccountNumberNotFoundException;
import com.hexa.interfacesample.BankServiceImpl;

public class MainMod {
	public static void main(String[] args) {
		BankServiceImpl obj=new BankServiceImpl();
		try {
			obj.checkBalance(5);
		}catch(AccountNumberNotFoundException e){
			System.out.println(e);
		}
	}
}
