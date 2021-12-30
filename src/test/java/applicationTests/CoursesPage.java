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
		}
		
		@BeforeTest()
		public void initialiate() throws IOException
		{
			driver=initialiseBrowser();
			log.info("Browser launched succeessfully");
			driver.get(prop.getProperty("newurl"));
			log.info("Home page successfully opened");
			//driver.manage().window().maximize();
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
			
			
		}
		
		}
		
		


	

