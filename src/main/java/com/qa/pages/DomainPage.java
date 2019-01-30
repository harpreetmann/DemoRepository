package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DomainPage extends TestBase{
	@FindBy(xpath="//*[text()='My Domains']")
	WebElement MydomainLabel;
	@FindBy(xpath="//input[@type='search']")
	WebElement TextboxData;
	
	//intializing page factory
	public DomainPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyMyDomainLabel()
	{
		return MydomainLabel.isDisplayed();
	}
	public void enterTextBoxData()
	{
		TextboxData.sendKeys("harpreet");
	}
}
