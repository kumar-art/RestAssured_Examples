Feature: User API Testing

Scenario Outline: Verify GET user
  Given user sets base URI
  When user sends GET request to "<endpoint>"
  Then user gets response status code "<status>"
  Examples:
    | endpoint          | status |
    | /users/1     | 200    |
    | /users/2     |200     |
    | /users/3     | 200|
# @smoke
Scenario Outline: Create new user
  Given user sets base URI
  When user sends POST request to "<endpoint>"
  Then user gets response status code "<status>"
  Examples:
    |  endpoint          | status |
    | /users         | 201    |
   # | /users/1        | 201    |
#
#  Scenario Outline: Verify user not found
#  Given user sets base URI
#  When user sends GET request to "<endpoint>"
#  Then user gets response status code "<status>"
#    Examples:
#      |  endpoint          | status |
#      | /api/users/23     | 404    |
#      | /api/users/100    | 404    |