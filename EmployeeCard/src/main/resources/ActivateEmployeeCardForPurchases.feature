Feature: Activate an Employee Card for purchases in canteens
  			An employee wants to get the possibility to pay with his employee card and provides an employeeID.
  			The employeeID is evaluated if it exists in the system.

  Background: 
   
    Given an employee at a self service machine at canteen "DTU Student Canteen 101"
   
    And his credit card "378282246310005" was successfully verified by the self service machine

  Scenario: Successfully activate an Employee Card for purchases 
   
    Given an employeeID "123456-7890" is not registered in the system
   
    And his credit card accepts to charge the amount of 100
   
    When activate purchases on an employee card
   
    Then an employee card is registered for purchases
   
    And the self service machine displays a message that an employee card is activated for purchases
   
    And the self service machine posts that message on the system log 

  Scenario: Unsuccessfully activate an Employee Card for purchases - credit card does not have enough balance

    Given an employeeID "123456-7890" is not registered in the system

    But his credit card declines to charge the amount of 100

    When activate purchases on an employee card

    Then the self service machine displays a message that an employee card is not registered for purchases because credit card was declined

  Scenario: Unsuccessfully activate an Employee Card for purchases - employee already registered in the system

    Given an employeeID "123456-7890" is registered in the system

    When activate purchases on an employee card

    Then the self service machine displays a message that an employee card is not registered for purchases because user already registered in the system
