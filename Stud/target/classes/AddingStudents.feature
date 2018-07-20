

Feature: As an administrator I want to be able to sign up a new user as a student to the system, so that they can start their studies.
 
 @tag1
 Scenario: User which is an administrator adds new user as a student to the system
 	Given an administrator wants to add a student with first name "Joe", last name "Doe", and cpr "1234567899" to the system
 	And the student existance status is false
 	When sign-up
 	Then the student is added to the system
 	
 @tag2
 Scenario: User which is an administrator cannot add new user as a student to the system
 	Given an administrator wants to add a student with first name "Cristian", last name "Botezatu", and cpr "1234567892" to the system
 	And the student existance status is true
 	Then the administrator will be presented with an error message that the user is already in the system