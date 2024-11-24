package com.hexa.nullpointer;

class Student{
	int a=5;
}

public class NullException {
	public static void main(String[] args) {
		Student obj=null;
		System.out.println(obj.a);
	}
}
