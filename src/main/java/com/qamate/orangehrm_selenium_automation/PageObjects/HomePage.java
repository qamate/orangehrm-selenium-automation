package com.qamate.orangehrm_selenium_automation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement getUserNameTextBox(WebDriver driver){
		return driver.findElement(By.id("txtUsername"));
	}
	public static WebElement getPasswordTextBox(WebDriver driver){
		return driver.findElement(By.id("txtPassword"));
	}
	public static WebElement getLoginButton(WebDriver driver){
		return driver.findElement(By.id("btnLogin"));
	}
	
	public static WebElement getErrorMessage(WebDriver driver){
		return driver.findElement(By.id("spanMessage"));
	}
}
