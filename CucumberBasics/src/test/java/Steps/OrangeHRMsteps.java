package Steps;

import cucumber.api.java.en.*;
import net.bytebuddy.implementation.bind.annotation.DefaultCall;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class OrangeHRMsteps
{
    WebDriver driver;

    @Given("^I launch chrome browser$")
    public void i_launch_chrome_browser()
    {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
    driver=new ChromeDriver();

    }

    @When("^I open the hrm homepage$")
    public void i_open_the_hrm_homepage()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

    }

    @Then("^I verify that the logo present on page$")
    public void i_verify_that_the_logo_present_on_page()
    {
        boolean status =driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("^I close browser$")
    public void i_close_browser() throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();

    }


}
