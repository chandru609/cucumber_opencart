Feature: Login functionality for the application

  Scenario: Successful login with valid credentials
    Given  user is on the login page
    When  user enters a valid username and password
    Then  user is redirected to the homepage
