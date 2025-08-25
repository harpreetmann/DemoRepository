package com.tcsproject.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsAssignment {
	@Test
	public void testPliers()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		//driver.findElement(By.className("card-title")).click();
		//driver.findElement(By.xpath("//h5[@data-test='product-name']")).click();
		//driver.findElement(By.tagName("h5")).click();
		driver.findElement(By.xpath("//span[text()='$12.01']")).click();
		//driver.findElement(By.xpath("//img[@src='assets/img/products/pliers02.jpeg']")).click();

		//h5[text()=' Pliers ']
		//div/h5[text()=' Pliers ']
		//By.className("card-title")--classname is not unique for every element
		//h5[@data-test='product-name']--this attribute is not unique 
		//span[text()='$12.01']
		//img[@src='assets/img/products/pliers02.jpeg'
		
/*linkText("text") only works on <a> (anchor) elements.
It looks for the visible text inside the <a> tag, not src or other attributes.
This is an <img> element, not a link.
*/
 
}
	@Test
	public void testHammer()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/");
		//driver.findElement(By.className("card-title text-end")).click();
		//driver.findElement(By.xpath("//div/h5[text()=' Thor Hammer ']")).click();
		driver.findElement(By.xpath("//h5[text()=' Thor Hammer ']")).click();
		//driver.findElement(By.xpath("//img[@src='assets/img/products/hammer04.jpeg']")).click();
		driver.findElement(By.xpath("//span[text()='$11.14']")).click();
		//driver.quit();

		
}
}
