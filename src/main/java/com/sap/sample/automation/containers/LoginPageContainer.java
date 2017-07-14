package com.sap.sample.automation.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageContainer {

	@FindBy(how = How.NAME, using = "loginform")
	public WebElement loginForm;

	@FindBy(how = How.NAME, using = "login")
	public WebElement usernameInput;

	@FindBy(how = How.NAME, using = "passwd")
	public WebElement passwordInput;

	@FindBy(how = How.XPATH, using = "/html/body/table[2]/tbody/tr[11]/td[2]/input")
	public WebElement submitButton;
}
