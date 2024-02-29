@regression
Feature: Codefios page login functionality validation

@codefiosLoginScenario1 @smoke
Scenario: User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should be landing on dashboard page 

@codefiosLoginScenario2 
Scenario: User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "demo1@codefios.com"
When User enters password as "abc123"
#When User clicks forgot password
When User clicks on sign in button
Then User should be landing on dashboard page 