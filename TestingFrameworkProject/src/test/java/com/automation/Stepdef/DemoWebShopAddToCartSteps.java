package com.automation.Stepdef;

import com.automation.pages.AddToCartPage;

import io.cucumber.java.en.Then;

public class DemoWebShopAddToCartSteps {
	AddToCartPage cartPage=new AddToCartPage();

	@Then("click on add to cart button")
	public void click_on_add_to_cart_button() {
		cartPage.clickBtnAddToCart();
	}
}
