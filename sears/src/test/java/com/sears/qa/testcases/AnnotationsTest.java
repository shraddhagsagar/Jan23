package com.sears.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {

	
	
	
	//Preconditions
	@BeforeSuite//1
	public void setUp() {
		System.out.println("Systemsetup");
	}
	
	@AfterSuite//last
	public void after() {
		System.out.println("Generate Test Report");
	}
	
	@Test
	public void testTitle() {
		System.out.println("Test Title");
	}
	
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("Open chrome Browser");
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("Login to app");
	}
	
	@BeforeMethod()
	public void enterurl() {
		System.out.println("Enter URL");
	}
	
	
	
	
	
	@AfterMethod()
	public void aftermethod() {
		System.out.println("logout from app");
	}
	
	
	@AfterClass//3
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	
	
	
	@AfterTest//2
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	
}
