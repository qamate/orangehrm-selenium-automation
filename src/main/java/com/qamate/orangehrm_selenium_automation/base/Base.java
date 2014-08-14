package com.qamate.orangehrm_selenium_automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class Base {
	@BeforeTest
	public void _beforeTest(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost/");
	}
	@AfterTest
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
