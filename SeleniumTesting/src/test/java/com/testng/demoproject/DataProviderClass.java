package com.testng.demoproject;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
//	@DataProvider
//	public Object[][] getUserRegistrationData(){
//		Object[][] data=new Object[1][6];
//		data[0][0]="male";
//		data[0][1]="vdm11";
//		data[0][2]="vdm12";
//		data[0][3]="vdm14@gmail.com";
//		data[0][4]="vdm111";
//		data[0][5]="vdm111";
//		
//		data[1][0]="male";
//		data[1][1]="vdm11";
//		data[1][2]="vdm12";
//		data[1][3]="vdm13@gmail.com";
//		data[1][4]="vdm111";
//		data[1][5]="vdm111";
//		return data;
//	}
	
	@DataProvider
	public Object[][] getUserSignInData() {
		Object[][] data=new Object[1][2];
		data[0][0]="vdm14@gmail.com";
		data[0][1]="vdm111";
		return data;
	}
	
	@DataProvider
	public Object[][]getSearchData(){
		Object[][] data=new Object[1][1];
		data[0][0]="Computing and Internet";
//		data[1][0]="14.1-inch Laptop";
//		data[0][2]="Casual Golf Belt";
		return data;
	}
	
	
}
