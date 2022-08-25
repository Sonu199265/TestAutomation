Feature: Performing a login

  Background: 
    Given I am on the login page

  Scenario: Login with a default user
    When I login with a default user
    Then I shall be on the Flight Finder page
