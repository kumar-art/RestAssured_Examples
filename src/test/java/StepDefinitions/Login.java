package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.qameta.allure.Allure;
import org.junit.Assert;

public class Login {

    Response response;
    String requestBody;

    @Given("the has valid endpoint")
    public void the_has_valid_endpoint() {
        Allure.step("Set Base URI to JSONPlaceholder", () ->
                RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
        );
    }

    @When("the user enter {string} and {string}")
    public void the_user_enter_and(String title, String body) {
        requestBody = "{\n" +
                "  \"title\": \"" + title + "\",\n" +
                "  \"body\": \"" + body + "\",\n" +
                "  \"userId\": 1\n" +
                "}";

        Allure.step("Send POST request", () -> {
            // Attach request body to Allure
            Allure.addAttachment("Request Body", requestBody);

            response = RestAssured.given()
                    .header("Content-Type", "application/json")
                    .body(requestBody)
                    .post("/posts");

            // Attach response body to Allure
            Allure.addAttachment("Response Body", response.prettyPrint());
        });


    }

    @Then("the response should get success")
    public void the_response_should_get_success() {
        Allure.step("Verify response is successful", () ->
                response.then().statusCode(201)
        );

    }
}