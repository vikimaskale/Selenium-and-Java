package com.courierServiceManagement.main;

import java.util.ArrayList;
import java.util.Date;

import com.courierServiceManagement.dao.*;
import com.courierServiceManagement.entity.*;
import com.courierServiceManagement.exceptions.InvalidEmployeeIdException;
import com.courierServiceManagement.exceptions.TrackingNumberNotFoundException;

public class MainMod {
	public static void main(String[] args) throws TrackingNumberNotFoundException, InvalidEmployeeIdException {
		
		//creating company 
		CourierCompany companyObj=new CourierCompany("hexaware", new ArrayList<>(),
				new ArrayList<>(), new ArrayList<>());
		
		//creating employees
		Employee employee1= new Employee(501, "Sai", "sai@gmail.com", 9923492620L,
				"driver", 2000);
		
		Employee employee2= new Employee(502, "Rai", "ram@gmail.com", 8824482345L,
				"Manager", 20000);
		
		//creating admin services
		CourierAdminServiceImpl adminService= new CourierAdminServiceImpl(companyObj);
		CourierUserServiceImpl userService=(CourierAdminServiceImpl)adminService;
		
		//adding employee
		adminService.addCourierStaff(employee1);
		adminService.addCourierStaff(employee2);
		System.out.println("Details of Employee:"+companyObj.getEmployeeDetails());
		
		//creating user
		User user1=new User(201, "Santosh", "santosh@gmail.com", "sant", 9876767898L, "Wagholi");
		User user2=new User(202, "Vipul", "Vipul@gmail.com", "Vip", 9876767845L, "Ghansoli");
		
		//creating courier
		Courier courier1=new Courier(1, "Santosh", "Wagholi", "Vipul", "Ghansoli", 30, 
				new Date(), 201, 501);
		
		Courier courier2=new Courier(2, "Vipul", "Ghansoli", "Raj", "Nanded", 10, 
				new Date(), 201, 501);
		
		//placing courier order
		userService.placeOrder(courier1);
		userService.placeOrder(courier2);
		System.out.println("Details of coriers: "+companyObj.getCourierDetails());
		
		
		//checking status -> handled in fun getOrderStatus but still asking to handle here also?
		String status=adminService.getOrderStatus(courier1.getTrackingNumber());
		System.out.println(status);
		
		//checking status with wrong trackingNumber
//		status=adminService.getOrderStatus(598);
//		System.out.println(status);
		
		//Cancel order
		boolean iscanceled=adminService.cancelOrder(courier1.getTrackingNumber());
		System.out.println(iscanceled);
		System.out.println("Details of coriers: "+companyObj.getCourierDetails());
		
		
		// getAssignedOrder()
		System.out.println(adminService.getAssignedOrder(501));
		
	}
}
