package com.hexaware.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Company {
	private String name;
	private HashMap<Integer, Employee>employeeMap;
	
	public Company(String name, HashMap<Integer,Employee>employeeMap) {
		super();
		this.name = name;
		this.employeeMap = employeeMap;
	}
	
	public void displayMap() {
		for(Entry<Integer, Employee> entry:employeeMap.entrySet()) {
			System.out.println(entry.getKey()+": "+ entry.getValue());
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
//		displayMap();
		return "Company [name=" + name + ", employeeArray="  + "]";
	}
	
	
}
