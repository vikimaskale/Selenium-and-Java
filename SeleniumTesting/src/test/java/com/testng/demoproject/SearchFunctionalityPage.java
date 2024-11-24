package com.testng.demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionalityPage {
	//declaration
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement txtSearch;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement btnSearch;
	
	
	//initilization
	public SearchFunctionalityPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//usability
	public void getTextSearch(String txt) {
		txtSearch.sendKeys(txt);
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
}
