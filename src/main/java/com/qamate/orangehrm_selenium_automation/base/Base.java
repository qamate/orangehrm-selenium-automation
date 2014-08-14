package com.qamate.orangehrm_selenium_automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Base {
	@BeforeMethod
	public void _beforeTest(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost/");
	}
	@AfterMethod
	public void _afterTest(){
		try{
			driver.close();
		}catch(Exception ignore){
			
		}
		try{
			driver.quit();
		}catch(Exception ignore){
			
		}
	}
	
	protected WebDriver driver;
}
