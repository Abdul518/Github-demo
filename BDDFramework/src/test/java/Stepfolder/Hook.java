package Stepfolder;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }



    @Before
    public void initializeTest()
    {
             System.out.println("Opening the Browser,  Its a test");

        //passing a dummy Webdriver instance to run the browser or open the webpage
        base.StepInfo= "ChromeDriver";
    }
@After
    public void TearDownTest(Scenario scenario)
    {
    /*    if(scenario.isFailed()) {
            //Take the screenshot
            System.out.println(scenario.getName());
        }*/
        System.out.println("Closing the browser ");

    }
}

