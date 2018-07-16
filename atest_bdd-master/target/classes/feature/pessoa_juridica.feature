
Feature: Manages Pessoa Juridica



#----------------------------------------------------------------------------------------------------------------------
  Scenario: Pessoa Juridica (PJ) - For checking confirmation e-mail (not a random email)
    Given I am at "http://netshoes.com.br" <PJ>
     When I create a company with 'razao social' as "Qualquercoisa" and 'nome fantasia' as "Fadiga Sports" and "softbox.ns.pj01@gmail.com"
      And change 'razao social' to "OutraCoisa", 'nome fantasia' as "Trincado Fitness", phone to "(34) 3232-3232" and cellphone to "(34)99300 - 1010"
      And change the company password to "netshoeS 123#" and do a logout and login again
      And add this CEP "06460-908" for shipping
      And put into the cart the product "produto/rolo-p-exercicios-acte-sports-509-0087-150?" choosing another shipping address for PJ
      And buy with boleto PJ
      And delete one of the shipping addresses
     Then all of the previous steps were done successfully


#----------------------------------------------------------------------------------------------------------------------
  Scenario: Pessoa Juridica (PJ)
    Given I am at "http://netshoes.com.br" <PJ>
     When I create a company with 'razao social' as "Qualquercoisa" and 'nome fantasia' as "Fadiga Sports"
      And change 'razao social' to "OutraCoisa", 'nome fantasia' as "Trincado Fitness", phone to "(34) 3232-3232" and cellphone to "(34)99300 - 1010"
      And change the company password to "netshoeS 123#" and do a logout and login again
      And add this CEP "06460-908" for shipping
      And put into the cart the product "produto/rolo-p-exercicios-acte-sports-509-0087-150?" choosing another shipping address for PJ
      And buy with boleto PJ
      And delete one of the shipping addresses
     Then all of the previous steps were done successfully

