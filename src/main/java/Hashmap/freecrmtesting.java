package Hashmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class freecrmtesting {
	public WebDriver driver;
	public String valueArr[];
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login()
		{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	String value=Data.getUserLoginInfo().get("customer");
	valueArr=value.split("_");
	//System.out.println(value);
	
	driver.findElement(By.id("lid")).sendKeys(valueArr[0]);
	driver.findElement(By.id("pwd")).sendKeys(valueArr[1]);
	driver.findElement(By.id("signin_submit")).click();
	
	}
	@Test
	public void Calendar() throws InterruptedException
	{
		Thread.sleep(3000);
	driver.switchTo().frame("pconnect");
		//driver.findElement(By.xpath("//div[@id='zl-welcome-message']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.xpath("//div[text()='Calendar']")).click();
	}
	
/*	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
*/
}
