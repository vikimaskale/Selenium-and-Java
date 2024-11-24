package com.testng;

public class Annotation {
	//method
	@org.testng.annotations.BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod executed");
	}
	
	@org.testng.annotations.AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod executed");
	}
	
	//class
	@org.testng.annotations.BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass executed");
	}
	
	@org.testng.annotations.AfterClass
	public void afterClass() {
		System.out.println("AfterClass executed");
	}
	
	//beforeTest and afterTest
	@org.testng.annotations.BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest executed");
	}
	
	@org.testng.annotations.AfterTest
	public void afterTest() {
		System.out.println("afterTest executed");
	}
	
	//suite
	@org.testng.annotations.BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite executed");
	}
	
	@org.testng.annotations.AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite executed");
	}
	
	//groups
	@org.testng.annotations.BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups() executed");
	}
	
	@org.testng.annotations.AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups() executed");
	}
	
	
	
}
