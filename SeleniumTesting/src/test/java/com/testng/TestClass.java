package com.testng;

import org.testng.annotations.Test;

public class TestClass extends Annotation{
	TestClass(){
		super();
		System.out.println("Testclass constructor");
	}
	@Test(priority=2)
	public void openBrowser() {
		System.out.println("******** openBrowser testcase executed priority2*************");
	}
	
	@Test(priority=1)
	public void searchFunctionality() {
		System.out.println("***** searchFunctionality testcase executed priority1*****");
	}
	
	@Test(priority=3)
	public void logoutFunctionality() {
		System.out.println("****** logoutFunctionality testcase executed priority3********");
	}  
	
	@Test(priority=0)
	public void loginFunctionality() {
		System.out.println("****** loginFunctionality testcase executed priority0********");
	}
	
	@Test
	public void fun1() {
		System.out.println("****** fun1 testcase executed priority********");
	}
	
	@Test
	public void Fun1() {
		System.out.println("****** Fun1 testcase executed priority********");
	}
	
	@Test
	public void zun() {
		System.out.println("****** zun testcase executed priority********");
	}
	
}









