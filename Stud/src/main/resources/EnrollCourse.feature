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
Feature: As a student I want to be able to enroll in a course, so that I can participate.
    
  @tag1
  Scenario: a student, which is not already signed up, wants to enroll in an existing course 
	  Given a user who wants to enroll in the course "Discrete Math"
	  And the course existence status is true 
	  And the user-course-existence status is false
	  When the user signs up for the course
	  Then the user will be enrolled in the course
	  And the user course-existance status is true
	  
	@tag2
  Scenario: a student, which is not already signed up wants to enroll in a non-existing course
	  Given a user who wants to enroll in the course "Imaginary Mathematics"
	  And the course existence status is false 
	  When the user signs up for the course
	  Then the user will be presented with an error message that the course does not exist
	  
	@tag3
  Scenario: a student, which is already signed up, wants to enroll in an existing course 
	  Given a user who wants to enroll in the course "Discrete Math"
	  And the course existence status is true 
	  And the user-course-existence status is true
	  When the user signs up for the course
	  Then the user will be presented with an error, that he is already enrolled
	 
    
  
