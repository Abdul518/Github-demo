package com.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class weather_api {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
        int status_code = response.getStatusCode();
        Assert.assertEquals(200, status_code);
        System.out.println("Convert the response into String    " +response.asString());
        System.out.println("The status code is "+status_code);
        System.out.println("The time taken to get the response is "+response.getTimeIn(TimeUnit.SECONDS));
    }
    @Test
    public void weather_update()
    {

            given().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
                    .then().statusCode(200)
                    .log().all();




    }


}

