package com.hex.smart.api.requests;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.hex.smart.api.basetest.BaseClassTest;
import com.hex.smart.api.stepdefinition.ApiRequestsStepDefinition;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class ApiGetRequest extends BaseClassTest {

	@Steps
	ApiRequestsStepDefinition api;
	@Title("Getting the user details")
	@Test
	public void getUserTest() {
		
		api.sendGetRequestForUser("4");
		api.validateStatusCodeToBe(200);
		api.verifyResponseBody("firstName", "Chris");
	}
}
