package com.testng.dataProvider.Assign01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMRegistration {
	//declaration
	//male
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement genderMale;
	
	//female
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement genderFemale;
	
	//firstname
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstNameText;
	
	//lastName
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastNameText;
	
	//emailText
	@FindBy(xpath="//input[@id='Email']")
	WebElement emailText;
	
	//passwordText
	@FindBy(xpath="//input[@id='Password']")
	WebElement passwordText;
	
	//confPassword
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confPasswordText;
	
	//registerButton
	@FindBy(xpath="//input[@id='register-button']")
	WebElement registerButton;
	
	//initialization
	public POMRegistration (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usability
	public void enterGender(String str) {
		if(str.toLowerCase().equals("male")) {
			genderMale.click();
		}else {
			genderFemale.click();
		}
	}
	
	public void enterFirstNameText(String firstName) {
		firstNameText.sendKeys(firstName);
	}
	
	public void enterLastNameText(String lastName) {
		lastNameText.sendKeys(lastName);
	}
	
	public void enterEmailText(String email) {
		emailText.sendKeys(email);
	}
	
	public void enterPasswordText(String password) {
		passwordText.sendKeys(password);
	}
	
	public void enterConfPasswordText(String password) {
		confPasswordText.sendKeys(password);
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
}









