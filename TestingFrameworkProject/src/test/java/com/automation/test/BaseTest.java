package com.automation.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.utils.DriverUtils;

public class BaseTest {
	@BeforeTest
	public void start() {
		DriverUtils.createDriver();
	}
	
	@AfterTest
	public void end() {
		DriverUtils.getDriver().quit();
	}

}
