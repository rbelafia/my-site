package org.belafia;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


@QuarkusTest
class SiteResourceTest {

    @Test
    void testGetArticles() {
        try(FileInputStream inputStream = new FileInputStream("src/test/resources/articles.graphql")) {
            String body = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
            given()
                    .when()
                    .contentType(ContentType.JSON)
                    .body("{ \"query\":  \"{ " + body + "}\" }")
                    .when()
                    .post("/graphql")
                    .then()
                    .assertThat()
                    .statusCode(200);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Test
    void testGetAuthors() {
        try(FileInputStream inputStream = new FileInputStream("src/test/resources/authors.graphql")) {
            String body = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
            given()
                    .when()
                    .contentType(ContentType.JSON)
                    .body("{ \"query\":  \"{ " + body + "}\" }")
                    .when()
                    .post("/graphql")
                    .then()
                    .assertThat()
                    .statusCode(200);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}