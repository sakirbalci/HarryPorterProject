@Test6
Feature: Verify all character information

  Scenario: Verify all character information
    Given user goes to  BaseUri
    When the user sends a get request to "/characters" endpoint
    Then verify status code 200
    Then verify that the contentType is "application/json; charset=utf-8"
    And the user sends a get request with random name
    Then Verify that response contains the same character information