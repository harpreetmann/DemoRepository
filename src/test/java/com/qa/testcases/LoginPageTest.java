package com.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	public LoginPageTest()
	{
		super();  //it will call the basecalass constructor and intiali
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		loginpage = new LoginPage();
	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginpage.loginPageTitle();
		Assert.assertEquals(title,"Client Area - PHPTRAVELS");
	}
	@Test(priority=2)
	public void logoImageTest()
	{
		boolean flag =loginpage.validateLogoimg();
		Assert.assertTrue(flag); //if flag is true assertion is passed ortherwise fail
	}
	@Test(priority=3)
	public void loginTest()
	{
	homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
