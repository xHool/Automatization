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

  @tag1
  Scenario: Title of your scenario
    Given Dado que "Will" establece la base url "Go Rest" del servicio.
    When Consulta el endpoint "Endpoint GoRest" usando el id "53490"
    Then Validar el statusCode sea 200 y que la data sea correcta.
      | id     | 53490                       |
      | name   | Deeptimoy Jha                 |
      | email  | deeptimoy_jha@morissette.name |
      | gender | male                          |
      | status | active                        |
