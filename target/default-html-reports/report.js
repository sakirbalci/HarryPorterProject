$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Test7.feature");
formatter.feature({
  "name": "Verify name search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test7"
    }
  ]
});
formatter.scenario({
  "name": "Verify name search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test7"
    }
  ]
});
formatter.step({
  "name": "user goes to  BaseUri",
  "keyword": "Given "
});
formatter.match({
  "location": "Tests.user_goes_to_BaseUri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends a get request to \"/characters\" endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "Tests.the_user_sends_a_get_request_to_Characters_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the contentType is \"application/json; charset\u003dutf-8\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_that_the_contentType_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends a get request with name \"Harry Potter\"",
  "keyword": "When "
});
formatter.match({
  "location": "Tests.the_user_sends_a_get_request_with_name(String)"
});
formatter.result({
  "error_message": "java.lang.ClassCastException: class java.util.ArrayList cannot be cast to class java.util.Map (java.util.ArrayList and java.util.Map are in module java.base of loader \u0027bootstrap\u0027)\r\n\tat StepDefinitions.Tests.the_user_sends_a_get_request_with_name(Tests.java:138)\r\n\tat ✽.the user sends a get request with name \"Harry Potter\"(file:src/test/resources/features/Test7.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that the contentType is \"application/json; charset\u003dutf-8\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.verify_that_the_contentType_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify name \"Harry Potter\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.verify_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user sends a get request to \"/characters\" endpoint",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.the_user_sends_a_get_request_to_Characters_endpoint(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that the contentType is \"application/json; charset\u003dutf-8\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_that_the_contentType_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user sends a get request with name \"Marry Potter\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.the_user_sends_a_get_request_with_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests.verify_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that the contentType is \"application/json; charset\u003dutf-8\"",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.verify_that_the_contentType_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify name is empty",
  "keyword": "And "
});
formatter.match({
  "location": "Tests.verify_name_is_empty()"
});
formatter.result({
  "status": "skipped"
});
});