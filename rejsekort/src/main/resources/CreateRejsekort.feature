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
Feature: Create a new Travel Card


Background:
    Given a cpr number "1012921234"
    And a credit card number 12345678
    
  Scenario: Create Personal Travel Card Successfully
    When issue
    Then a new User is registered
    And the kiosk issues a new personal travel card

  Scenario: Create Personal Travel Card Unsuccessfully
    Given a credit card number 555444561
    When issue
    Then the kiosk displays a message is shown that travel card not created

  Scenario: Create Personal Travel Card Unsuccessfully
    Given a cpr number "1111111111"
    When issue
    Then the kiosk displays a message is shown that travel card not created


