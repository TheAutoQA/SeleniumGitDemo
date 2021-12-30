package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	// use By locator and define the object
	By EmailAddress= By.cssSelector("input[type*='email']");
	By Password= By.cssSelector("input[id*='password']");
	By Remember= By.cssSelector("label[for*='remember_me']");
	By LogIn = By.cssSelector("input[type='submit']");
	By forgotPassword = By.cssSelector("a[href*='forgot_password']");
// create method to call the object
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Email()
	{
		return driver.findElement(EmailAddress);
	}

	public WebElement password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(LogIn);
	}

	public WebElement RememberMe()
	{
		return driver.findElement(Remember);
	}
	
	
}
