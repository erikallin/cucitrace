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
	The manager uses the system to generate relevant reports and statistics. 
				

@tag1 
Scenario: The manager generates a report with statistics of checked-in travel cards at a specific station
	Given the manager wants to see the number of checked-in and checked-out travel cards for all the stations
	When he generates a station statistics report 
	Then the system produces a pdf report named as "repStationStatistics.pdf"

@tag1 
Scenario: The manager generates a report with the names of users registered in the system
	Given the manager wants to see a list with the names of users registered in the system
	When he generates a name list 
	Then the system produces a text file named as "repNameList.txt" which contains the name list