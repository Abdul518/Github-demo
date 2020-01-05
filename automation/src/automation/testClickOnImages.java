package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testClickOnImages
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //If you need to run this program in the background or headless program than we need to initialise an objecta as below.
        // ChromeOptions ChromeOptions = new ChromeOptions();
       // ChromeOptions.setHeadless(true);
        //WebDriver driver = new ChromeDriver(ChromeOptions);

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
        Thread.sleep(5000);
        System.out.println("Title of the page is "+driver.getTitle());
        System.out.println(" Name of current URL is " +driver.getCurrentUrl());
        System.out.println("Name of the driver is"+driver.navigate());
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Bismillah");
        driver.findElement(By.className("Tg7LZd")).click();
       //String txt = driver.findElement(By.xpath("//img[@id='X4oEtE54c6Bn5M:']")).get(0).getText();
        //boolean txtnm= txt.contains("allah");
       // Assert.assertTrue(txtnm);
        //String ActualTitle = driver.getTitle();

        //String ExpectedTitle = "Google Images";

        //Thread.sleep(5000);
        driver.quit();
    }




}







