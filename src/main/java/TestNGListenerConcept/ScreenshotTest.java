package TestNGListenerConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListener.class)

public class ScreenshotTest extends Base{
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		
	}
	
	
	@Test
	public void LoginTest()
	{
		
		Assert.assertEquals(false, true);
	
	}
	
	@Test
	public void ContactsTest()
	{
		
		Assert.assertEquals(false, true);
	
	}
	@Test
	public void DealsTest()
	{
		
		Assert.assertEquals(false, true);
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
}
	

	
	
	

}
