package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@class='panel-body']/strong")
	WebElement nameLabel;
	@FindBy(xpath="//a[Contains(text(),'Domains')]")
	WebElement domainName;
	@FindBy(xpath="//a[Contains(text(),'Services')]")
	WebElement serviceName;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public DomainPage clickOnDomainsLink()
	{
		domainName.click();
		return new DomainPage();
	}
	public ServicePage clickOnServiceLink()
	{
		domainName.click();
		return new ServicePage();
	}
	
}
