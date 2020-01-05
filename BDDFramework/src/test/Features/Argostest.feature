@ Printers
Feature: Selecting a product by brand name

  Scenario: Client searching for printers on website

    Given Client type the url and hit the enter button
    When Client click the search button
    Then Client type printer in search button & click
    And Client close the browser
