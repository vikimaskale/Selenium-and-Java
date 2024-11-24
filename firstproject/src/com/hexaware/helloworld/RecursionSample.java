package com.hexaware.helloworld;
import java.util.Scanner;

public class RecursionSample {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		System.out.println(factorial(number));

	}
	
	public static int factorial(int number){
		if(number==1 || number==0) return 1;
		return number * factorial(number-1);
		
	}

}
