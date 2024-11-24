package com.hexaware.entity;

public class Person {
	//member variables/instance variable
	private long aadhaarNumber;
	private String name;
	private int age;
	private String address;
	public static String country="India";
	//default constructor
	public Person() {
		
	}
	
	//Parameterized constructor
	public Person(long aadhaarNumber, String name, int age, String address) {
		this.aadhaarNumber= aadhaarNumber;
		this.name=name;
		this.age= age;
		this.address= address;
	}
	
	public static void checkStatic() {
		System.out.println("from static method......");
	}
	//getters and setters
	//getters are used to get the value of variable outside the class
	public long getAadhaarNumber() {
		return this.aadhaarNumber;
	}
	
	//setters are used to supply value to variables from outside class
	public void setAadhaarNumber(long aadhaarNumber) {
		this.aadhaarNumber= aadhaarNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address= address;
	}
	
	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}

	@Override
	public String toString() {
		return " Person [name= "+this.name+" age= "+ this.age+" Aadhar no= "+this.aadhaarNumber
				+" address= "+this.address+"]";
	}

}









