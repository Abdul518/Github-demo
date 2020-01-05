package com.practice;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class NewTwitter_Test


{
    String ConsumerKey = "cRyPS7sa9sZt8T7910az8oqj5";
    String ConsumerSecret = "ryiaialx5JKEhEopzhDkCFVie1NlO8sW3N2rL0ipeFz8wmc6Ps";
    String AccessToken = "1186586710714572801-cD6ebxxxFPUqWgjZXe8oEQGKxPFOIU";
    String TokenSecret = "CnpM415ldyJEaGqoPfnRcCuionSE4kOnle3PS0j1wiQV8";

        @Test
        public void getTweet()
        {
           // Response rss = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessToken,TokenSecret)

               Response rss=given().auth().oauth(ConsumerKey,ConsumerSecret,AccessToken,TokenSecret)
                    .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");

            rss.prettyPrint();

               rss.then().assertThat().body("id_str",hasItems("1208114312532889600", "1205438230465781760"));

        }

        @Test

        public void postTweet(){
            Response rss = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessToken,TokenSecret)
                    .queryParam("status","This is a test from Rest API Automation")
                    .when().log().all()
                    .post("https://api.twitter.com/1.1/statuses/update.json");

            rss.prettyPrint();

            rss.then().assertThat().body("text",is("This is a test from Rest API Automation"));

        }

        @Test

        public void destroyTweet(){


            Response rss = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessToken,TokenSecret)
                    .queryParam("id","1213566903140126725")
                    .when().log().all()
                    //  .when().post("https://api.twitter.com/1.1/statuses/destroy/id.json");
                    .post("https://api.twitter.com/1.1/statuses/destroy/1213566903140126725.json");
            rss.prettyPrint();
            rss.then().assertThat().body("text",is("This is a test from Rest API Automation"));



        }
    }

