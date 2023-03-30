package com.hex.smart.web.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/web/",
glue= {"com.hex.smart.web.stepdefinitions"},
monochrome = true
)

public class TestRunner {

	
}
