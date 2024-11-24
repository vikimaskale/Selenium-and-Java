//Assignment 8  
package javaAssignment1;

import java.util.Scanner;  

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your income");
		int income= scn.nextInt();
		scn.close();
		
		float tax= calculateTax(income);
		System.out.println("Total tax is $" +tax);

	}
	
	public static float calculateTax(int income) {
		float tax=0.0f;
		if(income>50000) {
			tax= (float)(income * 30)/100;
		}else if(income>30000) {
			tax= (float)(income * 20)/100;
		}else if(income>10000) {
			tax= (float)(income * 10)/100;
		}else {
			tax= 0.0f;
		}
		return tax;
	}

}
