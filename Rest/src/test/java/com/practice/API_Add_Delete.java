package com.practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
//import org.junit.Test;
//import org.testng.annotations.Test;// you can use TestNG if you are not using JUNIT

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class API_Add_Delete {
    @Test
    public void Add_Delete(){
// Task 1 is to Grab the Response after adding the Place API
        RestAssured.baseURI = "http://216.10.245.166";
        Response res = given().
                queryParam("key", "qaclick123" ).
                body("{\n" +
                        "\n" +
                        "    \"location\":{\n" +
                        "\n" +
                        "        \"lat\" : -38.383494,\n" +
                        "\n" +
                        "        \"lng\" : 33.427362\n" +
                        "\n" +
                        "    },\n" +
                        "\n" +
                        "    \"accuracy\":50,\n" +
                        "\n" +
                        "    \"name\":\"Frontline house\",\n" +
                        "\n" +
                        "    \"phone_number\":\"(+91) 983 893 3937\",\n" +
                        "\n" +
                        "    \"address\" : \"29, side layout, cohen 09\",\n" +
                        "\n" +
                        "    \"types\": [\"shoe park\",\"shop\"],\n" +
                        "\n" +
                        "    \"website\" : \"http://google.com\",\n" +
                        "\n" +
                        "    \"language\" : \"French-IN\"\n" +
                        "\n" +
                        "}\n").
                when().post("/maps/api/place/add/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("status",equalTo("OK")).extract().response();

/*whatever response you get from this you store this into a variable res but because it is
in raw format we need to convert it into String first than from String into the JSON format
we need to create a string  let say responseString=res.asString(); To convert to String
Then use JsonPath Class from library to convert string to JSON file so we can pull the data and
do the required assertions. Created a new object js to store the response as Json and later
using the object js get place id triverse the path in the JSon to get to the path and store
that information into a variable called placeid as below

 */
String responseString=res.asString();
//res.prettyPrint();
       System.out.println(responseString);


//Task 2 Grab the Place ID from the Response
        JsonPath js = new JsonPath(responseString);
        String placeid = js.get("place_id");
        System.out.println("Actual Place ID we got is " +placeid);

// Task 3 place this ID in the delete request
         given().
                queryParam("key", "qaclick123" ).

                /* This is how it is mention in the google API to delete the place ID
                    {
                     "place_id" :  "place ID"
                     }
                     When pasting text in the body we need to add " double quotes at front of each line
                      and whenever the line is ending we need to add \n front slash n and use + plus concatenation to
                      let java know it is still one line basically joining lines
                 */
                 body("{ \n" +
                         "      \"place_id\" :  \"" +placeid+"\"\n" +
                         "}").
                 when().
                 post("/maps/api/place/delete/json").
                 then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                 body("status",equalTo("OK"));
        res.prettyPrint();

    }

}
