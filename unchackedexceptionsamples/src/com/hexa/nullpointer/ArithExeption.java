package com.hexa.nullpointer;

public class ArithExeption {
	static ArithmeticException e;
	public static void main(String[] args) {
		throw e; //invoke the exception
	}
}	
