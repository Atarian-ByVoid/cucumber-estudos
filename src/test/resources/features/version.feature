Feature: Testar a funcionalidade de soma

  Scenario: Somar dois números
    Given eu tenho o número 40
    And eu tenho o número 40
    When eu somo esses números
    Then o resultado deve ser 80

  Scenario: Deve incrementar o contador
    Given que o valor do contato é 15
    When eu incremento em 3
    Then o valor do contador sera 18

  Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket é "AF345"
    Given que o valor da passagem é R$ 230,45
    Given que o nome do passageiro é "Fulano da Silva"
    Given que o telefone do passageiro é "99999999"

  Scenario: Deve criar steps genéricos para estes passos
    Given que o ticket é "AF345"
    Given que o ticket especial é "AB167"
    Given que o valor da passagem é R$ 230,45
    Given que o nome do passageiro é "Fulano da Silva"
    Given que o telefone do passageiro é "99999999"

  

