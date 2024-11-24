package com.testng.demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	//declaration
	@FindBy(xpath="//div[@class='result']")
	WebElement displayRegistrationSuccess;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//a[@class='ico-login']")
	WebElement btnToLogInPage;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement btnLogIn;
	
	//initialization
	SignInPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Usability
	public boolean isRegistrationSuccess() {
		if(displayRegistrationSuccess.isDisplayed()==true) return true;
		return false;
	}
	
	public void clickBtnContinue() {
		btnContinue.click();
	}
	
	public void goToLogInPage() {
		btnToLogInPage.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogInBtn() {
		btnLogIn.click();
	}
}
