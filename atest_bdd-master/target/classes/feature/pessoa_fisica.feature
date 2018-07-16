
Feature: Manages Pessoa Fisica



#----------------------------------------------------------------------------------------------------------------------
  Scenario: Pessoa Fisica (PF) - For checking confirmation e-mail (not a random email)
    Given I am at "http://netshoes.com.br" <PF>
     When I create a user with name "Softbox" and surname "Back November" and "softbox.ns.blackfriday2015@gmail.com"
      And change my name to "Netshoes", surname to "Back Friday", gender to "F", phone to "(34) 3232-3232" and cellphone to "(34)9191-9191"
      And change my password to "netshoeS 123#" and do a logout and login again
      And add shipping address to CEP "06460-908"
      And put into the cart the product "produto/bone-nike-sb-icon-004-6866-244?" choosing another shipping address for PF
      And buy with boleto PF
      And delete one of my shipping addresses
     Then all of my previous steps were done successfully

#----------------------------------------------------------------------------------------------------------------------
  Scenario: Pessoa Fisica (PF)
   Given I am at "http://netshoes.com.br" <PF>
    When I create a user with name "Joao" and surname "Pitbull da Silva"
     And change my name to "Maria", surname to "Florentina", gender to "F", phone to "(34) 3232-3232" and cellphone to "(34)9191-9191"
     And change my password to "netshoeS 123#" and do a logout and login again
     And add shipping address to CEP "06460-908"
     And put into the cart the product "produto/bone-nike-sb-icon-004-6866-244?" choosing another shipping address for PF
     And buy with boleto PF
     And delete one of my shipping addresses
    Then all of my previous steps were done successfully
