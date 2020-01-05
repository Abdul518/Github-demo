package automation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.xml.sax.Locator;

import java.sql.Driver;

public class ExpediasSearch
{
WebDriver driver;

    @Before
    public void openBrowser()
    {
        //open the browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Abduls\\Documents\\jar libraries\\chromedriver_win32\\chromedriver.exe");
        //Enter the URL
        //  WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://www.expedia.co.uk/");

        //maximise the window
        driver.manage().window().maximize();
    }

    @Test
    public void flightCheck()
    {

        //Click the Button Flights
        driver.findElement(By.id("primary-header-flight")).click();
        //click the button Flying From
        driver.findElement(By.xpath("//input[@id='flight-origin-flp']")).click();
        //Type the Airport name
        driver.findElement(By.xpath("//input[@id='flight-origin-flp']")).sendKeys("LON");
        //Click the Flying to Button
        driver.findElement(By.xpath("//input[@id='flight-destination-flp']")).click();
        //Type/enter the Airport name & Press Enter
        driver.findElement(By.xpath("//input[@id='flight-destination-flp']")).sendKeys("HYD");
        driver.findElement(By.xpath("//input[@id='flight-departing-flp']")).sendKeys("29/02/2020");

        //Click Departing date button
      //  driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).click();
        //driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).clear();

   // @Test
    //public void returnDate() {
    driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.xpath("//input[@id='flight-returning-flp']")).sendKeys(Keys.BACK_SPACE);

    //Enter the date of departure in dd/mm/yyyy format
    //Click returning date button
    //driver.findElement(By.id("flight-returning-flp")).sendKeys(Keys.BACK_SPACE);
    //if you want to delete a character then you should use \u0008 which will delete the last character.

    //Enter the date of return in dd/mm/yyyy format

    driver.findElement(By.id("flight-returning-flp")).sendKeys("29/03/2020");

    //Click the no of travellers button
    driver.findElement(By.xpath("//div[@id='traveler-selector-flp']//div[@class='menu-bar gcw-travel-selector-wrapper']")).click();


     //Click no of Adults button;
     //driver.findElement(By.xpath("//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']//input[@class='uitk-step-input-input gcw-storeable gcw-traveler-selector-num-adults']")).click();
     //driver.findElement(By.xpath("//div[@class='traveler-selector-sinlge-room-data traveler-selector-room-data']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")).click();
     //Actions actions = new Actions(driver);
     //WebElement element Locator = driver.findElement(By.xpath(""))
     driver.findElement(By.xpath("//div[@class='cols-nested ab25184-submit']//button[@class='btn-primary btn-action gcw-submit']")).click();
     //driver.findElement(By.xpath("//li[@id='flight-module-2019-10-29t09:30:00-00:00-coach-lhr-bah-gf-2-coach-bah-hyd-gf-274_2019-11-29t10:25:00+05:30-coach-hyd-bah-gf-275-coach-bah-lhr-gf-7_']//button[@class='btn-secondary btn-action t-select-btn']")).click();
     //driver.findElement(By.xpath("//li[@id='flight-module-2019-10-29t09:30:00-00:00-coach-lhr-bah-gf-2-coach-bah-hyd-gf-274_2019-11-29t10:25:00+05:30-coach-hyd-bah-gf-275-coach-bah-lhr-gf-3_']//div[contains(@class,'grid-container standard-padding')]")).click();
     //click no of children button
     //click child age dropdown button
     //click close button
     //click the search button
     //quit/close the windows
//        driver.close();



    }

    @After
    public void tearDown(){
        String ActualRes = "Select your departure to Hyderabad";
        String ExpRes = driver.findElement(By.xpath("//*[@id=\"titleBar\"]/h1/div/span[1]")).getText();
        Assert.assertEquals(ActualRes,ExpRes);
        System.out.println(ExpRes);
    driver.quit();
    }

}

