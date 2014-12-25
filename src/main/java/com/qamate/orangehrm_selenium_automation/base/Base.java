package com.qamate.orangehrm_selenium_automation.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Base {
	@BeforeMethod
	public void _beforeTest() throws MalformedURLException{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://localhost:444/wd/hub"), cap);
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
