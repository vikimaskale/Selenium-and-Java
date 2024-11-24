package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionalityPage extends BasePage{
	//declaration
	@FindBy(xpath="//input[@id='small-searchterms']")
	WebElement txtSearch;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement btnSearch;
	
	@FindBy(xpath="(//a[text()='Computing and Internet'])[2]")
	WebElement txtBook;
	
//	//initialization
//	public SearchFunctionalityPage(WebDriver driver){
//		PageFactory.initElements(driver, this);
//	}
	
	//usability
	public void getTextSearch(String txt) {
		txtSearch.sendKeys(txt);
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public String getTextBook() {
		return txtBook.getText();
	}
}

