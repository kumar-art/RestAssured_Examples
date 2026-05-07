Feature: Login Functionality

  Scenario Outline: Valid Login
    Given the has valid endpoint
    When the user enter "<title>" and "<body>"
    Then the response should get success "<statusCode>"

    Examples:
      | title | body | statusCode |
      | kumar | 1234 | 201        |
      | kminchelle | 0lelplR | 200        |