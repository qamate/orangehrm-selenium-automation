package com.qamate.orangehrm_selenium_automation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	public static WebElement getWelcomeMessage(WebDriver driver){
		return driver.findElement(By.id("welcome"));
	}
}
