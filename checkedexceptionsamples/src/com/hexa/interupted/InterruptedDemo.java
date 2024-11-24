package com.hexa.interupted;

public class InterruptedDemo {
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution continues");
	}
}
