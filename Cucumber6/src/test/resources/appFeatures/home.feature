@All
Feature: Logout feature

Scenario: Verify if the user is able to logout from the application

Given the user has already logged in
When the user chooses the option to log out
Then the user should be logged out successfully
And the login page should be displayed to the user