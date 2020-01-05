package automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm_test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        //  System.out.println(driver.findElement(By.tagName("tittle")).getText());

        Thread.sleep(5000);


        driver.navigate().refresh();
        //driver.navigate().to(driver.getCurrentUrl());
        //driver.findElement(By.id("xyz")).sendKeys(Keys.F11);

        driver.navigate().forward();





        driver.quit();  // close all windows

        //driver.close(); // close current windows

    }
}



