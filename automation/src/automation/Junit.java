package automation;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
    @Test
    public void test1()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchTerm")).click();
        driver.findElement(By.id("searchTerm")).sendKeys("Printer");
        driver.findElement(By.xpath("//span[@class='_1gqeQ']")).click();

        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='bolt-v2 search']/div[contains(@class,'xs-row xs-auto--negative search__content')]/div[@class='xs-12--none lg-9 xs-stack search__container']/div[@class='xs-stack sm-row xs-auto--none sm-auto--none md-auto--none lg-auto--negative product-list']/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")).click();
        driver.findElement(By.xpath("//button[@class='Drawerstyles__CloseButton-mvyw7g-3 cVdNXB']//*[contains(@class,'ac-icon ac-icon__cancel')]")).click();
        driver.findElement(By.xpath("//*[@class='ac-icon ac-icon__trolley UwMfe']")).click();
        driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//button[@id='basket-FulfilmentSelectorForm-collectButton']")).click();
        driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']")).sendKeys("da11dy");

    }

    @Test

    public void test2()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abduls\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //If you need to run this program in the background or headless program than we need to initialise an objecta as below.
        // ChromeOptions ChromeOptions = new ChromeOptions();
        // ChromeOptions.setHeadless(true);
        //WebDriver driver = new ChromeDriver(ChromeOptions);

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
        //Thread.sleep(5000);
        System.out.println("Title of the page is "+driver.getTitle());
        System.out.println(" Name of current URL is " +driver.getCurrentUrl());
        System.out.println("Name of "+driver.navigate());
        driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Bismillah");
        driver.findElement(By.className("Tg7LZd")).click();
        //String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Google Images";

        //Thread.sleep(5000);
        driver.quit();
    }
}
