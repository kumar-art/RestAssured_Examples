Feature: Login Functionality
  @smoke
  Scenario: Valid Login
    Given the has valid endpoint
    When the user enter "kminchelle" and "0lelplR"
    Then the response should get success
