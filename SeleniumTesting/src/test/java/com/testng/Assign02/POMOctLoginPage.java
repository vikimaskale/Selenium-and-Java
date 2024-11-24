package com.testng.Assign02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMOctLoginPage {

	//declaration
	@FindBy(name="username")
	WebElement txtusr;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement buttonsubmit;
	
	//initialization
	public POMOctLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public void enterUsername(String str) {
		txtusr.sendKeys(str);
	}
	
	public void enterPassword(String str) {
		txtPass.sendKeys(str);
	}
	
	public void clickLogin() {
		buttonsubmit.click();
	}
}
