Feature: Login

  Background:
    Given I am at "http://netshoes.com.br" <login>

Scenario Outline: Log in with an social account
  When remove every social account from "<store_username>", "<store_email>" and "<store_password>"
   And log in using "<social_type>", "<social_account>" and "<social_password>"
  Then expect 'Minha Conta' page shows it is connect via social account
  Examples:
    | store_username | store_email             | store_password | social_type | social_account          | social_password |
    | Joao           | qanetshoes.sb@gmail.com | abC 123$       | facebook    | qanetshoes.sb@gmail.com | abC 123$        |
    | Joao           | qanetshoes.sb@gmail.com | abC 123$       | linkedin    | qanetshoes.sb@gmail.com | abC 123$        |
    | Joao           | qanetshoes.sb@gmail.com | abC 123$       | googleplus  | qanetshoes.sb@gmail.com | abC 123$        |
    | Joao           | qanetshoes.sb@gmail.com | abC 123$       | twitter     | qanetshoes.sb@gmail.com | abC 123$        |


