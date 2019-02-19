Feature: Depositing to an employee card
  		An employee card user can deposit at any self-service machine

  Background: 
   
    Given an employee card with a balance of 100

  Scenario: Successful deposit
   
    Given an employee card with in use status is false
   
    And a self-service machine for depositing at "Green kitchen"
   
    When an employee card is set to in use and is deposited with a balance of 100
   
    Then the employee card after a deposit has a new balance 200
   
    And the depositing self-service machine displays a message that "employee card is successfully deposited"
   
    And the depositing self-service machine posts that message in the system log
  
  Scenario: Unsuccessful deposit: Already in use
   
    Given an employee card with in use status is true
   
    And a self-service machine for depositing at "Meyers"
   
    When an employee card is set to in use and is deposited with a balance of 100
   
    Then the depositing self-service machine displays a message that "employee card already in use"
   
    And the employee card after a deposit has a new balance 100
