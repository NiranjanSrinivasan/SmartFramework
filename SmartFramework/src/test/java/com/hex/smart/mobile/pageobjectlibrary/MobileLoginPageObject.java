package com.hex.smart.mobile.pageobjectlibrary;

import com.hex.smart.mobile.pagelocators.MobileLoginPageLocators;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class MobileLoginPageObject extends PageObject {

	@Step("Open and Navigate to application")
	public void open_and_navigate_to_url() {
		
		open();
		
	}
	
	@Step("Enter Username")
	public void enter_Username(String username){
		$(MobileLoginPageLocators.MOBILE_LOGINPAGE_USERNAME).sendKeys(username);
		
	}
	
	@Step("Enter Password")
	public void enter_Password(String password){
		$(MobileLoginPageLocators.MOBILE_LOGINPAGE_PASSWORD).sendKeys(password);
		
	}
	
	@Step("Click on Login Button")
	public void clcik_LoginButton(){
		$(MobileLoginPageLocators.MOBILE_LOGINPAGE_LOGIN_BTN).click();
		
		
	}
}
