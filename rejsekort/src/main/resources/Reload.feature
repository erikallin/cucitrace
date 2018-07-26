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
#@tag
Feature: Reload the balance in a travel card
  A travel card user can reload the balance of a travel card in a kiosk
  using a verified credit card.

  Background: 
    Given a travel card user at a reload kiosk at station "Norreport St"
    And his travel card has a balance of 50
    And his credit card "378282246310005" was successfully verified by the reload kiosk
    And his credit card has enough balance to charge 100
  @tag1
  Scenario: Successfully reload travel card balance
    Given the reload kiosk at the station is in working order
    When the travel card user reloads the travel card with 100
    Then the travel card after reload has a new balance 150
    And the credit card is charged with 100
    And the reload kiosk displays a message that the travel card was reloaded successfully

  @tag2
  Scenario: UnSuccessful reload  travel card balance: the kiosk is out of order
    And the reload kiosk at the station is out of order
    When the travel card user reloads the travel card with 100
    Then the travel card after reload has a new balance 50
    And the reload kiosk displays a message that the travel card failed to reload
    
