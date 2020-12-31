
Feature: Verify number of characters
  @Test4
  Scenario: Verify number of characters

  Given user goes to  BaseUri
  When the user sends a get request to "/characters" endpoint
  Then verify status code 200
  And Verify response contains 195 characters







#Verify number of characters
#1. Send a get request to /characters. Request includes :
#• Header Accept with value application/json
#• Query param key with value {{apiKey}}
#2. Verify status code 200, content type application/json; charset=utf-8
#3. Verify response contains 194 characters