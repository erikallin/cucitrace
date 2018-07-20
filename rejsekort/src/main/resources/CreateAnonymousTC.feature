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
Feature: Title of your feature
  I want to use this template for my feature file

Background:
    Given a credit card number 12345678

  Scenario: Create Anonymous Travel Card Unsuccessfully
    Given a credit card number 555444561
    When issue 
    Then the kiosk displays a message is shown that travel card not created

   
      @tag1
  Scenario: Create Anonymous Travel Card Successfully
    When issue 
    Then the kiosk issues an anonymous travel card