package com.sears.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try{
		prop= new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/sears/qa/config/config.properties");
				prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
	String browsername =prop.getProperty("browser");
	
	if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrad\\eclipse-workspace\\sears\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrad\\eclipse-workspace\\sears\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("baseurl"));
	
	}
}
