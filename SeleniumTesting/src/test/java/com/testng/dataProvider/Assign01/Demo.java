package com.testng.dataProvider.Assign01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	@DataProvider
	public Object[][] getdata(){
		Object [][] data= new Object[2][2];
		data[0][0]="userA";
		data[0][1]="passA";
		data[1][0]="userB";
		data[1][1]="passB";
		return data;
	}
	
	@Test(dataProvider= "getdata")
	public void createuser(Object un, Object pw) {
		System.out.println(un+" "+pw);
	}
}
