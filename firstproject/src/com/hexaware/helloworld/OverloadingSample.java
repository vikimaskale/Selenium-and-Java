package com.hexaware.helloworld;

public class OverloadingSample {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add("1","2"));
	}

}








