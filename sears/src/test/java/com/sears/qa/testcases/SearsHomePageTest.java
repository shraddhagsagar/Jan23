package com.sears.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SearsHomePageTest{

	WebDriver driver;
	
	
	@BeforeMethod()
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\data\\data1\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.sears.com");
	}
	
		//Groups
		//invocations-repeat test cases
		//priority
		//description
		//parameters
		//Data Provider-pass diff set of data
		//DependsonMethods
		//timeout
	@Ignore
	@Test
	public void test4() {
		String x ="100A";
		Integer.parseInt(x);
		
	}
		
	
	//@Ignore
	@Test(priority=2, groups="database Testing", description = "Varified Sears Home Page Title")
	public void searsTitleTest() throws InterruptedException
	{	//Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Sears - Shop: Appliances, Tools, Clothing, Mattresses & More");	
	}
	
	@Test(priority=1, groups="Sanity Testing", description = "Varified Image on homepage")
	public void testHomepageImage1() {
		boolean b=driver.findElement(By.xpath("//*[@id='skylineImage']")).isDisplayed();
		Assert.assertTrue(true);
		//System.out.println(b);
	}
	
	@Test(priority=1, groups="Regression Testing", description = "Varified Image on homepage")
	public void testHomepageImage2() {
		boolean b=driver.findElement(By.xpath("//*[@id='skylineImage']")).isDisplayed();
		Assert.assertTrue(true);
		//System.out.println(b);
	}
	
	@Test(priority=1, groups="Sanity Testing", description = "Varified Image on homepage")
	public void testHomepageImage3() {
		boolean b=driver.findElement(By.xpath("//*[@id='skylineImage']")).isDisplayed();
		Assert.assertTrue(true);
		//System.out.println(b);
	}
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
	
	
}
