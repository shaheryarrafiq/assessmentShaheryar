@signup
Feature: test the signup functionality

  @SU_TC_1
  Scenario: verify user is able to signup with valid credentials
    Given user is on login page
    When user Click on Signup
    Then User is Navigated to the registration page
    When user enter the  firstname'Test1',lastname'test2',mobile'66099977',email'test',password'123456' and confirmpassword'123456'
    And user click on Signup button
    Then user is navigated to the confirmation page

  @SU_TC_2
  Scenario: verify user is not able to signup with wrong details
    Given user is on login page
    When user Click on Signup
    Then User is Navigated to the registration page
    When user enter  the  firstname'Test1',lastname'test2',mobile'6609997',already used email'test1@gmail.com',password'1234' and confirmpassword'123456'
    And user click on Signup button
    Then user should not be able to signup and see validations
