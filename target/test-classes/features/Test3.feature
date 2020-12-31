@Test3
Feature: Verify no key
  Background:
    Given user goes to  BaseUri
  Scenario: verify no key
    Given the user sends a get request to "/characters" endpoint with no key
  Then the status code should be 409 and content type  should be "application/json; charset=utf-8"
  And  verify the response status line includes "Conflict"







  #1. Send a get request to /characters. Request includes :
  #• Header Accept with value application/json
  #2. Verify status code 409, content type application/json; charset=utf-8
  #3. Verify response status line include message Conflict
  #4. Verify that response body says "error": "Must pass API key for request"