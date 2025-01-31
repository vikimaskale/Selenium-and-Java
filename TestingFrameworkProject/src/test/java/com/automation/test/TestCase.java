package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.pages.AddToCartPage;
import com.automation.pages.LogOutPage;
import com.automation.pages.RegistrationPage;
import com.automation.pages.SearchFunctionalityPage;
import com.automation.pages.SignInPage;
import com.automation.utils.DriverUtils;

public class TestCase extends BaseTest{
	
	@Test(priority=0)
	@Parameters({"gender", "fname", "lname", "email", "password", "conPassword"})
	public void registerUserTest(String gender, String fname, String lname, String email,
			String password, String conPassword) throws InterruptedException {
		
		RegistrationPage register=new RegistrationPage();
		DriverUtils.getDriver().navigate().to("https://demowebshop.tricentis.com/register");
		
		register.enterGender(gender);
		register.enterFirstNameText(fname);
		register.enterLastNameText(lname);
		register.enterEmailText(email);
		register.enterPasswordText(password);
		register.enterConfPasswordText(conPassword);
		register.clickRegisterButton();
		Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] getUserSignInData() {
		Object[][] data=new Object[1][2];
		data[0][0]="vdm14@gmail.com";
		data[0][1]="vdm111";
		return data;
	}
	@Test(priority=1, alwaysRun= true, dependsOnMethods="signInTest", dataProvider="getUserSignInData")
	public void signInTest(String email, String password) throws InterruptedException {
		
		SignInPage signInPage=new SignInPage();
		signInPage.goToLogInPage();
		signInPage.setEmail(email);
		signInPage.setPassword(password);
		signInPage.clickLogInBtn();
		Thread.sleep(4000);
	}
	
	@DataProvider
	public Object[][]getSearchData(){
		Object[][] data=new Object[1][1];
		data[0][0]="Computing and Internet";
		return data;
	}
	
	@Test(priority=2, dependsOnMethods="signInTest", dataProvider="getSearchData",
			invocationCount=2)
	public void SearchFunctionalityTest(String txt) throws InterruptedException {
		SearchFunctionalityPage searchFun=new SearchFunctionalityPage();
		searchFun.getTextSearch(txt);
		Thread.sleep(2000);
		searchFun.clickBtnSearch();
//		Assert.assertEquals(searchFun.getTextBook() , "Computing and Internet");
		Thread.sleep(2000);
	}
	
	@Test(priority=3, dependsOnMethods="SearchFunctionalityTest")
	public void addToCartTest() throws InterruptedException {
		AddToCartPage cart=new AddToCartPage();
		cart.clickBtnAddToCart();
		Thread.sleep(5000);
	}
	
	@Test(priority=4, dependsOnMethods="signInTest")
	public void LogOutTest() throws InterruptedException {
		LogOutPage logOut=new LogOutPage();
		logOut.clickBtnLogOut();
		Thread.sleep(3000);
		
	}
}
