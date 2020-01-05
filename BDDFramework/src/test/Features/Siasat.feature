@ Siasat
Feature: Testing the website functionality

  Scenario: Testing the Website Journey
    Given User is on the website
    When User open the siasat URL
    Then User should be displayed news homepage
    And User closes the window
