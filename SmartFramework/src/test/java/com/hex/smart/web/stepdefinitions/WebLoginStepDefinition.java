package com.hex.smart.web.stepdefinitions;

import com.hex.smart.web.pageobjectlibrary.WebLoginPageObject;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;


public class WebLoginStepDefinition  {

	@Steps
	WebLoginPageObject loginpage;
	
	@Given("Open Browser and Navigate to URL {string}")
	public void open_browser_and_navigate_to_url(String string) {
		loginpage.openAndNavigate();
	}


	@And("Enter Username as {string}")
	public void enter_username_as(String string) {
	    loginpage.enterUsername(string);;
	}

	@And("Enter Password as {string}")
	public void enter_password_as(String string) {
	    loginpage.enterPassword(string);
	}

	@And("Click Login")
	public void click_login() {
	    loginpage.clickLogin();
	}
	
	@Given("Close Browser")
	public void close_browser() {
	    loginpage.closeBrowser();
	}
}
