package Cucumber.Automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
public WebDriver driver;
    @Given("^ User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("user is on Netbanking page");
    }

    @Given("^User is on srilankan airlines home page$")
    public void user_is_on_srilankan_airlines_home_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium3\\Browser\\chromedriver.exe");
          driver= new ChromeDriver();
          driver.get("https://www.srilankan.com/en_uk/us");
          driver.manage().window().maximize();
        
    }

    @When("^ User login into the application with username and password$")
    public void user_login_into_the_application_with_username_and_password() throws Throwable {
       System.out.println("User enters username and password");
    	
    }

    @When("^User click on Login and enters Mnumber and password and clicks login$")
    public void user_click_on_login_and_enters_mnumber_and_password_and_clicks_login() throws Throwable {
       
    	driver.findElement(By.id("navLogin")).click();
    	driver.findElement(By.cssSelector("[name='ffp_username']")).sendKeys("SL3838383");
    	driver.findElement(By.cssSelector("[id='ffp_password']")).sendKeys("12344444");
    	driver.findElement(By.xpath("//button[@type='button']")).click();
    	
    	
    }

    @Then("^ Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page is validated");
    }

    @Then("^Error message is displayed invalid credentials$")
    public void error_message_is_displayed_invalid_credentials() throws Throwable {
     System.out.println("Error message invalid credentials is displayed");
    	
    }

    @And("^  cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("Cards are validated");
    }

}