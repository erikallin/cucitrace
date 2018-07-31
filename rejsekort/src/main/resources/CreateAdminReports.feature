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
Feature: Reports generation 
				The administrator uses the system to generate relevant reports. 
				system is able to record statistics for the travel cards.

  @tag1
  Scenario: Successfull Report Generation
    Given an administrator of the system 
   	And he wants to see the amount of "checked in" travel cards for the month "July " 
   	When he presses generate reports
   	Then the system generates and prints out a "pdf" report
   	
   	
   	
   	 