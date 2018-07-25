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
Feature: Checking In with travel card
  A travel card user can check in at check-in automaton and use any kind of transportation (bus,train)

  Background: 
    Given a travel card with a balance of 100
    And a check-in automaton at "Norreport St"

  Scenario: Successfull check-in
    Given a travel card with check-in status is false
    When Check-in
    Then the automaton displays a message that the travel card is checked-in

  Scenario: Unsuccessfull check-in : the travel card is already checked-in
    Given a travel card with check-in status is true
    When Check-in
    Then the automaton displays a message that the travel card is already checked-in

  Scenario: Unsuccessfull check-in : the travel card has not enough balance
    Given a travel card with check-in status is false
    And a travel card with a balance of 15
    When Check-in
    Then the automaton displays a message that the balance of the travel card is too low
