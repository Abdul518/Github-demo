Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open the hrm homepage
    Then I verify that the logo present on page
    And I close browser
