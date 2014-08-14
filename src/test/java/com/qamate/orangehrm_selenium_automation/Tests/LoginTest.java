package com.qamate.orangehrm_selenium_automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qamate.orangehrm_selenium_automation.Actions.Login;
import com.qamate.orangehrm_selenium_automation.PageObjects.HomePage;
import com.qamate.orangehrm_selenium_automation.base.Base;

public class LoginTest extends Base {
	@Test
	public void sucessfullLoginTest(){
		Login login = new Login(driver);
		login.perform("qamate", "qamate");
		Assert.assertTrue(HomePage.getWelcomeMessage(driver).getText().contains("Welcome"));
	}

}
