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
Feature: Login into saucedemo page
  yo como automatizador voy a probar el logue de usuarios.

  @tag1
  Scenario: Title of your scenario
    Given Estar en la pagina de "Swag Labs".
    When Ingresa usuario: "User", contrasena: "Password" y se autentica.
    Then y valida el mensaje de la pagina SwagLabsHomeInventory "PRODUCTS".


