Feature: login functionality
  Background: navigate
    Given user navigate to the login screen

    Scenario: login with valid data
    When  user enter valid "tomsmith" and "SuperSecretPassword!"
    And   click on login button
    Then  user could login successfully

  Scenario: login with invalid data
    When  user enter valid "tomsmith" and "SuperSecretPassword!"
    And   click on login button
    Then  user could login successfully
