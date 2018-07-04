Feature: NewTours application login functionality Testing

Scenario Outline: Validating Login functionality of newTours application

Given Open firefox browser and navigate to newTours application
When User enters valid "<UserName>" and "<Password>" and click on SignIn button
Then User should be able to successfully login to the application and close the application

Examples:
| UserName  |  Password  |
| tutorial  |  tutorial  |
| admin     |  mercury   |
| tutorial  |  tutorial  |
| admin     |  mercury   | 
