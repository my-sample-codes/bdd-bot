package com.sap.sample.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class SpringBotTest.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", 
		plugin = { "pretty", "json:target/cucumber.json" }, 
		tags = {"@login" })
public class SpringBotTest {
}
