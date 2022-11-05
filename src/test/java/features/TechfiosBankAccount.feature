@BankFeature @Regression
Feature: Techfios bank and cash New Account Functionality validation
@Scenario1 @Smoke
Scenario Outline: User should be able to login with valid credentials and open a new account	
Given User is on techfios login page
When User enters username as "<username>"
When User enters password as "<password>"
And User click on signin button
Then User should land on Dashboard page
Then User click on bank and cash button
Then User click on new account button
Then User enters account title "<account title>"
Then User enters description "<description>" 
	Then User enters initialBalance "<initialBalance>"
	Then User enters accountNumber "<accountNumber>" 
	Then User enters contactPerson "<contactPerson>"
	Then User enters phone "<phone>" 
	Then User enters internetBankingURL "https://www.chasebank.com/"
	Then User click on submit button
	Then User should be able to validate account created successfully
	
	Examples:
	|username|password|account title|description|initialBalance|accountNumber|contactPerson|phone|internetBankingURL|
	|demo@techfios.com|abc123|Checking & account|checking|$1250|234567890|Tom|2345678901|https://www.chasebank.com/|