package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features = "C://Users//Qadeeer//IdeaProjects//CucumberBasics//src//test//java//Features//OrangeHRM.feature",
                glue = "Steps")
public class TestRunner {

}
