package com.courierServiceManagement.dao;

import java.util.ArrayList;

import com.courierServiceManagement.entity.Courier;
import com.courierServiceManagement.entity.CourierCompany;
import com.courierServiceManagement.entity.Employee;
import com.courierServiceManagement.exceptions.InvalidEmployeeIdException;
import com.courierServiceManagement.exceptions.TrackingNumberNotFoundException;
import com.courierServiceManagement.services.ICourierUserService;

public class CourierUserServiceImpl  implements ICourierUserService{
	private CourierCompany companyObj;
	
	//constructors
	public CourierUserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourierUserServiceImpl(CourierCompany companyObj) {
		super();
		this.companyObj = companyObj;
	}

	//getter and setter
	public CourierCompany getCompanyObj() {
		return companyObj;
	}

	public void setCompanyObj(CourierCompany companyObj) {
		this.companyObj = companyObj;
	}

	//service methods
	@Override
	public long placeOrder(Courier courierObj) {
		this.companyObj.getCourierDetails().add(courierObj);
		return courierObj.getTrackingNumber();
	}

	@Override
	public String getOrderStatus(long trackingNumber) throws TrackingNumberNotFoundException {
		String orderStatus=null;
		for(Courier courierObj:this.companyObj.getCourierDetails()) {
			if(courierObj.getTrackingNumber()==trackingNumber) {
				orderStatus=courierObj.getStatus();
			}
		}
		if(orderStatus== null)throw new TrackingNumberNotFoundException("Tracking Number Not Found.");
		return orderStatus;
	}

	@Override
	public boolean cancelOrder(long trackingNumber) throws TrackingNumberNotFoundException {
		boolean isorderCanceled=false;
		Courier courierToRemove=null;
		for(Courier courierObj:this.companyObj.getCourierDetails()) {
			if(courierObj.getTrackingNumber()==trackingNumber) {
				courierToRemove=courierObj;
				isorderCanceled=true;
			}
		}
		
		if(isorderCanceled==true) {
			this.companyObj.getCourierDetails().remove(courierToRemove);
		}else {
			throw new TrackingNumberNotFoundException("Tracking Number Not Found.");
		}
		return isorderCanceled;
	}

	@Override
	public ArrayList<Courier> getAssignedOrder(long courierStaffId) 
			throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		ArrayList<Courier>courierList=new ArrayList<>();
		if(hasEmployeeId(courierStaffId)==true) {
			for(Courier courier:this.companyObj.getCourierDetails()) {
				if(courier.getEmployeeID() == courierStaffId) {
					courierList.add(courier);
				}
			}
		}
		return courierList;
	}
	
	public boolean hasEmployeeId(long employeeID) throws InvalidEmployeeIdException {
		boolean hasEmployee=false;
		for(Employee employee : this.companyObj.getEmployeeDetails()) {
			if(employee.getEmployeeID()==employeeID) {
				hasEmployee=true;
			}
		}
		if(hasEmployee==false) {
			throw new InvalidEmployeeIdException("Invalid Employee Id");
		}
		return hasEmployee;
	}
	@Override
	public String toString() {
		return "CourierUserServiceImpl [companyObj=" + companyObj + "]";
	}
	

}
