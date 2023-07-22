Feature: Validate the login page

  Scenario Outline: Validate the loginpage with valid credentials
    Given user is on the login page.
    When user enters the <username> and <password>
    And user click on the login button
    Then user is logged in successfully

    Examples: 
      | username            | password      |
      | maruthibn@ymail.com | 143anasuyamma |
