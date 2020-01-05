package com.practice;

import io.restassured.RestAssured;
import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class Create_Issue_Jira {
    @Test
    public void create_Jiraissue() {
        // Creating an Issue/Defect via automation and update it on JIRA
        RestAssured.baseURI = "http://localhost:8080";
         Response res=
        given().header("Content-Type", "application/json").
               header("Cookie", "JSESSIONID=FD032E4D4DBA94BEC12B5050B5EFDF59").
                body("{\n" +
                        "        \"fields\": {\n" +
                        "        \"project\": \n" +
                        "        {\n" +
                        "            \"key\": \"QAB\"\n" +
                        "        },\n" +
                        "        \"summary\": \" Creating 2nd session id\",\n" +
                        "        \"description\": \"Another issue to test \",\n" +
                        "        \"issuetype\": {\n" +
                        "            \"name\": \"Bug\"\n" +
                        "        }\n" +
                        "        \n" +
                        "    }\n" +
                        "}").
                when().
                post("/rest/api/2/issue").then().statusCode(201).extract().response();
                res.prettyPrint();

    }
}
