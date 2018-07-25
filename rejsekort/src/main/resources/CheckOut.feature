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
Feature: Checking out with travel card
  		A travel card user can check-out at any checkout automaton

  Background: 
    Given a travel card with a balance of 100

  Scenario: Successful check-out
    Given a travel card with check-in status is true
    And a check-in automaton at "Sydhavn St"
    And a check-out automaton at "Norreport St"
    When a travel card check-out
    Then the automaton displays a message that the travel card is successfully checked-out
    And the travel card after check-out has a new balance 75

  Scenario: Unsuccesful check-out: Not Checked-in
    Given a travel card with check-in status is false
    And a check-out automaton at "Norreport St"
    When a travel card check-out
    Then the automaton displays a message that the travel card is not checked-in
    And the travel card after check-out has a new balance 100
#
#Scenario: Successful Transfer Checkout
#
#	Given a travel card is on transfer
#	When a check-out
#	Then automaton displays a message that the card is checked-out
#	And travel card has a new balance 50
