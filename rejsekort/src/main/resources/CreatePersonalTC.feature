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
#Feature: Create a new Travel Card
#
#
#Background:
    #Given a cpr number "cprOK"
    #And a verified credit card
    #
  #Scenario: Create Personal Travel Card Successfully
 #	 Given credit card verified status is true
    #When issue a personal travel card
    #Then a new User is registered
    #And the kiosk issues a new personal travel card
#
  #Scenario: Create Personal Travel Card Unsuccessfully
    #Given credit card verified status is false
    #When issue a personal travel card
    #Then the kiosk displays a message is shown that travel card not created
#
  #Scenario: Create Personal Travel Card Unsuccessfully
    #Given a cpr number "cprNotOK"
    #And credit card verified status is true
    #When issue a personal travel card
    #Then the kiosk displays a message is shown that travel card not created
#
#
