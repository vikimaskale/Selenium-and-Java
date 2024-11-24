package com.automation.Stepdef;

import com.automation.pages.LogOutPage;

import io.cucumber.java.en.Then;

public class DemoWebShopLogOutSteps {
	LogOutPage logOutPage=new LogOutPage();
	
	@Then("click LogOut button")
	public void click_log_out_button() {
		logOutPage.clickBtnLogOut();
	}
}
