package Stepfolder;

import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siasatsteps {

    WebDriver driver;
    @Given("User is on the website")
    public void user_is_on_the_website()
    {

        System.out.println("user open the website");

    }

    @When("User open the siasat URL")
    public void user_open_the_siasat_URL()
    {
        System.out.println("user open the siasat URL");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.siasat.com");
        driver.manage().window().maximize();

    }
    @Then("User should be displayed news homepage")
    public void user_should_be_displayed_news_homepage()
    {
        System.out.println("user should be displayed new homepage");
    }

    @Then("User closes the window")
    public void user_closes_the_window()
    {
        System.out.println("user should close the window");
    }

}
