package applicationTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterUse;
import resources.Generic;

public class Listeners extends Generic implements ITestListener{
	ExtentReports extent=ExtentReporterUse.getReportObject();
	ExtentTest test;
	ThreadLocal<ExtentTest>extentTest= new ThreadLocal<ExtentTest>();
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}

	public void onStart(ITestContext result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onTestFailure(ITestResult result) {
		
		WebDriver driver=null;
		// this will save the logs for failed test in the report 
		extentTest.get().fail(result.getThrowable());
		
	String testMethodName=result.getMethod().getMethodName();	
	
	try {
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} 
	catch(Exception e)
	{
		
	}
	try {
		extentTest.get().addScreenCaptureFromPath(takescreenshot(testMethodName, driver), result.getMethod().getMethodName());
		
		
		//takescreenshot(testMethodName, driver);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		//ITestListener.super.onTestFailure(result);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	public void onTestStart(ITestResult result) {
		
		
		test=extent.createTest(((ITestResult) result).getMethod().getMethodName());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS,"Test passed");
	}

	
}
