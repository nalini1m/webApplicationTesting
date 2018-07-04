Feature: NewTours application logIn Functionality testing

Scenario Outline: Validating login functionality of NewTours Application

Given Open firefox browser and navigate to newtours application
When User enters valid "<UserName>" and "<Password>" and click on signin button
Then User should be able to successfully login to the application and close the browser

Examples:
 |  UserName 		|  Password   |
 |  tutorial    |  tutorial   |
 



