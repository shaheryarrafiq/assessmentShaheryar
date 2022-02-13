@login
Feature: test the login functionality
@L_TC_1
  Scenario: verify user is able to login with valid credentials
    
    Given user is on login page
    When user enter the email 'danikhokhar08@gmail.com' and password 'kh0kh@r-6660'
    And user click on login button
    Then user is navigated to the home page
@L_TC_2    
Scenario: verify user is not able to login with invalid email
    
    Given user is on login page
    When user enter the email 'danikhokhar0@gmail.com' and password 'kh0kh@r-6660'
    And user click on login button
    Then user should see a wrong email message
    
    @L_TC_3    
Scenario: verify user is not able to login with invalid password
    
    Given user is on login page
    When user enter the email 'danikhokhar08@gmail.com' and password '123456'
    And user click on login button
    Then user should see a wrong password message
    