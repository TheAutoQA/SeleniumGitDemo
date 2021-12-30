package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	// use By locator and define the object
	By Email= By.cssSelector("input[type*='email']");
	By Next = By.cssSelector("input[type*='submit']");
	
// create method to call the object
	
	public ForgotPassword(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	public WebElement Next()
	{
		return driver.findElement(Next);
	}
}
