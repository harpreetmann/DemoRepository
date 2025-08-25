package com.tcsproject.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MyFirstSeleniumTest {
@Test
public void loginTest()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	WebElement formAuthentication = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
	formAuthentication.click();
	WebElement UsernameTextfield = driver.findElement(By.xpath("//*[@id='username']"));
	UsernameTextfield.sendKeys("tomsmith");
	WebElement PasswordTextfield = driver.findElement(By.xpath("//*[@id='password']"));
	PasswordTextfield.sendKeys("SuperSecretPassword!");
	WebElement LoginButton = driver.findElement(By.xpath("//*[@id='login']/button"));
	LoginButton.click();
	WebElement confirmationMessageElement = driver.findElement(By.xpath("//*[@id='flash']"));
	String message = confirmationMessageElement.getText().strip();
	
	Assert.assertEquals(message," You logged into a secure area! x");
	driver.quit();
	}
@Test
public void dynamicContestTest()
{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[@id='content']/ul/li[13]/a")).click();
	
	// locate checkbox
	WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox']/input"));
	checkbox.click();
	// assert that checkbox is selected
	Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected!");
	driver.findElement(By.xpath("//*[@id='checkbox-example']/button")).click();
	WebElement confirmationMessageElement = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
	String message = confirmationMessageElement.getText();
	Assert.assertEquals(message,"Remove");
	
}
@Test
public void dynamicContestButtonIsEnabled()
{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//*[@id='content']/ul/li[13]/a")).click();
	//locate button
	driver.findElement(By.xpath("//*[@id='input-example']/button")).click();
	WebElement confirmationMessageElement = driver.findElement(By.xpath("//*[@id='input-example']/button"));
	String message = confirmationMessageElement.getText();
	Assert.assertEquals(message,"Enable");
	driver.quit();
	
}
@Test
public void printElementWithDom()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://the-internet.herokuapp.com/");
	List<WebElement> list = driver.findElements(By.xpath("//div[@id='content']/ul/li"));
	for (WebElement item : list) {
		if(item.getText().endsWith("DOM"))
		{
	    System.out.println(item.getText());
		}
	}








}
}
