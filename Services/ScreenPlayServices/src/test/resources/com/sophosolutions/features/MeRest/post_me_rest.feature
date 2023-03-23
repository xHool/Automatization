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

  @tag2
  Scenario: Title of your scenario
    Given Dado que "Automatizador Supremo" establece la base de la url "Me Rest" del servicio a consultar.
    When Consulta el endpoint "Endpoint MeRest" con metodo post.
      | firtsname | Willintong          |
      | lastname  | Ramirez             |
      | email     | willintong@sophossolutions3.com |
      | password  | calidadpura         |
    Then Validar el statusCode sea 201 y que el esquema "Schame MeRest" sea el correcto.
