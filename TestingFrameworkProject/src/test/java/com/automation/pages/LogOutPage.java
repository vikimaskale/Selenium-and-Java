package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{
	@FindBy(xpath="//a[@class='ico-logout']")
	WebElement btnLogOut;
	
	public void clickBtnLogOut() {
		btnLogOut.click();
	}
}
