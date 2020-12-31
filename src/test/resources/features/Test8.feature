@Test8
Feature: Verify house members

  Scenario: Verify house members
    Given user goes to  BaseUri
    When the user sends a get request to "/houses" endpoint
    Then verify status code 200
    Then verify that the contentType is "application/json; charset=utf-8"




#3. Capture the id of the Gryffindor house
#4. Capture the ids of the all members of the Gryffindor house
#5. Send a get request to /houses/:id. Request includes :
#• Header Accept with value application/json
#• Query param key with value {{apiKey}}
#• Path param id with value from step 3
#6. Verify that response contains the same member ids as the step 4