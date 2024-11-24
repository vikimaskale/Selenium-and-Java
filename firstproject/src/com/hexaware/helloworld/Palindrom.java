package com.hexaware.helloworld;
import java.util.Scanner;

public class Palindrom {

	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(isPalindrom(n));
	}
	
	public static boolean isPalindrom(int n) {
		int original=n, reverse=0;
		
		while(n>0) {
			reverse= reverse*10 + (n%10);
			n/=10;
		}
		
		return reverse==original ? true:false;
	}
}
