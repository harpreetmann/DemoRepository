package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DomainPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class DomainPageTest extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	DomainPage domainpage;
	TestUtil testutil;

	public DomainPageTest()
	{
		super();
	}
	@BeforeTest
	public void setup()
	{
		intialization();
		 loginpage = new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		 homepage.clickOnDomainsLink();
		 domainpage=homepage.clickOnMyDomainLink();
	}
	@Test
	
	public void VerifyMyDomainLabeTest()
	{
	
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait,TimeUnit.SECONDS);
	boolean flag=domainpage.VerifyMyDomainLabel();
	Assert.assertTrue(flag);
	System.out.println(flag);
	
	}
	@Test
	public void EnterTextBoxDataTest()
	{
	domainpage.enterTextBoxData();
	}
}
