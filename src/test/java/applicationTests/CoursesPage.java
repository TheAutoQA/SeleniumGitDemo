package applicationTests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Practise;
import pageObjects.QAClick_LandingPage;
import resources.Generic;

public class CoursesPage extends Generic {

	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Generic.class.getName());
		

	@AfterTest
		public void teardown()
		{
			driver.close();
			System.out.println("This code is updated by User1");
		}
		
		@BeforeTest()
		public void initialiate() throws IOException
		{
			driver=initialiseBrowser();
			log.info("Browser launched succeessfully");
			driver.get(prop.getProperty("newurl"));
			log.info("Home page successfully opened");
			//driver.manage().window().maximize();
		System.out.println("This is updated by DemoUser2");
		}
		
		@Test
		
		public void coursesPage() throws IOException, InterruptedException
		{
			
			// Use assertion to validate the text on the home page
			QAClick_LandingPage lp= new QAClick_LandingPage(driver);
			lp.getpractise().click();
			
			Thread.sleep(2000);
			
				Practise p = new Practise(driver);
				p.Name().sendKeys("Santosh");
				p.Email().sendKeys("thetechgig@gmail.com");
				System.out.println("this is updated by User1");
			System.out.println("This is added by DemoUser2");
			
		}
		
			public void addedbyUser1()
			{
				System.out.println("This method1 is added by user1");
				System.out.println("This method2 is added by user1");
				System.out.println("This method3 is added by user1");
			}
		
		}
		
		


	

