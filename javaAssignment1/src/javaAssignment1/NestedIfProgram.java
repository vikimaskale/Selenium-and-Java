//Assignment 7
package javaAssignment1;

import java.util.Scanner;

public class NestedIfProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1=scn.nextInt();
		int number2=scn.nextInt();
		scn.close();
		
		if(number1 % number2==0) {
			System.out.println(number1 +" is divisible by "+ number2);
		}else {
			if(number1 % 2==0) {
				System.out.println(number1 + " is not divisible by " + number2 +" but it is even number");
			}else {
				System.out.println(number1 + " is not divisible by " + number2 +" but it is odd number");
			}
		}

	}

}
