
Feature: Navigate inside an Existing Campus
         In order to navigate inside into an project user has to login with valid credentials

  Scenario: Login to the application and click on an Existing project from the roject list
    Given Navigate to "https://staging.arcfacilities.com"
    When Provide valid "arc.test1@mailinator.com" username in the username textbox
    And Provide valid "123456" password in the password textbox
    And Click on the Login Button
    Then Click on Campuses menu from the top menubar
    And Select "Arghya" campus from the campuslist and click on it
    Then user should be navigated inside into Campus Home Page
    
