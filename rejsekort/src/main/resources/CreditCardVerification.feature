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
Feature: A customer inserts a credit card to the kiosk located in a station. The kiosk reads the credit card number and it verifies if the credit card is valid. 

To verify the credit card the following checks are executed:
* lengthCheck: check the length of the credit card number is between the limits
* luhnCheck: check the characters of the credit card number are numeric values only
* companyCheck: check that the numbers fit a type such as (Visa/Master, ..)  

Background:
	Given a kiosk at station "Norreport St"

  Scenario: Customer places a valid credit card to the kiosk
    Given a credit card with number "378282246310005"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card is valid

  Scenario: Customer places an invalid credit card to the kiosk
    Given a credit card with number "55544a561"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card is invalid
