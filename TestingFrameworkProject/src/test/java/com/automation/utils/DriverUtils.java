package com.automation.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	public static WebDriver driver;

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			createDriver();
		}
		return driver;
	}
}
