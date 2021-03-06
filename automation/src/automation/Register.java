package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Register {


    public static void main(String[] args) {
        String Firstname = "Raj";
        String Lastname = "Mohan";
        String day = "10";
        String month = "June";
        String year = "2001";
        String email = "Ramesh2@yahoo.com";
        String company = "Ramesh Inds";
        String password = "Ramesh123";
       // String confPass = "Ramesh123";
        //Open the Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver_win32\\chromedriver.exe");
        //Enter the URL

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //Click the Register Button
        driver.findElement(By.className("ico-register")).click();
        //Select Gender
        driver.findElement(By.id("gender-male")).click();
        //Enter the first name

        driver.findElement(By.id("FirstName")).sendKeys(Firstname);
        //Enter the surname
        driver.findElement(By.id("LastName")).sendKeys(Lastname);
        //select D.o.b
        new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"))).selectByVisibleText(day);
        new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"))).selectByVisibleText(month);
        new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"))).selectByVisibleText(year);
        //Enter email address
        driver.findElement(By.id("Email")).sendKeys(email);
        //Enter Company name
        driver.findElement(By.id("Company")).sendKeys(company);
        //Unselect newsletter
        driver.findElement(By.id("Newsletter")).click();
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys(password);
        //Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        //Click Register Button
        driver.findElement(By.id("register-button")).click();
        //Get confirmation status
        String conf = driver.findElement(By.className("result")).getText();
        System.out.println(conf);
        driver.quit();

    }

}
