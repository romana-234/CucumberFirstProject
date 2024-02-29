
@regression 
Feature: Codefios page login functionality validation

Scenario Outline: User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks on sign in button
Then User should be landing on dashboard page 

Examples:  
	|username|password|
	|demo@codefios.com|abc2123|
	|demo1@codefos.com|abc123|
	|demo3@codefos.com|abttc123|
	|||