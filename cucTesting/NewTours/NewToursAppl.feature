Feature: NewTours application LogIn functionality Testing
Scenario Outline: Validating LogIn functionality

Given Open FireFox Browser and navigate to Application
When User enters valid "<UserName>" and "<Password>" and click on SignIn button
Then User should be able to successfully login and close the application

Examples:
| UserName  |  Password  |
| tutorial  |  tutorial  |
| admin     |  mercury   |
