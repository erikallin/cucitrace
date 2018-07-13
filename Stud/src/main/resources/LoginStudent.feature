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
Feature: As a student I want to be able to login to the system so I can gain access to the system and start using it.
  
  @tag1
  Scenario: User which which has right credentials wants to login to the system
    Given a student tries to login to the system with student ID "s180001" and password "Cristian"
    And the user with student ID "s180001" and password "Cristian" has correct credentials
    When logging in to the system
    Then the user will be logged in the system
    Then the user will be redirected to the main page
    
  @tag2
  Scenario: User which does not have right credential wants to login the system
    Given a student tries to login to the system with student ID "s654321" and password "awesome123"
    And the user with student ID "s654321" and password "awesome123" does not have  correct credentials
    When logging in to the system
    Then the user will not be logged in the system
    Then the user will be presented an error message, that the student ID or password is wrong
    
  
  