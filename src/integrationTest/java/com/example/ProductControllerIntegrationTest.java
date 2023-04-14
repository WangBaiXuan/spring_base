package com.example;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductControllerIntegrationTest extends BaseIntegrationTest {
    @Test
    public void findBAll_should_success() {
        given().when().get("/products").then().statusCode(200);
    }
}
