package com.sears.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sears.qa.base.TestBase;
import com.sears.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpg;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();	
		loginpg= new LoginPage();
	}
	
	@Test(priority=1, description = "Varified Home Page Title")
	public void loginPageTitleTest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Sears - Shop: Appliances, Tools, Clothing, Mattresses & More");
	}
	
	@Test(priority=2, description="Entered email and password")
	public void loginPageTest() {
		loginpg.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
