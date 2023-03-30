package com.hex.smart.mobile.stepdefinitions;

import com.hex.smart.mobile.pageobjectlibrary.MobileLoginPageObject;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class MobileLoginStepDefinition {

	@Steps
	MobileLoginPageObject mobilepageobject;
	
	@Given("Open browser and navigate to url")
	public void open_browser_and_navigate_to_url() {
		mobilepageobject.open_and_navigate_to_url();
	}

	@And("Enter {string} in username textbox")
	public void enter_in_username_textbox(String string) {
		mobilepageobject.enter_Username(string);
	}

	@And("Enter {string} in password textbox")
	public void enter_in_password_textbox(String string) {
		mobilepageobject.enter_Password(string);
	}

	@Then("Click on login button in swaglabs loginpage")
	public void click_on_login_button_in_swaglabs_loginpage() {
	    mobilepageobject.clcik_LoginButton();
	}
}
