package com.hexaware.assignment3;

public class Main {
	public static void main(String[] args) {
		
		String reverseString=StringServiceProvider.reverseString("Vikram");
		System.out.println("reverse string is: "+reverseString);
		
		int index= StringServiceProvider.LinerSearch('i', "Vikram");
		if(index==-1) {
			System.out.println("i is not present in String");
		}else {
			System.out.println("'i' is at index: "+ index);
		}
		
		String newString=StringServiceProvider.replaceChar(5, 'm', "Vikran");
		System.out.println("new String after replacement is: "+ newString);
		
		//calling non-static methods
		System.out.println("----------------------------------------");
		StringServiceProvider obj=new StringServiceProvider();
		reverseString=obj.reverseString("Vikram");
		System.out.println("reverse string is: "+reverseString);
		
		index= obj.LinerSearch('i', "Vikram");
		if(index==-1) {
			System.out.println("i is not present in String");
		}else {
			System.out.println("'i' is at index: "+ index);
		}
		
		newString=obj.replaceChar(5, 'm', "Vikran");
		System.out.println("new String after replacement is: "+ newString);
		
		
	}
}
