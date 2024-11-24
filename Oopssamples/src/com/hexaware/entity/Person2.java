package com.hexaware.entity;

public class Person2 {
	
	private long aadhaarNumber;
	private String name;
	private int age;
	private String address;
	
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person2(long aadhaarNumber, String name, int age, String address) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public long getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(long aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
