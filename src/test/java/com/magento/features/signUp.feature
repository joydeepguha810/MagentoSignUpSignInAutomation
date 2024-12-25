Feature: User Registration

  Scenario: Successful Sign Up
    Given I navigate to the sign up page
    When I fill in the sign up form with "Joydeep", "Guha", "joy.guha@example.com", and "Password123"
