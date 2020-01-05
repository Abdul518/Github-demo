package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class argostest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();

//      To know the size of the cookies & print the size by storing its value into a variable
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of the Cookies is " + cookies.size());
        cookies = driver.manage().getCookies();

//      To Delete all the cookies & print the size of the cookies using the variable
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Size of the cookie is " + cookies.size());

//      Click the search button
        driver.findElement(By.id("searchTerm")).click();
//      pass the keyword printer to search the printers
        driver.findElement(By.id("searchTerm")).sendKeys("Printer");
//      Select the First Printer or click the first printer.
        driver.findElement(By.xpath("//span[@class='_1gqeQ']")).click();
//      Select the printer & add it to the basket
        driver.findElement(By.xpath("//body/div[@id='app']/div[@class='app app--search-lister']/div[@id='findability']/div/div[@class='bolt-v2 search']/div[contains(@class,'xs-row xs-auto--negative search__content')]/div[@class='xs-12--none lg-9 xs-stack search__container']/div[@class='xs-stack sm-row xs-auto--none sm-auto--none md-auto--none lg-auto--negative product-list']/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]")).click();
        // driver.findElement(By.xpath("//button[@class='Drawerstyles__CloseButton-mvyw7g-3 cVdNXB']//*[contains(@class,'ac-icon ac-icon__cancel')]")).click();
        //  driver.findElement(By.xpath("//*[@class='ac-icon ac-icon__trolley UwMfe']")).click();
        //driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//button[@id='basket-FulfilmentSelectorForm-collectButton']")).click();
        // driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']")).sendKeys("da11dy");
        driver.quit();

        //driver.findElement(By.cssSelector("#basket-FulfilmentSelectorForm")).click();
        // driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']")).click();

        //  driver.findElement(By.id("basket-FulfilmentSelectorForm")).click();
        //driver.findElement(By.id("basket-FulfilmentSelectorForm")).sendKeys("DA1 1DY");
    }


}
