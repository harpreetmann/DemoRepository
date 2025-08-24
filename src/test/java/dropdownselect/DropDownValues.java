package dropdownselect;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DropDownValues {
	@Test
	public void testmyDD()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[11]/a")).click();
		WebElement dd = driver.findElement(By.xpath("//*[@id='dropdown']"));
		Select selectdd =new Select(dd);
		selectdd.selectByValue("2");
		selectdd.selectByIndex(1);
		selectdd.selectByValue("2");
		selectdd.deselectByValue("2");
				
		
	}

}
