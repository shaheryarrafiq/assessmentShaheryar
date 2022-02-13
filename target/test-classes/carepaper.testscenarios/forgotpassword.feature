@forgotpasswrod
Feature: test the forgotpassword functionality

  @FP_TC_1
  Scenario: verify user is able to send the confirmation link
    When click on forgot password
    Then user is on forgotpassword page
    When user enter the email'carepaperautomation@gmail.com'
    And click on reset button
    Then user is navigated to the login page and a comfirmation message is shown
    Then user opens the email and enter email'carepaperautomation@gmail.com' and click next and enter password'password@carepaper' and click next
    Then user is navigated to inbox and opens the 'Reset password instructions' mail
    And user click on Rest Password button
    Then user navigate to changepassword screen
    And user enter new password '11223344' and confirm new password'11223344'
    When user click change password button
    #Then user is navigated to login page
    Then user is navigated to the home page
    And User navigate back to email screen
