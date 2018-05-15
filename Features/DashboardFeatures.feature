Feature: Dashboard Functionality

  Scenario Outline: To test the Dashboard Functionality
    Given You enter "<userName>"
    And Click on Login button
    And And you enter "<Otp>"
    Then Check show you are on Dashboard Page

    Examples: 
      | UserName             | Otp  |
      | ashu271989@gmail.com | 1234 |
