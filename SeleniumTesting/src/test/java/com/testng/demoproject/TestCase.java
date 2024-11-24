package com.testng.demoproject;

import java.util.concurrent.TimeUnit;
import com.testng.demoproject.DataProviderClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase extends DataProviderClass{
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\JAVA_WS\\orangeHRM\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/register");
	}
	
	@Test(priority=0)
	@Parameters({"gender", "fname", "lname", "email", "password", "conPassword"})
	public void registerUserTest(String gender, String fname, String lname, String email,
			String password, String conPassword) throws InterruptedException {

		RegistrationPage register=new RegistrationPage(driver);
		register.enterGender(gender);
		register.enterFirstNameText(fname);
		register.enterLastNameText(lname);
		register.enterEmailText(email);
		register.enterPasswordText(password);
		register.enterConfPasswordText(conPassword);
		register.clickRegisterButton();
		Thread.sleep(4000);
	}
	
	@Test(priority=1, alwaysRun= true, dataProvider="getUserSignInData")
	public void signInTest(String email, String password) throws InterruptedException {
		SignInPage signInPage=new SignInPage(driver);
		signInPage.goToLogInPage();
		signInPage.setEmail(email);
		signInPage.setPassword(password);
		signInPage.clickLogInBtn();
		Thread.sleep(4000);
	}
	
	@Test(priority=2, dependsOnMethods="signInTest", dataProvider="getSearchData",
			invocationCount=2)
	public void SearchFunctionalityTest(String txt) throws InterruptedException {
		SearchFunctionalityPage searchFun=new SearchFunctionalityPage(driver);
		searchFun.getTextSearch(txt);
		searchFun.clickBtnSearch();
		Thread.sleep(4000);
	}
	
	@Test(priority=3, dependsOnMethods="SearchFunctionalityTest")
	public void addToCartTest() throws InterruptedException {
		AddToCartPage cart=new AddToCartPage(driver);
		cart.clickBtnAddToCart();
		Thread.sleep(4000);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
