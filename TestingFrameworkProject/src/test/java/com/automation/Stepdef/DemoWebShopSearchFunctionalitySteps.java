package com.automation.Stepdef;

import com.automation.pages.SearchFunctionalityPage;
import com.automation.pages.SignInPage;
import com.automation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoWebShopSearchFunctionalitySteps {
		
		//searchFunctionalitySteps
		SearchFunctionalityPage searchFunPage= new SearchFunctionalityPage();
		@Then("enter text to search")
		public void enter_text_to_search() {
			searchFunPage.getTextSearch("Computing and Internet");
		}

		@Then("click search button")
		public void click_search_button() {
			searchFunPage.clickBtnSearch();
		}
}
