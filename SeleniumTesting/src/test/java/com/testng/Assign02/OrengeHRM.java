package com.testng.Assign02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.Annotation;

public class OrengeHRM extends Annotation{
	//testing loginPage using pageObjectModel and OregeHRM class. 
	//send parameters using testng.xml
	
	@Test
	@Parameters({"username","password"})
	public static void logInPage(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		POMOctLoginPage loginpage=new POMOctLoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
