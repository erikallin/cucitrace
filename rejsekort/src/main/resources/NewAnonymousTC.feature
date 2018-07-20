#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag 
Feature: Create a new anonymous travel card for users without a Danish CPR number 

Background: 
	Given a verified credit card
	
Scenario: Create Anonymous Travel Card Successfully 
	And credit card verified status is true
	When issue 
	Then the kiosk issues an anonymous travel card 
	
Scenario: Create Anonymous Travel Card Unsuccessfully 
	And credit card verified status is false
	When issue 
	Then the kiosk displays a message that travel card was not created 
	
	
  