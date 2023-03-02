@smoke
Feature: F01_Register | users could register with new accounts


  Scenario: guest user could register with valid data successfully
    Given click on the Register
    When select female Gender
      And enter Firstname
      And enter Lastname
      And choose Day
      And choose Month
      And choose year
      And enter Email
      And enter password
      And enter confirm password
      And click register
    Then verify that Your registration completed





