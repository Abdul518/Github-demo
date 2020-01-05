package Stepfolder;


import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArgostestSteps {
WebDriver driver;


    @Given("Client type the url and hit the enter button")
    public void clientTypeTheUrlAndHitTheEnterButton() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='searchTerm']")).click();
        driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("Printers");
        driver.findElement(By.xpath("//span[@class='_1gqeQ']")).click();
      driver.findElement(By.xpath("//label[contains(text(),'Samsung')]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//div[@class='xs-12--none lg-9 xs-stack search__container']//div[2]//div[1]//a[1]//div[1]//div[2]//picture[1]//img[1]")).click();
      Thread.sleep(5000);

      driver.findElement(By.xpath("//input[@placeholder='Postcode or town']")).sendKeys("da11dy");
      /*driver.findElement(By.xpath("//div[@class='xs-8--none']//button[@class='Buttonstyles__Button-q93iwm-2 klBGXd']")).click();
        //  driver.findElement(By.xpath("//button[@class='button button--secondary button--quarter']")).click();d
    driver.findElement(By.linkText("//span[contains(text(),'Continue with delivery')]")).click();
    driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//input[@id='basket-FulfilmentSelectorForm']")).sendKeys("da11dy");
    driver.findElement(By.xpath("//div[@class='xs-hidden sm-hidden md-block lg-block Basket__maxHeight__DpQL8']//button[@id='basket-FulfilmentSelectorForm-deliverButton']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Continue with delivery')]")).click();
*/
    }



   @When("Client click the search button")
    public void clientClickTheSearchButton() {

       System.out.println("clientClickTheSearchButton()");
   }

    @Then("Client type printer in search button & click")
    public void clientTypePrinterInSearchButtonClick() {
        System.out.println("clientTypePrinterInSearchButtonClick() ");

    }

    @And("Client close the browser")
    public void clientCloseTheBrowser() {
        System.out.println("clientCloseTheBrowser()");
    }
}
