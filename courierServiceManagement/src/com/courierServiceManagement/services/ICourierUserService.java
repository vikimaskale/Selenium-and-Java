package com.courierServiceManagement.services;

import java.util.ArrayList;

import com.courierServiceManagement.entity.Courier;
import com.courierServiceManagement.exceptions.InvalidEmployeeIdException;
import com.courierServiceManagement.exceptions.TrackingNumberNotFoundException;

public interface ICourierUserService {
	public long placeOrder(Courier courierObj);
	public String getOrderStatus(long trackingNumber) throws TrackingNumberNotFoundException;
	public boolean cancelOrder(long trackingNumber) throws TrackingNumberNotFoundException;
	public ArrayList<Courier> getAssignedOrder(long courierStaffId) throws InvalidEmployeeIdException;
}
