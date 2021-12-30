Feature: Login into the Application
Scenario Outline: Validate positive path Login Functionality 
Given Initialize chrome Browser
And  Navigate to "https://rahulshettyacademy.com/#/index" site
And  Click on Login link  on the home page
When  Enter <username> and <password> and click on Log In
Then  Verify User succesfully logs into the application
And 	close the browser 

Examples:
|username	|password	|
|test99@gmail.com	|123456	|
|test552@gmail.com	|12345	|








