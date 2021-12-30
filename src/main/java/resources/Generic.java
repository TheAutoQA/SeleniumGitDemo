package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic {

	public static WebDriver driver;
	public Properties prop;
	//public String path ="C:\\Automation\\Project\\Workspace\\E2EProject\\src\\main\\java\\resources\\Browser.properties";
	// In this class we will initialize the browser type
	// create properties global file to store the type of browser to invoke 
	public WebDriver initialiseBrowser() throws IOException
	{
		
		 prop= new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Browser.properties");
				
	prop.load(fis);
		String browserName=prop.getProperty("browser");
				
		if(browserName.contains("chrome"))
			{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			//ChromeOptions options= new ChromeOptions();
			
			//if(browserName.contains("headless"))
			//{
				
				//options.addArguments("headless");
				
			//}	
			
			//driver= new ChromeDriver(options);
			driver= new ChromeDriver();
			
		}
		else if (browserName.equals("firefox")) 
		
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
		else if(browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\msedgedriver.exe");
			 driver= new EdgeDriver();
		}
		return driver;
	}

	public String takescreenshot(String testcaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(sourceFile, new File(destinationFile));
		return destinationFile;
		

}
}


