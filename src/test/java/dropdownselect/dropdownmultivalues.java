package dropdownselect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownmultivalues {

	public class DropDownValues {
		@Test
		public void testmyDD()
		{

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("C:/Users/harpp/OneDrive/Desktop/dropdown.html");
			WebElement dd = driver.findElement(By.xpath("//select[@id='ms1']"));
			Select selectdd =new Select(dd);
			selectdd.selectByValue("2");
			selectdd.selectByVisibleText("Angular");
			selectdd.deselectAll();
			selectdd.selectByIndex(5);
			selectdd.deselectByIndex(5);
			selectdd.selectByVisibleText("Bootstrap");
					
			
		}

	}

	
	
	
	
	
	
	
}
