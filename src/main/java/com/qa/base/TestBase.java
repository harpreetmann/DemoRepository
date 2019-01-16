package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.qa.util.TestUtil;

public class TestBase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() 
	{
		try {
	  prop = new Properties();
	 FileInputStream ip = new FileInputStream("C:/Users/HMann/eclipse-workspace/FreeCRMTest/src/main/java/com/qa/config/config.properties");
	 prop.load(ip);
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

public static void intialization()
{
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	prop.getProperty("URL");

}











}



