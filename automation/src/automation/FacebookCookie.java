package automation;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FacebookCookie {
    @Test
    public void testcookie() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");

        Set<Cookie> allcookies = driver.manage().getCookies();
        System.out.println("The size of the cookies is  " + allcookies.size());

        for (Cookie cookie : allcookies) {
            System.out.println("Name is....." + cookie.getName());
            System.out.println("Domain is....." + cookie.getDomain());
            System.out.println("Value is....." + cookie.getValue());
            System.out.println("Path is....." + cookie.getPath());
            System.out.println("Expiry date is....." + cookie.getExpiry());
            System.out.println("Class of cookie is....." + cookie.getClass());
            System.out.println("_______________________________________________________");

        }

        driver.manage().deleteAllCookies();
        Set<Cookie> afterDeletion= driver.manage().getCookies();
        System.out.println("The size of cookie after deletion is "+afterDeletion.size());

    }
}
