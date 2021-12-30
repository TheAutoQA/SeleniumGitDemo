package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterUse {
	// use extentspark reporter & extentreporter 
		static ExtentReports extent;
		
		 public static ExtentReports getReportObject()
		{
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter= new ExtentSparkReporter(path);
			reporter.config().setReportName("Automation End to End Results");
			reporter.config().setDocumentTitle("Test Results");
			
			 
			extent= new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Santosh");
			return extent;
		}


}
