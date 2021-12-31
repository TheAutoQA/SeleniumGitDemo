package applicationTests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LoginPage;
import pageObjects.QAClick_LandingPage;
import resources.Generic;

public class HomePage extends Generic {

	public WebDriver driver;
	public static Logger log= LogManager.getFormatterLogger(Generic.class.getName());
	
	@BeforeTest()
	public void initialiate() throws IOException
	{
		driver=initialiseBrowser();
		log.info("browser launched");
		
	}
	
	
	@Test(dataProvider="getData")
	// the method should also have the same no of arguments passed in the array 
	public void homepage(String username, String password) throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		// write the landing page class execution steps here
		log.info("Navigated to home page");
		
		QAClick_LandingPage lp= new QAClick_LandingPage(driver);
		LoginPage logpage= lp.getLogin();
		logpage.Email().sendKeys(username);
		logpage.password().sendKeys(password);
		logpage.submit().click();
		
		ForgotPassword fp= new ForgotPassword(driver);
		//ForgotPassword f= logpage.forgotPassword();
		fp.Email().sendKeys("testing");
		fp.Next().click();
		
		// Write the execution steps for LoginPage Page Object class
		// create an object of LoginPage Class 
		
		
		
		//fp.Email().sendKeys("dfdf");
		//fp.Next().click();
		
		
		
	}
	
		// use data provider to parameterize the test
	@DataProvider
	public Object[][] getData()
	{
		//create an array to input data
		//first []- rows which is no of input types
		//second [] - columns which is no of different data values 
		Object[][] data= new Object[2][2];
		// 0th row 
		data[0][0]= "username1@gmail.com";
		data[0][1]= "Password1";
		//1st row
		data[1][0]= "username2@gmail.com";
		data[1][1]= "Password2";
		
		
		return data;
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("browser closed successfully");
		
	System.out.println("Closing browser udpated by User2");
	
}

public void addUser2()
{
	System.out.println("Addding demoUser2");
}
	
	public void developBranch()
	{
		System.out.println("Develop branch created by user1");
	}
}
