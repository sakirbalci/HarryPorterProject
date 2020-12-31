Feature: verify bad key
  @Test2
    Scenario: verifying bad key
      Given user goes to  BaseUri
      Given the user sends a get request to "/v1/characters" endpoint
      When verify status code 409
      And verify that the contentType is "application/json; charset=utf-8"
      Then verify the response status line includes "Unauthorized"
      Then verify the response body says "error": "API Key Not Found"
