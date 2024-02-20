@login
Feature: Test Login

Scenario Outline: Login Success and Failure
	Given I navigate to the loaded page of the application
	When I try to login with username '<username>' and password '<password>'
	Then I should see that I am in logged in status
	
Examples:
	| username		| password	|
	| simple.user	| password	|