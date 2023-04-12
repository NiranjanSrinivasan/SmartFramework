package com.hex.smart.desktop.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/desktop/",
glue="com.hex.smart.desktop.stepdefinition",
monochrome = true)
public class TestRunner {

}
