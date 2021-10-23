Feature: Login feature using scenario outline concept

Scenario Outline: Login fail - possible combinations

Given the user access the test application
When the user enters an invalid "<Username>" and "<Password>" and clicks on Sign In button
Then a descriptive validation message should be displayed to the user

Examples:
| Username | Password |
| Invalid user1 | Invalid Password1 |
| Invalid user2 | Invalid Password2 |