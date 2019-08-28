Feature: check returned products by the API
  Background:
    * url 'http://dummy.restapiexample.com/'
    * header Accept = 'application/json'
  Scenario: List products
    Given   path 'api/v1/employees'
    When method get
    Then status 200
     And match $.[*].id contains "no"

