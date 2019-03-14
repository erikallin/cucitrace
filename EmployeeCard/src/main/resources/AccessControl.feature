Feature: Getting access through access controls with an employee card
  		An employee card user can get access through any access controls where the employee card has a sufficient access control level

  Background: 
   
    Given an employee card with an access level of 1

  Scenario: Successful access
   
    Given an employee card which has the in use status false
   
    And an access control with the ID 10 and a required access level set to 0
   
    When an employee card is set to in use and is used at the access control
   
    Then the employee card is allowed access
   
    And the access control displays a message that "employee card account have access through this access control"
   
    And the access control posts that message in the system log
  
  Scenario: Unsuccessful access: Already in use
   
    Given an employee card which has the in use status true
   
    And an access control with the ID 10 and a required access level set to 0
   
	When an employee card is set to in use and is used at the access control
	
	Then the employee card is not allowed access
   
    And the access control displays a message that "employee card already in use"
    
   Scenario: Unsuccessful access: Access level not high enough
   
    Given an employee card which has the in use status false
   
    And an access control with the ID 10 and a required access level set to 2
   
	When an employee card is set to in use and is used at the access control
	
	Then the employee card is not allowed access
   
    And the access control displays a message that "employee card account does not have access through this access control"
