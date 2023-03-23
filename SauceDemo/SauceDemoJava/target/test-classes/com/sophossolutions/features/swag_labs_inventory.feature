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
    Given Estar en la pagina de "Swag Labs".
    When Ingresa usuario: "User", contrasena: "Password" y se autentica.
    Then y valida el mensaje de la pagina SwagLabsHomeInventory "PRODUCTS".

  @tag1
  Scenario: Inventory
    Given Se podran ver los productos disponibles, seleccionarlos y aplicar filtros de ordenamiento para verlos.
    When Se podra agregar una cantidad "3" productos al carrito.
    Then Se valida que el carrito contenga la cantidad de productos anteriormente agregada. "3"
