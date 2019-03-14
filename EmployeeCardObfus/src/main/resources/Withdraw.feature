Feature: Using an employee card to purchase goods in canteen and thereby withdrawing from it
  An employee card user can purchase goods from canteen at a self service machine in all kinds of canteens


  Background: 
    
    Given an employee card with a balance of 200
    
    And a self-service machine for withdrawing at "Meyers"

  Scenario: Successful withdrawal
   
    Given an employee card with in use status is false
    
    When an employee card is set to in use and is withdrawn with a balance of 100
    
    Then the employee card after a deposit has a new balance 99
    
    Then the withdrawing self-service machine displays a message that "employee card is successfully withdrawn from"
   
    And the withdrawing self-service machine posts that message in the system log
    
  Scenario: Unsuccessful withdrawal : the employee card is already in use
   
    Given an employee card with in use status is true
    
    When an employee card is set to in use and is withdrawn with a balance of 100
    
    Then the withdrawing self-service machine displays a message that "employee card already in use"

  Scenario: Unsuccessful withdrawal : the employee card does not have enough balance
    
    Given an employee card with in use status is false
    
    And an employee card with a balance of 50
    
    When an employee card is set to in use and is withdrawn with a balance of 100
    
    Then the withdrawing self-service machine displays a message that "the employee card balance is too low"
