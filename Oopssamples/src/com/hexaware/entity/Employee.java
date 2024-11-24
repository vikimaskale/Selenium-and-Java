package com.hexaware.entity;

public class Employee extends Person{
	private int employeeId;
	private String designation;
	
	public Employee(int employeeId, String designation, long adhaarNumber, String name,
			int age, String address) {
		super(adhaarNumber, name,age, address);
		this.employeeId = employeeId;
		this.designation = designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", designation=" + designation +"]"
				+ super.toString();
	}
	
	
}
