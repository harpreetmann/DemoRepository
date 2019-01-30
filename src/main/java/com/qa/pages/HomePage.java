package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@class='panel-body']/strong")
	WebElement nameLabel;
	@FindBy(xpath="//*[@id='Primary_Navbar-Domains']/a")
	WebElement domainName;
	@FindBy(xpath=".//*[@id='Primary_Navbar-Domains-My_Domains']/a")
	WebElement mydomainlink;
	@FindBy(xpath="//a[Contains(text(),'Services')]")
	WebElement serviceName;
	@FindBy(xpath="//div[@class='panel-body']/strong")
	WebElement namelabel;
	@FindBy(xpath="//li[@id='Primary_Navbar-Open_Ticket']")
	WebElement openTicketLink;
	
	//initializing the page object
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
	public DomainPage clickOnMyDomainLink()
	{
		mydomainlink.click();
		return new DomainPage();
	}
	public boolean UserNameLabel()
	{
		return namelabel.isDisplayed();
	}
	public OpenTicketPage clickOnOpenTicketLink()
	{
		openTicketLink.click();
		 return new OpenTicketPage();
	}
	

}