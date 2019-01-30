package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DomainPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	

	HomePage homepage;
	LoginPage loginpage;
	DomainPage domainpage;
	
	
	public HomePageTest()
	{
		super();  //it will call the basecalass constructor and intializi
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	
	}
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String title=homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "Client Area - PHPTRAVELS");
	}
	@Test(priority=2)
	public void clickOnDomainlinkTest()
	{
		homepage.clickOnDomainsLink();
		domainpage=homepage.clickOnMyDomainLink();
	}
	@Test (priority=3)
	public void userNameLabelTest()
	{
		Assert.assertTrue(homepage.UserNameLabel());
		
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();	
	}
	
	
}