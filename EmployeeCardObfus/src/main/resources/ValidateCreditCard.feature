Feature: Using credit card to deposit money
  A self service machine located in a canteen. The employee inserts the credit card and the self service machine reads the credit card number 
  and it validates if the credit card is valid. 
  
  Background: 
   
    Given a self service machine at canteen "Meyers"

  Scenario: Successfully validated: The three checks are met
   
    Given a credit card with number "378282246310005"
   
    When the self service machine validates the credit card
   
    Then the self service machine informs the employee that the provided credit card is valid


  Scenario: Unsuccesfully validated: The credit card number contains characters

    Given a credit card with number "3782822463100aa"

    When the self service machine validates the credit card

    Then the self service machine informs the employee that the provided credit card is invalid because it contains characters

  Scenario: Unsuccesfully validated: The credit card number has too few digits

    Given a credit card with number "55561"

    When the self service machine validates the credit card

    Then the self service machine informs the employee that the provided credit card is invalid because it has too few digits

  Scenario: Unsuccesfully validated: The credit card number does not belong to a company provider

    Given a credit card with number "13211111111111111"

    When the self service machine validates the credit card

    Then the self service machine informs the employee that the provided credit card because it does not belong to a company provider
    
