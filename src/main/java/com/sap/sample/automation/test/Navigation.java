package com.sap.sample.automation.test;

import com.sap.sample.automation.util.BrowserDriver;
import com.sap.sample.automation.view.LoginView;

/**
 * The Class Navigation.
 */
public class Navigation {

	/**
	 * Given I navigate to the mock application.
	 */
	public void given_I_navigate_to_the_mock_application() {
		BrowserDriver.loadPage("http://localhost:8080/services/v1/checkConnection?urlToCheck=https://mail.rediff.com/cgi-bin/login.cgi");
		LoginView.isDisplayedCheck();
	}

	/**
	 * When I try to login.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public void when_I_try_to_login(String username, String password) {
		LoginView.login(username, password);
	}

	/**
	 * Then I loggedin.
	 */
	public void then_I_loggedin() {
		LoginView.checkLoginSuccess();
	}
}
