package com.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasItem;

public class Reqres_Post {
    @Test
    public void createusers() {


        Response res = given().contentType("application/json")
                .when().body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}    ")
                .post("https://reqres.in/api/users");


        res.then()
                .statusCode(201).and().contentType(ContentType.JSON)
                //  .body("page", is(equalTo(1)))
                // .body("data.id", hasItems(1, 2, 3, 4, 5, 6))

                .body("name", is("morpheus"))
                .body("job", is(equalTo("leader")));
//                .body("data.first_name", hasItems("Eve","Tracey","Charles","Emma"))
        //              .body("data.avatar",hasItems("https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg"));

        res.prettyPrint();

    }



    @Test
    public void test_latitude() {

        RestAssured.baseURI = "http://maps.googleapis.com";
        given().
                param("location", "-33.8670522,151.1957362").
                param("radius", 1500).
                param("key", "AIzaSyAtLavCZApubqsITemTnVsqtSWSzaMRq0M").
                when().
                get("/maps/api/place/nearbysearch/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("results[0].name", equalTo("Sydney"));
    }


    @Test
    public void add_place_google()
    {

    }



    }