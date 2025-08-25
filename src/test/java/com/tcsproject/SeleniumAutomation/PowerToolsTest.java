package com.tcsproject.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerToolsTest {
	@Test
	public void testHammer()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		driver.findElement(By.xpath("//a[text()=' Categories ']")).click();
		driver.findElement(By.xpath("//a[text()='Power Tools']")).click();
		WebElement dd = driver.findElement(By.xpath("//select[@class='form-select']"));
		dd.click();
		Select selectdd = new Select(dd);
		selectdd.selectByVisibleText("Price (High - Low)");

	    // Locate the Sheet Sander element
		WebElement beltsander = driver.findElement(By.xpath("//h5[text()=' Sheet Sander ']"));
		  
	    // Validate presence
	    Assert.assertTrue(beltsander.isDisplayed(), "Belt Sander is not displayed on the page");
		}

}
