Feature: Testing the response of games in currency specification

  @regression
  Scenario Outline: Verify that response is contains correct currencies respectively..
    When User sends a GET request to games endpoint using currency "<currency>"
    Then User must get  a valid status code 200
    And User must get the response  "<currency>"
    Examples:
      | currency |
      | GBP      |
      | EUR      |
      | SEK      |




