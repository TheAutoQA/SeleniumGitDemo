package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalPage {

	public WebDriver driver;

	// use By locator and define the object
	By SearchBox= By.name("query");
	
	
	public PortalPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(SearchBox);
	}



	
}
