package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAClick_LandingPage {

	public WebDriver driver;
	
	
	By signIn=By.cssSelector("a[href*='sign_in']");
	
	By pageTitle= By.cssSelector("div[class='text-center'] h2");
	
	By NavBar= By.cssSelector("ul[class*='nav navbar-nav navbar-right']");
	By practise= By.xpath("//ul[@class='navigation clearfix']/li[7]");
	
	By contactUs= By.xpath("//span[contains( text(), 'clickacademy')]");
	By returnpolicy= By.xpath("//h3[contains( text(), 'Money Back')]");
	
// create constructor for this class 
	public QAClick_LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}


	public LoginPage getLogin()
	{

		 driver.findElement(signIn).click();
		 LoginPage logpage= new LoginPage(driver);
		 return logpage;
		
	}

	public WebElement getTitle()
	{
	
		return driver.findElement(pageTitle);
	}

	public WebElement getNavbar()
	{
		return driver.findElement(NavBar);
	}

	public WebElement getpractise()
	{
		return driver.findElement(practise);
	}
	public WebElement ContactUs()
	{
		return driver.findElement(contactUs);
	}
	
	public WebElement returnpolicy()
	{
		return driver.findElement(returnpolicy);
	}
	
	
}
