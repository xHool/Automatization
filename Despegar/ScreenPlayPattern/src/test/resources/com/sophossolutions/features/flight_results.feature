#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given Se debe estar en la pagina de "Despegar".
    When Se llenan los datos para la busqueda del vuelo.
      | Origen    | Cúcuta, Norte de Santander, Colombia |
      | Destino   | Bogotá, Colombia                     |
      | DiaIda    |                                   24 |
      | DiaVuelta |                                   30 |
      | Pasajeros |                                    2 |
    Then I validate the outcomes

  @tag1
  Scenario: Filtros Aerolineas
    When I complete action
