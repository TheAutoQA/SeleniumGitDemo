package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practise {

public WebDriver driver;
	
	By Name= By.id("name");
	By Email= By.cssSelector("input[name='email']");
		
	// create constructor for this class 
		public Practise(WebDriver driver) {
			
			this.driver=driver;
		}


		public WebElement Name()
		{
	
			return driver.findElement(Name);
			
		}
		public WebElement Email()
		{
			return driver.findElement(Email);
		}
	
		
}
