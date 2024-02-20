package com.sap.sample.automation.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageContainer {

	@FindBy(how = How.NAME, using = "loginform")
	public WebElement loginForm;

	@FindBy(how = How.ID, using = "login1")
	public WebElement usernameInput;

	@FindBy(how = How.ID, using = "password")
	public WebElement passwordInput;

	@FindBy(how = How.NAME, using = "proceed")
	public WebElement submitButton;
}
