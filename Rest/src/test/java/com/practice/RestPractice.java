package com.practice;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestPractice {


    @Test
    public void listUsers()
    {
       Response res = given()
                .when()
                       .get("https://reqres.in/api/users?page=2");
            //    .get("https://reqres.in/api/users?page=2");
      // res.prettyPrint();
        res.then()
               // .statusCode(200)
                .statusCode(200).and().contentType(ContentType.JSON)
                .body("page", is(equalTo(2)))
                .body("data.id", hasItems(10,8,9,11));

    }
}
