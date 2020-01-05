@ Exam
Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      | username | password       |
      | Qadeer   | Abdul Mohammed |
    And I click the login button
    Then I should see the userform pag

  Scenario Outline:  Login with correct username and password using Scenerio outline
    Given I navigate to the login page
    And I enter <username> and <password>
    And I click the login button
    Then I should see the userform pag

    Examples:
      | username     | password |
      | Ahyaan       | aariz    |
      | Hafsa        | Mahvish  |
      | Maryam       | khadija  |
      | Abdul Rahman | Saad     |

