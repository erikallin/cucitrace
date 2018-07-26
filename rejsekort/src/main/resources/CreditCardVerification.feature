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
Feature: Using credit card to pay
  A kiosk located in a station. The customer inserts the credit card and the kiosk reads the credit card number 
  and it verifies if the credit card is valid. 
  
  To verify the credit card the following checks are executed:
  * lengthCheck: check the length of the credit card number is between the limits
  * luhnCheck: check the characters of the credit card number are numeric values only
  * companyCheck: check that the numbers fit a type such as (Visa/Master, ..)

  Background: 
    Given a kiosk at station "Norreport St"

  Scenario: Successfully verified: The three checks are met
    Given a credit card with number "378282246310005"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card is valid

  Scenario: Unsuccesfully verified: Failed lengthCheck - The credit card number contains characters
    Given a credit card with number "3782822463100aa"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card is invalid because it contains characters

  Scenario: Unsuccesfully verified: Failed luhnCheck - The credit card number has too few digits
    Given a credit card with number "55561"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card is invalid because it has too few digits

  Scenario: Unsuccesfully verified: Failed companyCheck - The credit card number does not belong to a company provider
    Given a credit card with number "13211111111111111"
    When the kiosk verifies the credit card
    Then the kiosk informs the customer that the provided credit card because it does not belong to a company provider
