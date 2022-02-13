Feature: check dashboard functionality

  Background: user is logged in
    Given user is on login page
    When user enter the email 'danikhokhar08@gmail.com' and password 'kh0kh@r-6660'
    And user click on login button
    Then user is navigated to the home page
 @logout @smoke
  Scenario: User is able to logout

    When user open the dropdown
    And user click on Logout
    Then user is able to logout sucessfully
  
