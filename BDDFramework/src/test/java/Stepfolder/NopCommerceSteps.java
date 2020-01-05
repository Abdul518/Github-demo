package Stepfolder;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopCommerceSteps {

    WebDriver driver;

   @Before
    public void setup()
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        driver = new ChromeDriver();

    }
  /*  @After
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        driver.close();*/


   @Given("User open the Installed Browser")

    public void userOpenTheInstalledBrowser() {
        System.out.println("User  open the Installed Browser on the computer");


    }
    @When("User open the NopCommerce home page")
    public void userOpenTheNopCommerceHomePage()
    {
        System.out.println("User now open the NopCommerce Home Page");
        driver.get("https://www.nopcommerce.com/");
        driver.manage().window().maximize();
              // driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-login'][contains(text(),'Log in')]")).click();
    }

    @Then("User enter the login credentials")
    public void userenterthelogincredentials() throws InterruptedException {

        System.out.println("User now enters the user credentials, username & password");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName")).sendKeys("abdul518@gmail.com");
        driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password")).sendKeys("nopcommerce");
        driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_LoginButton")).click();
        Thread.sleep(6000);
    }
    @And("User logout successfully")
    public void userLogoutSuccessfully()
    {
        System.out.println("The user should logout now");
        driver.findElement(By.className("ico-logout")).click();
    }


    @And("User Close Browser")
    public void userCloseBrowser()
    {

        System.out.println("User now closes the Browser once confirmed.");


    }



}
