package com.courierServiceManagement.entity;

import java.util.Date;

public class Courier {
	enum Status{
		yetToTransit,
		InTransit,
		Delivered
	}
	private static long uniqueTrackingNumber=100;
	private long courierID;
	private String senderName;
	private String senderAddress;
	private String receiverName;
	private String receiverAddress;
	private float weight;
	private Status status;
	private long trackingNumber;
	private Date deliveryDate;
	private long userId;
	private long employeeID;
	public Courier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//removed trackingNumber from parameter
	public Courier(long courierID, String senderName, String senderAddress,
			String receiverName, String receiverAddress,
			float weight, Date deliveryDate, long userId, long employeeID) {
		super();
		this.courierID = courierID;
		this.senderName = senderName;
		this.senderAddress = senderAddress;
		this.receiverName = receiverName;
		this.receiverAddress = receiverAddress;
		this.weight = weight;
		this.status = Status.yetToTransit;
		this.trackingNumber = uniqueTrackingNumber++;
		this.deliveryDate = deliveryDate;
		this.userId = userId;
		this.employeeID=employeeID;
	}
	public long getCourierID() {
		return courierID;
	}
	public void setCourierID(long courierID) {
		this.courierID = courierID;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status.toString();
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public long getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Courier [courierID=" + courierID + ", senderName=" + senderName + ", senderAddress=" + senderAddress
				+ ", receiverName=" + receiverName + ", receiverAddress=" + receiverAddress + ", weight=" + weight
				+ ", status=" + status + ", trackingNumber=" + trackingNumber + ", deliveryDate=" + deliveryDate
				+ ", userId=" + userId + ", employeeID=" + employeeID + "]";
	}

	
	
	
}
