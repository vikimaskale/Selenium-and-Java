package com.courierServiceManagement.dao;

import com.courierServiceManagement.entity.CourierCompany;
import com.courierServiceManagement.entity.Employee;
import com.courierServiceManagement.services.ICourierAdminService;

public class CourierAdminServiceImpl  extends CourierUserServiceImpl 
	implements ICourierAdminService{
	//constructor
	public CourierAdminServiceImpl(CourierCompany companyObj) {
		super(companyObj);
	}

	@Override
	public int addCourierStaff(Employee employee) {
		this.getCompanyObj().getEmployeeDetails().add(employee);
		return 0;
	}

}
