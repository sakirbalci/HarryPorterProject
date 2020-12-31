@Test7
Feature: Verify name search

  Scenario: Verify name search
    Given user goes to  BaseUri
    When the user sends a get request to "/characters" endpoint
    Then verify status code 200
    Then verify that the contentType is "application/json; charset=utf-8"
    When the user sends a get request with name "Harry Potter"
    Then verify status code 200
    And verify that the contentType is "application/json; charset=utf-8"
    And verify name "Harry Potter"
    Then the user sends a get request to "/characters" endpoint
    Then verify status code 200
    Then verify that the contentType is "application/json; charset=utf-8"
    And the user sends a get request with name "Marry Potter"
    Then verify status code 200
    And verify that the contentType is "application/json; charset=utf-8"
    And verify name is empty











