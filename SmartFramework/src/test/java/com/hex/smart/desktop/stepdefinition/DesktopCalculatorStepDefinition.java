package com.hex.smart.desktop.stepdefinition;

import com.hex.smart.desktop.pageobjectlibrary.CalculatorPageObject;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

public class DesktopCalculatorStepDefinition {
	
	@Steps
	CalculatorPageObject calculatorPageObject;
	
	@Given("Start the Winium Server")
	public void start_the_winium_server() throws Exception {
		calculatorPageObject.startWiniumServer();
	}

	@Then("Provide the Path of the Application to Test")
	public void provide_the_path_of_the_application_to_test() throws Exception {
		calculatorPageObject.getApplicationPath();
	}

	@And("Read the Text from Display")
	public void read_the_text_from_display() throws Exception {
		calculatorPageObject.getDisplayText();
	}

}
