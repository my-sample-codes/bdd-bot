package com.sap.sample.test;

import java.util.logging.Logger;

import com.sap.sample.automation.test.NaviagtorFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * The Class SpringBotTestSteps.
 */
public class SpringBotTestSteps {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SpringBotTestSteps.class.getName());

	/**
	 * Given I navigate to the mock application.
	 */
	@Given("^I navigate to the loaded page of the application$")
	public void given_I_navigate_to_the_mock_application() {
		LOGGER.info("Entering: I navigate to the loaded page of the application");
		NaviagtorFactory.getNavigator().given_I_navigate_to_the_mock_application();
	}

	/**
	 * When I try to login.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	@When("^I try to login with username '(.+)' and password '(.+)'$")
	public void when_I_try_to_login(String username, String password) {
		LOGGER.info("Entering: I try to login with " + username + "/**** credentials");
		NaviagtorFactory.getNavigator().when_I_try_to_login(username, password);
	}

	/**
	 * Then I login.
	 */
	@Then("^I should see that I am in logged in status$")
	public void then_I_login() {
		LOGGER.info("Entering: I should see that I am in logged in status");
		NaviagtorFactory.getNavigator().then_I_loggedin();
	}
}
