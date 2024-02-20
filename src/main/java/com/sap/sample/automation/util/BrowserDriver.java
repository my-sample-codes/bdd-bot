package com.sap.sample.automation.util;

import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The Class BrowserDriver.
 */
public class BrowserDriver {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());

	/** The m driver. */
	private static WebDriver mDriver;

	/**
	 * Instantiates a new browser driver.
	 */
	private BrowserDriver() {
	}

	/**
	 * Gets the current driver.
	 *
	 * @return the current driver
	 */
	public static synchronized WebDriver getCurrentDriver() {
		if (mDriver == null) {
			try {
				mDriver = BrowserFactory.getBrowser();
			} catch (URISyntaxException e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
			} finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
					@Override
					public void run() {
						close();
					}
				}));
			}
		}
		return mDriver;
	}

	/**
	 * Close.
	 */
	public static void close() {
		try {
			getCurrentDriver().quit();
			mDriver = null;
		} catch (UnreachableBrowserException e) {
			LOGGER.log(Level.SEVERE, "cannot close browser: unreachable browser", e);
		} finally {
			LOGGER.info("closing the browser");
		}
	}

	/**
	 * Load page.
	 *
	 * @param url
	 *            the url
	 */
	public static void loadPage(String url) {
		getCurrentDriver();
		LOGGER.info("Directing browser to:" + url);
		getCurrentDriver().get(url);
	}

	/**
	 * Reopen and load page.
	 *
	 * @param url
	 *            the url
	 */
	public static void reopenAndLoadPage(String url) {
		mDriver = null;
		getCurrentDriver();
		loadPage(url);
	}

	/**
	 * Wait for element.
	 *
	 * @param elementToWaitFor
	 *            the element to wait for
	 * @return the web element
	 */
	public static WebElement waitForElement(WebElement elementToWaitFor) {
		return waitForElement(elementToWaitFor, null);
	}

	/**
	 * Wait for element.
	 *
	 * @param elementToWaitFor
	 *            the element to wait for
	 * @param waitTimeInSeconds
	 *            the wait time in seconds
	 * @return the web element
	 */
	public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
		if (waitTimeInSeconds == null) {
			waitTimeInSeconds = 10;
		}
		WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
		return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}

	/**
	 * Gets the parent.
	 *
	 * @param element
	 *            the element
	 * @return the parent
	 */
	public static WebElement getParent(WebElement element) {
		return element.findElement(By.xpath(".."));
	}
}
