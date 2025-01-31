//Assignment 3
package javaAssignment1;

import java.util.Scanner;

public class LeapYearChecker {
	
	public static boolean checkForLeapYear(int year) {
		if(year % 4 ==0) {
			if(year % 100==0) {
				if(year % 400==0) {
					return true;
				}else {
					return false;
				}
			}else {
				return true;
			}
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year= scn.nextInt();
		scn.close();
		
		boolean isLeap= checkForLeapYear(year);
		if(isLeap==true) {
			System.out.println(year+ " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}

}
