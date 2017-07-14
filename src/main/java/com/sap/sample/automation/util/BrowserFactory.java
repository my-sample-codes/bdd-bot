package com.sap.sample.automation.util;

import java.awt.Toolkit;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * A factory for creating Browser objects.
 */
public class BrowserFactory {

	/**
	 * Instantiates a new browser factory.
	 */
	private BrowserFactory() {

	}

	/**
	 * Gets the browser.
	 *
	 * @return the browser
	 * @throws URISyntaxException
	 *             the URI syntax exception
	 */
	public static WebDriver getBrowser() throws URISyntaxException {
		System.setProperty("webdriver.gecko.driver", "src/main/resources/firefox/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		addAllBrowserSetup(driver);
		return driver;
	}

	/**
	 * Adds the all browser setup.
	 *
	 * @param driver
	 *            the driver
	 */
	private static void addAllBrowserSetup(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(0, 0));
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dim = new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
		driver.manage().window().setSize(dim);
	}

}
