@All
Feature: Login feature

Background:
Given the user accesses the CapsuleCRM website

@QAEnvironment @UATEnvironment @ProductionEnvironment
Scenario: Login to the site with valid credentials
When the user logs in with the username "sandesh.sampathgiri" and password "LuckyGarnet^1"
Then the home page should be displayed successfully


@QAEnvironment
Scenario: Login to the site with invalid credentials
When the user logs in with the username "invalidusername" and password "invalidpassword"
Then the user should not be able to home page successfully

@UATEnvironment
Scenario: Login to the site without entering any username
When the user enters only the password "validpassword" and tries to login
Then the validation message should be displayed to the user

@ProductionEnvironment
Scenario: Login to the site without entering any password
When the user enters only the username "validusername" and tries to login
Then the validation message should be displayed to the user