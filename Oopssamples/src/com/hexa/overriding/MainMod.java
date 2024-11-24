package com.hexa.overriding;

public class MainMod {

	public static void main(String[] args) {
		Bank obj= new Bank();
		obj.calculateROI();
		
		Bank obj1= new AxisBank();
		obj1.calculateROI();
		
		Bank obj2= new ICICI();
		obj2.calculateROI();

	}

}
