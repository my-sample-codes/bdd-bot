package com.sap.sample.automation.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.sap.sample.automation.containers.LoginPageContainer;
import com.sap.sample.automation.util.BrowserDriver;

/**
 * The Class LoginView.
 */
public class LoginView {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(LoginView.class.getName());

	/** The Constant loginContainer. */
	private static final LoginPageContainer loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(),
			LoginPageContainer.class);

	/**
	 * Instantiates a new login view.
	 */
	private LoginView() {
	}

	/**
	 * Checks if is displayed check.
	 */
	public static void isDisplayedCheck() {
		LOGGER.info("Checking login page is displayed");
		BrowserDriver.waitForElement(loginContainer.loginForm);
		loginContainer.loginForm.isDisplayed();
	}

	/**
	 * Login.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 */
	public static void login(String username, String password) {
		LOGGER.info("Logging in with username:" + username + " password:" + password);
		loginContainer.usernameInput.sendKeys(username);
		loginContainer.passwordInput.sendKeys(password);
		loginContainer.submitButton.click();
		LOGGER.info("Login submitted");
	}

	/**
	 * Check login success.
	 */
	public static void checkLoginSuccess() {
		LOGGER.info("Check login was successful");
		HomeView.isDisplayedCheck();
	}
}
