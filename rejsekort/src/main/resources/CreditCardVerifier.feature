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
Feature: Validate the credit card number and password entered.

Background:
    Given a credit card number 12345678
    And a password 1234
    
  Scenario: Charge a credit card successfully
    When cheksum credit card
    Then the kiosk sets verified credit card status to true
    
  Scenario: Charge a credit card unsuccessfully
    Given a credit card number 555444561
    And a password 1234
    When checksum credit card
    Then the kiosk sets verified credit card status to false
