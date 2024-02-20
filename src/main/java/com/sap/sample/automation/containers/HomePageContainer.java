package com.sap.sample.automation.containers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageContainer {

	@FindBy(how = How.ID, using = "inp_search_box")
	public WebElement homePageLogout;
}
