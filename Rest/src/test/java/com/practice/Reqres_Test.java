package com.practice;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Reqres_Test {
    @Test
    public void listmembers() {
        {
            Response res = given()
                    .when().when().log().all()
                    .get("https://reqres.in/api/users?delay=3");

            res.then()
                    .statusCode(200).and().contentType(ContentType.JSON)
                    .body("page", is(equalTo(1)))
                    .body("data.id", hasItems(1, 2, 3, 4, 5, 6))
                    .body("data.email", hasItem("george.bluth@reqres.in"))
                    .body("data.first_name", hasItems("Eve","Tracey","Charles","Emma"))
                    .body("data.avatar",hasItems("https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"));
            //   .body("email",is(equalTo("george.bluth@reqres.in")));
        }


    }
}
