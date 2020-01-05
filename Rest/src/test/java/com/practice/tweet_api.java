package com.practice;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class tweet_api
{
    String consumer_key = "cRyPS7sa9sZt8T7910az8oqj5";

    String consumer_secret ="ryiaialx5JKEhEopzhDkCFVie1NlO8sW3N2rL0ipeFz8wmc6Ps";

    String access_token="1186586710714572801-cD6ebxxxFPUqWgjZXe8oEQGKxPFOIU";

    String token_secret="CnpM415ldyJEaGqoPfnRcCuionSE4kOnle3PS0j1wiQV8";



    @Test
    public void login() {


    Response res = given()
            .auth().oauth(consumer_key,consumer_secret,access_token,token_secret)
            /*queryParams("consumer_key","cRyPS7sa9sZt8T7910az8oqj5")
            .queryParams("consumer_secret","ryiaialx5JKEhEopzhDkCFVie1NlO8sW3N2rL0ipeFz8wmc6Ps")
            .queryParams("access_token","1186586710714572801-cD6ebxxxFPUqWgjZXe8oEQGKxPFOIU")
            .queryParams("token_secret","CnpM415ldyJEaGqoPfnRcCuionSE4kOnle3PS0j1wiQV8")*/
            .when().log().all()

            .get("https://api.twitter.com/1.1/statuses/home_timeline.json")

            .then().body("id_str", hasItems("1208114312532889600","1205438230465781760"))
            .statusCode(200).extract().response();

              String responseString =res.asString();

              System.out.println(responseString);

           // res.prettyPrint();

    // System.out.println(res.asString());
}


}
