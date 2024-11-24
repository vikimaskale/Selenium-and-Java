package com.automation.Stepdef;

import com.automation.pages.SearchFunctionalityPage;
import com.automation.pages.SignInPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShopLoginSteps {
	//loginSteps
	SignInPage signInPage=new SignInPage();
	
	@Given("Enter ORANGEHRM URL")
	public void enter_orangehrm_url() {
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
	}

	@When("enter valid username and pass word for ORH")
	public void enter_valid_username_and_pass_word_for_orh() {
		signInPage.setEmail("vdm14@gmail.com");
		signInPage.setPassword("vdm111");
		
	}

	@Then("click Login button from Login Page")
	public void click_login_button_from_login_page() {
		signInPage.clickLogInBtn();
	}
	
	@When("enter valid username and password {string} and {string} for ORH")
	public void enter_valid_username_and_password_and_for_orh(String email, String password) {
		signInPage.setEmail(email);
		signInPage.setPassword(password);
	}

}
