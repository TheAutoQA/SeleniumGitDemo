package Cucumber.Automation;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	WebDriver driver;
	 @Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	        //System.out.println("User is on Netbanking page");
	        System.setProperty("webdriver.chrome.driver", "C:\\Selenium3\\Browser\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.get("https://www.msn.com/en-in/");
	        driver.findElement(By.cssSelector("[title$='Sign in']")).click();
	    }

	 @When("^User login into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	 {
	        //System.out.println(strArg1);
	        //System.out.println(strArg2);
		 driver.findElement(By.id("i0116")).sendKeys(strArg1);
		 driver.findElement(By.cssSelector("[type$='submit']")).click();
		 driver.findElement(By.id("i0118")).sendKeys(strArg2);
	 }
	 

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        System.out.println("Home page validated");
	    }

	    @And("^cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String strArg1) throws Throwable {
	        System.out.println(strArg1);
	    }

	}