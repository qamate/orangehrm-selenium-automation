package com.qamate.orangehrm_selenium_automation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import in.mayurshah.base.BasePageObjects;

public class Dashboard extends BasePageObjects {
	private static final By byWelcome = By.id("welcome");
	
	public static WebElement getWelcomeMessage(WebDriver driver){
		waitForClickable(null,driver,byWelcome,40);
		return driver.findElement(byWelcome);
	}
}
