package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginclass {
    public static void main(String[] args) {
        //open the Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        // Enter the URL
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //Maximise the Window
        driver.manage().window().maximize();
        // Click Login Button
        driver.findElement(By.className("ico-login")).click();
        // Enter Username
        driver.findElement(By.id("Email")).sendKeys("test@azhar.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("London123");
        // Click Submit Button
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();
        // Get confirmation
        String conf = driver.findElement(By.className("ico-account")).getText();
        System.out.println(conf);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.quit();    }
}
