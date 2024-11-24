package com.courierServiceManagement.entity;

public class User {
	private long userID;
	private String userName;
	private String email;
	private String password;
	private long contactNumber;
	private String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userID, String userName, String email, String password, long contactNumber, String address) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}
	
}
