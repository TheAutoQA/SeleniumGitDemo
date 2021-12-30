Feature:  Application Login

Scenario: Home page default Login
Given  User is on Netbanking landing page
When  User login into the application with username and password
Then  Home page is populated
And   cards are displayed

Scenario: Verify srilankan website
Given  User is on srilankan airlines home page
When  User click on Login and enters Mnumber and password and clicks login
Then  Error message is displayed invalid credentials
