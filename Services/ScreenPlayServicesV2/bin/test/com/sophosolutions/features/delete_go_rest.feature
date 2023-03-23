
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: eliminacion de un usuario por id
    Given Dado que "Automatizador Will" establece la base url "Go Rest" del servicio.
    When  Consulta el endpoint "GoRest EndPoint" por medio de la peticion delete y con el id "98013".
    Then  Validar el statusCode sea 204