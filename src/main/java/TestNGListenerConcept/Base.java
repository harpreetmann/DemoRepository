package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver;
	
	public static void intialization()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		
	}
	public void failed(String testMethodName)
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("C:\\Users\\HMann\\eclipse-workspace\\FreeCRMTest\\screenshot\\"
			+testMethodName+".jpg"));
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
