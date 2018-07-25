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
Feature: Reload travel card

Background: 

    Given a valid credit card 
    And a travel card with a balance of 50
    
  @tag1
  Scenario: Successful reload of a travel card 
    And the kiosk is functioning 
    When the customer reloads the travel card with 100
    Then travel card has a new balance 150 #no bonus
    And the credit card is charged with 50 
    And the kiosk displays a message that the travel card was reload successfully

  #@tag2
  #Scenario: UnSuccessful reload
    #Given credit card verified status is false
    #And kiosk service status is false
    #When a user reloads with 100
    #Then travel card has a new balance 50
    #And the kiosk displays message that reload failed
#
      #@tag2
  #Scenario: UnSuccessful reload
    #Given credit card verified status is false
    #And kiosk service status is true
    #When a user reloads with 100
    #Then travel card has a new balance 50
    #And the kiosk displays message that reload failed