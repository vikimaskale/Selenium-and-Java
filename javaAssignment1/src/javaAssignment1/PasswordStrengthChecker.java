//Assignment 6  
package javaAssignment1;

import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter password");
		String password= scn.nextLine();
		
		String strength= checkPasswordStrength(password);
		System.out.println("Strength of Password: " + strength);
	}
	
	public static String checkPasswordStrength(String password) {
		int length= password.length();
		boolean hasUpperCase=false, hasLowerCase=false, hasNumber=false, hasSpecialChar=false;
		
		for(char ch: password.toCharArray()) {
			if(Character.isUpperCase(ch)) hasUpperCase=true;
			else if(Character.isLowerCase(ch)) hasLowerCase=true;
			else if(Character.isDigit(ch)) hasNumber=true;
			else if(Character.isWhitespace(ch))return "Invalid Password";
			else hasSpecialChar= true;
		}
		
		int CountStrength=0;
		if(length>=8)CountStrength++;
		if(hasUpperCase)CountStrength++;
		if(hasLowerCase)CountStrength++;
		if(hasNumber)CountStrength++;
		if(hasSpecialChar)CountStrength++;
		
		if(CountStrength==5)return "strong";
		else if(CountStrength>2)return "moderate";
		else return "weak";

	}

}



