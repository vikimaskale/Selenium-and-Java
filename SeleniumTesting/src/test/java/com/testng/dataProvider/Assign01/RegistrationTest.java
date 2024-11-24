package com.testng.dataProvider.Assign01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest {
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][6];
		data[0][0]="male";
		data[0][1]="vdm11";
		data[0][2]="vdm12";
		data[0][3]="vdm12@gmail.com";
		data[0][4]="vdm111";
		data[0][5]="vdm111";
		
		data[1][0]="male";
		data[1][1]="vdm11";
		data[1][2]="vdm12";
		data[1][3]="vdm13@gmail.com";
		data[1][4]="vdm111";
		data[1][5]="vdm111";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void registerUser(String gender, String fname, String lname, String email,
			String password, String conPassword) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		
		POMRegistration register=new POMRegistration(driver);
		register.enterGender(gender);
		register.enterFirstNameText(fname);
		register.enterLastNameText(lname);
		register.enterEmailText(email);
		register.enterPasswordText(password);
		register.enterConfPasswordText(conPassword);
		register.clickRegisterButton();
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
}
