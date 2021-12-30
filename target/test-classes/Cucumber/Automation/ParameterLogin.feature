Feature:  Application Login

Scenario: MyHome page default Login
Given  User is on Netbanking landing page
When  User login into the application with "ValidUser" and password "Abcd1234"
Then  Home page is populated
And   cards are displayed "true"


Scenario: MyHome page default Login
Given  User is on Netbanking landing page
When  User login into the application with "InvalidUser" and password "Dcbd4321"
Then  Home page is populated
And   cards are displayed "false"