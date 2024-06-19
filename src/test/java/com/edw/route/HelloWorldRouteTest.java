package com.edw.route;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

/**
 * <pre>
 *  com.edw.route.HelloWorldRouteTest
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 19 Jun 2024 14:01
 */
@QuarkusTest
public class HelloWorldRouteTest {
    @Test
    public void testHelloAPI() {
        given()
            .when()
                .get("/api/hello-world")
            .then()
                .statusCode(200)
                .body("hello", isA(String.class))
                .body("hello", equalTo("world"))
                .log().all();
    }
}
