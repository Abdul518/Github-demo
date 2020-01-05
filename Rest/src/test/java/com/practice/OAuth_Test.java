package com.practice;

import io.restassured.path.json.JsonPath;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static io.restassured.RestAssured.given;

public class OAuth_Test
{
    @Test
    public void Oauthmethod() throws InterruptedException {

        /*               If Mozilla Firefox is your browser this is how you invoke the browser

        *System.setProperty("webdriver.gecko.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();*/

        /*                If Microsoft Edge is your browser than use this syntax
         System.setProperty("webdriver.edge.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\MicrosoftWebDriver.exe");
         WebDriver driver = new EdgeDriver();*/

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
        //driver.get("https://accounts.google.com/signin/oauth/oauthchooseaccount?client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&as=pbPY0tqy2vBn8T1yPqe0zA&destination=https%3A%2F%2Frahulshettyacademy.com&approval_state=!ChRucTZHNkQzRkRjSjhkTFk0OWlTYRIfb3pKbDBhb2xoOXdUY0t0V0xtY192ZHBJQnQtVjlSWQ%E2%88%99AJDr988AAAAAXgvohtEjA92SHwbYgsziqp9pKXvBbQsZ&oauthgdpr=1&xsrfsig=ChkAeAh8Txjr7Ixy6n1TSrl7eKfjjoaT0opPEg5hcHByb3ZhbF9zdGF0ZRILZGVzdGluYXRpb24SBXNvYWN1Eg9vYXV0aHJpc2t5c2NvcGU&flowName=GeneralOAuthFlow");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abdul518");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bismillah");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        //tagname [attribute='value']
        String url= driver.getCurrentUrl();
        String partialcode=url.split("code=")[1];
        String code=partialcode.split("&scope")[0];
        System.out.println(code);



        String accessTokenResponse=given().urlEncodingEnabled(false)
                .queryParams("code",code).queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
                .queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
                .queryParams("grant_type","authorization_code")
                .when().log().all()
                .post("https://www.googleapis.com/oauth2/v4/token").asString();
                JsonPath js = new JsonPath(accessTokenResponse);
                String accessToken=js.getString("access_token");


      String response = given().queryParam("access_token",accessToken).
                when().log().all().
                get("https://rahulshettyacademy.com/getCourse.php").asString();
                System.out.println(response);

            /*        then().extract().response();
                      String responseString=res.asString();
                      System.out.println(responseString);
                      JsonPath js = new JsonPath(responseString);
                      js.get("");        */


    }
}
