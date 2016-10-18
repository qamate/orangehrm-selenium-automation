package com.qamate.orangehrm_selenium_automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.mayurshah.base.BaseActions;
import com.qamate.orangehrm_selenium_automation.Actions.Login;
import com.qamate.orangehrm_selenium_automation.PageObjects.Dashboard;
import com.qamate.orangehrm_selenium_automation.PageObjects.HomePage;

public class LoginTest extends BaseActions {
	@Test
	public void sucessfullLoginTest(){
		Login login = new Login(driver);
		login.perform("admin", "admin");
		Assert.assertTrue(Dashboard.getWelcomeMessage(driver).getText().contains("Welcome"));
	}
	@Test
	public void rightUserNameWrongPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("qamate", "qamaet");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Invalid credentials"));
	}
	@Test
	public void rightUserNameBlankPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("qamate", "");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Password cannot be empty"));
	}
	@Test
	public void wrongUserNameRightPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("qamaet", "qamate");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Invalid credentials"));
	}
	@Test
	public void wrongUserNameWrongPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("qamaet", "qamet");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Invalid credentials"));
	}
	@Test
	public void wrongUserNameBlankPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("qamaet", "");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Password cannot be empty"));
	}
	
	@Test
	public void blankUserNameRightPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "qamate");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Username cannot be empty"));
	}
	@Test
	public void blankUserNameWrongPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "qamaet");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Username cannot be empty"));
	}
	@Test
	public void blankUserNameBlankPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Username cannot be empty"));
	}
}
