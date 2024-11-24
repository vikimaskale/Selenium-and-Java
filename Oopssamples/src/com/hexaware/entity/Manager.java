package com.hexaware.entity;

public class Manager extends Employee{
	private String project;
	private int salary;
	
	public Manager(int employeeId, String designation, long adhaarNumber, String name, 
			int age, String address, String project, int salary) {
		super(employeeId, designation, adhaarNumber, name, age, address);
		this.project = project;
		this.salary = salary;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Manager [project=" + project + ", salary=" + salary + "]"+ super.toString();
	}

	
	
	
	
	
}
