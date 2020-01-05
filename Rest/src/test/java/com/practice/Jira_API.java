package com.practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Jira_API {
    @Test
    public void get_session_key() {
        RestAssured.baseURI = "http://localhost:8080";
        Response res = given().header("Content-Type", "application/json").
                body("{ \"username\": \"abdul518\", \"password\": \"Jira123\" }").
                when().log().all().
                post("/rest/auth/1/session").then().statusCode(200).
                extract().response();


        // Converting the value of the response from raw format to String using .asString() and storing in responseString
                String responseString =res.asString();
                System.out.println(responseString);
//Converting the value from string to Json format and storing its value in Js object
                JsonPath js= new JsonPath(responseString);
//using the js object to pull the required result that was sessionid and storing in sessionid string.

             //  String sessionname= js.get("session.name");
               String sessionid= js.get("session.value");

        System.out.println(sessionid);

               res.prettyPrint();
        //System.out.println(res);
       // res.prettyPrint();
        //JsonPath js=ReusableMethods.rawToJson(res);
       // String sessionid = js.get("session.value");
       // System.out.println(response);
    }


    }
