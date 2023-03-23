@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Automatizador Will" establece la base url "Go Rest" del servicio.
    When Consulta el endpoint "GoRest EndPoint" usando el id "98013"
    Then Validar el statusCode sea 200 y que el esquema sea correcto "Go Schema"
