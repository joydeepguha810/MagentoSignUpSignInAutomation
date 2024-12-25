Feature: User Login

  Scenario: Successful Login
    When I log in with email "joy.guha@example.com" and password "Password123"
    Then I should be logged in successfully
