package com.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	
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
	
	@Test
	public void loginPageTitleTest()
	{
		String title = loginpage.loginPageTitle();
		Assert.assertEquals(title,"Client Area - PHPTRAVELS");
	}
	@Test
	public void logoImageTest()
	{
		boolean flag =loginpage.validateLogoimg();
		Assert.assertTrue(flag); //if flag is true assertion is passed ortherwise fail
	}
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
