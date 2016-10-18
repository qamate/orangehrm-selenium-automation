package com.qamate.orangehrm_selenium_automation.PageObjects;

import in.mayurshah.base.BasePageObjects;
import in.mayurshah.util.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePageObjects {
	private static final By byTxtUserName = By.id("txtUsername");
	private static final By byTxtPassword = By.id("txtPassword");
	private static final By byBtnLogin = By.id("btnLogin");
	private static final By bySpanMessage = By.id("spanMessage");

	private static Log log = new Log();
	
	public static WebElement getUserNameTextBox(WebDriver driver){
		waitForElementVisible(log,driver,byTxtUserName,15);
		return driver.findElement(byTxtUserName);
	}
	public static WebElement getPasswordTextBox(WebDriver driver){
		return driver.findElement(byTxtPassword);
	}
	public static WebElement getLoginButton(WebDriver driver){
		return driver.findElement(byBtnLogin);
	}
	
	public static WebElement getErrorMessage(WebDriver driver){
		return driver.findElement(bySpanMessage);
	}
}
