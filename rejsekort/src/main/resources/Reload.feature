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
#Feature: Reload travel card
#
#Background: 
#	Given a verified credit card
    #And a travel card with a balance of 50
    #
  #@tag1
  #Scenario: Successful reload
    #Given credit card verified status is true
    #And kiosk service status is true
    #When a user reloads with 100
    #Then travel card has a new balance 160
    #And the kiosk displays message that reload succeeded
#
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