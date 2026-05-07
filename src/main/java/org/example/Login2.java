//package org.example;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.qameta.allure.Allure;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.junit.Assert;
//
//public class Login2 {
//    Response response;
//
//    @Given("the has valid endpoint")
//    public void the_has_valid_endpoint() {
//        Allure.step("Set Base URI to JSONPlaceholder", () ->
//                RestAssured.baseURI = "https://jsonplaceholder.typicode.com"
//        );
//    }
//
//    @When("the user enter {string} and {string}")
//    public void the_user_enter_and(String title, String body) {
//        String requestBody = "{\n" +
//                "  \"title\": \"" + title + "\",\n" +
//                "  \"body\": \"" + body + "\",\n" +
//                "  \"userId\": 1\n" +
//                "}";
//
//        Allure.step("Send POST request", () -> {
//            Allure.addAttachment("Request URL", RestAssured.baseURI + "/posts");
//            Allure.addAttachment("Request Headers", "Content-Type: application/json");
//            Allure.addAttachment("Request Body", requestBody);
//
//            response = RestAssured.given()
//                    .header("Content-Type", "application/json")
//                    .body(requestBody)
//                    .post("/posts");
//
//            Allure.addAttachment("Response Headers", response.getHeaders().toString());
//            Allure.addAttachment("Response Body", response.prettyPrint());
//        });
//    }
//
//    @Then("the response should get success {string}")
//    public void the_response_should_get_success(String expectedStatus) {
//        Allure.step("Verify response status", () -> {
//            int status = response.getStatusCode();
//            Assert.assertEquals(expectedStatus, String.valueOf(status));
//            Allure.addAttachment("Response status", String.valueOf(status));
//        });
//    }
//}