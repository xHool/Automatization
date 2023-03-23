@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Automatizador Will" establece la base url "Go Rest" del servicio.
    When Consulta el endpoint "GoRest EndPoint" por medio de la peticion path y por medio del id "123307".
      | email  | Nintai2@gmail.com |
      | name   | Nintai Ramirez    |
      | gender | female            |
      | status | active            |
    Then Validar el statusCode sea 204
