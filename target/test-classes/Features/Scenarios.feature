Feature: Login functionality

Scenario: with valid credentials

Given I enter valid username as "username" and valid password as "password"
When I click ons Login button
Then I should see home Page

Scenario: with invalid username

Given I enter invalid username as "usernam" and valid password as "password"
When I click ons Login button
Then I should see error message "your password or login is not valid, try again!"

Scenario: with invalid password

Given I enter valid username as "username" and invalid password as "passwor"
When I click ons Login button
Then I should see error message "your password or login is not valid, try again!"


Scenario: with invalid credentials

Given I enter invalid username as "usernam" and invalid password as "passwor"
When I click ons Login button
Then I should see error message "your password or login is not valid, try again!"
