package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApiLogin {
    Response response;

    @Given("user sets base URI")
    public void user_sets_base_uri() {
        // Write code here that turns the phrase above into concrete actions
        Allure.step("Set Base URI to JSONPlaceholder", () ->
                RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
        );
    }
    @When("user sends GET request to {string}")
    public void user_sends_get_request_to(String string) {
        // Write code here that turns the phrase above into concrete actions

        response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .when()
                .get(string);
        Allure.addAttachment("Response Body", response.prettyPrint());


    }
    @When("user sends POST request to {string}")
    public void user_sends_post_request_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        String body = "{ \"name\": \"Kumar\", \"job\": \"QA\" }";

        Allure.addAttachment("Request Body", body);

         response=RestAssured.given().header("Content-Type","application/json").body(body).when().post(string);
        Allure.addAttachment("Response Body", response.prettyPrint());

    }
    @Then("user gets response status code {string}")
    public void user_gets_response_status_code(String string) {
        // Write code here that turns the phrase above into concrete actions

        int exp=Integer.parseInt(string);
        Allure.addAttachment("Response Status Code", String.valueOf(string));

        Allure.step("Verify response is successful", () ->
               Assert.assertEquals(exp,response.getStatusCode())
       );
    }

}
