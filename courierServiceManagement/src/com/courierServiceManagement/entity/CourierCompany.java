package com.courierServiceManagement.entity;

import java.util.ArrayList;

public class CourierCompany {
	private String companyName;
	private ArrayList<Courier>courierDetails;
	private ArrayList<Employee>employeeDetails;
	private ArrayList<Location>locationDetails; 
	public CourierCompany() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourierCompany(String companyName, ArrayList<Courier> courierDetails, ArrayList<Employee> employeeDetails,
			ArrayList<Location> locationDetails) {
		super();
		this.companyName = companyName;
		this.courierDetails = courierDetails;
		this.employeeDetails = employeeDetails;
		this.locationDetails = locationDetails;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public ArrayList<Courier> getCourierDetails() {
		return courierDetails;
	}
	public void setCourierDetails(ArrayList<Courier> courierDetails) {
		this.courierDetails = courierDetails;
	}
	public ArrayList<Employee> getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(ArrayList<Employee> employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	public ArrayList<Location> getLocationDetails() {
		return locationDetails;
	}
	public void setLocationDetails(ArrayList<Location> locationDetails) {
		this.locationDetails = locationDetails;
	}
	@Override
	public String toString() {
		return "CourierCompany [companyName=" + companyName + ", courierDetails=" + courierDetails
				+ ", employeeDetails=" + employeeDetails + ", locationDetails=" + locationDetails + "]";
	}
	
	
}
