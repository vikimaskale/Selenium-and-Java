package com.testng.demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	//declaration
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button']")
	WebElement btnAddToCart;
	
	//initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickBtnAddToCart() {
		btnAddToCart.click();
	}
	
}
