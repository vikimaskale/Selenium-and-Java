package com.hexa.abstractclass;

public class MainMod {
	public static void main(String[] args) {
		BankServiceImpl obj= new BankServiceImpl();
		obj.checkBalance(0);
		obj.depositMoney(0, 0);
	}
}
