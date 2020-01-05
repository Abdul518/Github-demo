package automation;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Set;

public class Amazon
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        Set <Cookie> cookies=driver.manage().getCookies();// capture all the cookies from the browser
        System.out.println("Size of the cookies "+cookies.size());// print size of the cookies
//    for (Cookie cookie:cookies)//read & write all the cookies
//        {
//            System.out.println(cookie.getName()+ " :  "+cookie.getValue());//print name & value of the cookies
//        }

        //System.out.println(driver.manage().getCookieNamed("mdr_browser"));// print specific cookie according to the name
        //capture allthe cookies
        // get the size of the cookies
        //print cookies names and there values
        //print cookie base on name
        //add cookie to the browser
        //delete specific cookie
        //delete all the cookies

    Cookie cobj = new Cookie("Mycookee","2019");
        driver.manage().addCookie(cobj);// add new cookie to the browser
        driver.manage().getCookies();
        cookies=driver.manage().getCookies();

        System.out.println("Size of the cookies "+cookies.size());// print size of the cookies to verify again
        // to check the cookie added repeat the for loop as above to print & verify
        for (Cookie cookie:cookies)//read & write all the cookies
        {
            System.out.println(cookie.getName()+ " :  "+cookie.getValue());//print name & value of the cookies
        }


        //Delete the cookie
        driver.manage().deleteCookie(cobj);


        driver.manage().getCookies();
        cookies=driver.manage().getCookies();

        System.out.println("Size of the cookies "+cookies.size());// print size of the cookies to verify again
        // to check the cookie added repeat the for loop as above to print & verify
        for (Cookie cookie:cookies)//read & write all the cookies
        {
            System.out.println(cookie.getName()+ " :  "+cookie.getValue());//print name & value of the cookies
        }


        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();

        System.out.println("Size of the Cookies : " +cookies.size());

        driver.quit();

    }












}
