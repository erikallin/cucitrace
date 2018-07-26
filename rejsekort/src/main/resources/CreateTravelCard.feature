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
Feature: Create a new Travel Card 
					A customer wants to purchase a travel card and provides a cpr number.
					The cpr number is evaluated if it exists in the system. 


Background:
    Given a customer at a registration kiosk at station "Norreport St"
    And his credit card "378282246310005" was successfully verified by the registration kiosk
    
  Scenario: Successfully create new Travel Card user 
    Given  a userID number "123456-7890" is not registered in the system  
    When issue a travel card
    Then a travel card user is registered
    And the kiosk displays a message that a travel card is issued

  Scenario: Create Personal Travel Card Unsuccessfully
    Given  a userID number "123456-7890" is registered in the system  
    When issue a travel card
    Then the kiosk displays a message that a travel card not issued

  #Scenario: Create Personal Travel Card Unsuccessfully
    #Given a cpr number "cprNotOK"
    #When issue a personal travel card
    #Then the kiosk displays a message is shown that travel card not created


