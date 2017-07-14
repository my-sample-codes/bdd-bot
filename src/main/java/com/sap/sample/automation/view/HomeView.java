package com.sap.sample.automation.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import com.sap.sample.automation.containers.HomePageContainer;
import com.sap.sample.automation.util.BrowserDriver;

/**
 * The Class HomeView.
 */
public class HomeView {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(HomeView.class.getName());

	/** The Constant homePageContainer. */
	private static final HomePageContainer homePageContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);

	/**
	 * Instantiates a new home view.
	 */
	private HomeView() {
	}

	/**
	 * Checks if is displayed check.
	 */
	public static void isDisplayedCheck() {
		LOGGER.info("Checking login page is displayed");
		BrowserDriver.waitForElement(homePageContainer.homePageLogout);
		homePageContainer.homePageLogout.isDisplayed();
	}
}
