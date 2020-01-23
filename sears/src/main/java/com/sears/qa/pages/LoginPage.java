package com.sears.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sears.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
		
	@FindBy(className="shcBtn shcBtnCTA signIn")
	WebElement signInBtn;
	
	//@FindBy(className="shcBtn closeSignInModel")
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancelBtn;
	
	@FindBy(className="registerGetOnlineAccess")
	WebElement joinForFreeLink;
	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public HomePage validateLogin(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		signInBtn.click();
		
		return new HomePage();
	}
	
	
	public NewMemberSignUpPage validateJoinForFreeLink() {
		joinForFreeLink.click();
		
		return new NewMemberSignUpPage();
	}
	
	
	
}
