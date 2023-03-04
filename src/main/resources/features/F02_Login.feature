@smoke
Feature:  F02_Login | users could use login functionality to use their accounts


  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with invalid email and password
    And user press on login button
    Then user could not login to the system




