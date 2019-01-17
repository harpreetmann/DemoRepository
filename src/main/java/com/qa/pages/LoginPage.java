package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//pageFactory or object repository
	
	
	@FindBy(id="inputEmail")
	WebElement username;
	
	@FindBy(id="inputPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@alt='PHPTRAVELS']")
	WebElement logoimg;
	
	@FindBy(xpath="//a[contains(text(),'Register']")
	WebElement registerbtn;
	
	//intializing all above webelement :in the constructor of the class by using initElements method
	//this repesent current classobjects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//different functions of login page
	public String loginPageTitle()
	{
	return driver.getTitle();
	}
	
	public boolean validateLogoimg()
	{
		return logoimg.isDisplayed();
	}
	
	public HomePage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
}
