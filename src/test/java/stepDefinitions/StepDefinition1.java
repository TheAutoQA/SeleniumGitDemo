package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;
import pageObjects.PortalPage;
import pageObjects.QAClick_LandingPage;
import resources.Generic;

public class StepDefinition1 extends Generic{
	 @Given("^Initialize chrome Browser$")
	    public void initialize_chrome_browser() throws Throwable {
		 driver=initialiseBrowser();    
	 
	 }

	    @When("^Enter (.+) and (.+) and click on Log In$")
	    public void enter_and_and_click_on_log_in(String username, String password) throws Throwable {
	    	LoginPage lps= new LoginPage(driver);
	    	lps.Email().sendKeys(username);
			lps.password().sendKeys(password);
			lps.RememberMe().click();
			lps.submit().click();
			
	    }

	    @Then("^Verify User succesfully logs into the application$")
	    public void verify_user_succesfully_logs_into_the_application() throws Throwable {
	    	PortalPage pp= new PortalPage(driver);
	    	pp.searchBox().sendKeys("123");
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	driver.get(strArg1);	
	    	driver.manage().window().maximize();
	    }

	    @And("^Click on Login link  on the home page$")
	    public void click_on_login_link_on_the_home_page() throws Throwable {
	    	QAClick_LandingPage lp= new QAClick_LandingPage(driver);
			LoginPage logpage= lp.getLogin();
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	       driver.close();
	    }

}
