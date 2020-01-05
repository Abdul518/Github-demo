@ UserRegistration
Feature: User Registration on website
  Scenario: Test the users are registered successfully

    Given user is on the Registration website
    When user enters the register the creds
    And user clicks registration submit Button
    Then user gets confirmation of registration