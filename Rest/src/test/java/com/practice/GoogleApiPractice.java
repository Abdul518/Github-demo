package com.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GoogleApiPractice {
//    public static void main(String[] args) {

    @Test
    public void googleapitest() {
        RestAssured.baseURI = "https://maps.googleapis.com";
        given().
                param("location", -33.8670522, 151.1957362).
                param("radius", "1500").
                param("key", "AIzaSyAtLavCZApubqsITemTnVsqtSWSzaMRq0M").

                when().
                get("/maps/api/place/nearbysearch/json").
                //  then().assertThat().statusCode(200).and().contentType(ContentType.XML);
                        then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
        .and().header("Server","scaffolding on HTTPServer2");
                //.and().body("results[0].name",equalTo("sydney"));

    }

}
/*Comments what we have learned so far

 4 blocks in REST API
                 Given (), When (), then (), extract()
                 given()--> Request headers, Request paramaters, Request cookies
                 when ()-->get(resource), post(resource), put(resource), delete(resource)
                 then()--> assertions ( to validate the actual result meets the expected result)
                 extract() --> store results
 */

/*  How do you do assertions
        By verifying below
                            status code of the response i.e 200 ok, 201 create, fail etc.
                            Content type JSon, XML etc.
                            Body
                            Header responses
                            so in this way we can automate REST request API
 */

/*
3 types  of parameters
path parameter ( Path parameter without resource after the question mark with just parameters is
called a path parameter) eg; www.example.com/books/{bookid} to get the id of the book
Query parameter

eg; www.example.com?q=searterm
Header parameter
Domain or host or Base URL all are same

 */