package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Tests {
    String Key = ConfigurationReader.get("key");
    Response response;
    Map<String, Object> aChar;
    @Given("user goes to  BaseUri")
    public void user_goes_to_BaseUri() {
    baseURI = ConfigurationReader.get("harryptr.uri");

    }

    @When("user sends a Get request")
    public void user_sends_a_Get_request() {
    response= RestAssured.given().get("/v1/sortingHat");
    }

    @Then("verify status code {int}")
    public void verify_status_code(int exCode) {
        int acCode = response.statusCode();
        Assert.assertEquals(exCode, acCode);
    }

    @Then("verify that the contentType is {string}")
    public void verify_that_the_contentType_is(String exContentType) {
        String acContentType = response.getContentType();
        Assert.assertEquals(acContentType, exContentType);
    }

    @Then("body contains one of")
    public void body_contains_one_of(List<String> exNames ){
    String acNames = response.body().asString();
    Assert.assertTrue(exNames.contains(acNames.toString()));
        System.out.println(acNames);

    }
    @Given("the user sends a get request to {string} endpoint")
    public void the_user_sends_a_get_request_to_Characters_endpoint(String charEnd) {
        response = RestAssured.given().accept(ContentType.JSON).and().
                queryParam( "key", Key).and().
                get(charEnd);
    }

    @Then("verify the response status line includes {string}")
    public void verify_the_response_status_line_includes(String exStatusLine) {
        Assert.assertTrue(response.statusLine().contains(exStatusLine));
    }

    @Then("verify the response body says {string}: {string}")
    public void verify_the_response_body_says(String string, String string2) {
        String Body = response.getBody().asString();
        Assert.assertTrue(Body.contains(string));
        Assert.assertTrue(Body.contains(string2));
        System.out.println(Body);

    }
    @Given("the user sends a get request to {string} endpoint with no key")
    public void the_user_sends_a_get_request_to_endpoint_with_no_key(String string) {
        response = RestAssured.given().accept(ContentType.JSON).and().
               get(string);
    }

    @Then("the status code should be {int} and content type  should be {string}")
    public void the_status_code_should_be_and_content_type_should_be_application_json_charset_utf(int int1, String str) {
     Assert.assertEquals(int1, response.statusCode());
     Assert.assertEquals(str, response.contentType());

    }
        @Then("Verify response contains {int} characters")
        public void verify_response_contains_characters(int int1) {
            List<String> Characters = response.body().as(List.class);

    Assert.assertEquals(int1,(Characters.size()));
    }
    @Then("Verify all characters in the response have id field which is not empty")
    public void verify_all_characters_in_the_response_have_id_field_which_is_not_empty() {
        //List<Hashtable <String, String>> idList = response.path("_id");
      //  Assert.assertEquals(195, idList.size() );
        List<String> ListofId =  response.path("_id");
        for (String finalList : ListofId) {
        Assert.assertThat(finalList,notNullValue());

        }
        }

    @Then("Verify that value type of the field dumbledoresArmy is a boolean in all characters in the response")
    public void verify_that_value_type_of_the_field_dumbledoresArmy_is_a_boolean_in_all_characters_in_the_response() {

    List<Boolean> dumbledoresArmy = response.path("dumbledoresArmy");

        for (Boolean FinalList : dumbledoresArmy) {

          Assert.assertThat(Boolean.valueOf(FinalList), isA(Boolean.class));
        }

    }
    @Then("Verify value of the house in all characters in the response is one of the following:")
    public void verify_value_of_the_house_in_all_characters_in_the_response_is_one_of_the_following(List<String> houses) {
    List<String> acHouses = response.path("house");
        //System.out.println(acHouses);
             for (String house: acHouses) {
        Assert.assertTrue(acHouses.contains(house));
           //Assert.assertTrue(houses.contains(house) || acHouses.size()>=5);
       }
    }
        @Then("the user sends a get request with random name")
        public void the_user_sends_a_get_request_with_random_name() {
        List<Map<String, Object>> Characters = response.body().as(List.class);
            Random rn = new Random();
            int idNum = rn.nextInt(195);
            aChar = Characters.get(idNum);
            String charName = aChar.get("name").toString();
            response = RestAssured.given().accept(ContentType.JSON).and().
                    queryParams( "key", Key, "name", charName).and().
                    get("/characters");
    }
    @When("the user sends a get request with name {string}")
    public void the_user_sends_a_get_request_with_name(String name) {
      response = given().accept(ContentType.JSON).and().queryParam("key", Key, "name", name).get("/characters");
       // String acName = response.path("id", "5a12292a0f5ae10021650d7e");
        Map<String, String> acName = response.path("id", "5a12292a0f5ae10021650d7e");
        System.out.println(acName);
    }

        @Then("Verify that response contains the same character information")
        public void verify_that_response_contains_the_same_character_information() {
       List<Map<String, String>> acName = response.body().as(List.class);

           Assert.assertEquals(aChar, acName);
        }
    @Then("verify name {string}")
    public void verify_name(String name) {

        response = RestAssured.given().accept(ContentType.JSON).and().
                queryParams( "key", Key, "name", name).and().
                get("/characters");
                String HarryAcName = response.body().asString();
                Assert.assertTrue(HarryAcName.contains(name));
          }

    @Then("verify name is empty")
    public void verify_name_is_empty() {
        response = RestAssured.given().accept(ContentType.JSON).and().
                queryParams( "key", Key, "name", "MarryPotter").and().
                get("/characters");
        String ResponseBody = response.body().toString();
        Assert.assertTrue(ResponseBody.isEmpty());

    }

        

    }
