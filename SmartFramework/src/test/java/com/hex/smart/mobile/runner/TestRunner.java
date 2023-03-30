package com.hex.smart.mobile.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(tags="@Web_RealTime",
features= {"src/test/resources/features/mobile/"},
glue = {"com.hex.smart.mobile.stepdefinitions"}
)
public class TestRunner {

}
