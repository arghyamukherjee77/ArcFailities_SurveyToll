
Feature: Login to Aracfacilities Application
         In order to login to the application user has to provide valid user name and valid password
         
         
  Scenario: Login with Valid Credentials
    Given Navigate to "https://staging.arcfacilities.com"
    When Provide valid "arc.test1@mailinator.com" username in the username textbox
    And Provide valid "123456" password in the password textbox
    And Click on the Login Button
    Then User should be navigated into the Arcfacilities application
    Then user should be able to view "Campus" menu in the top menu bar
    
     
    

