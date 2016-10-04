package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/main/resources/features/",
        glue = "test",
        format = {"pretty"})
public class BookSearchTestRunner extends BaseTestRunner {

}
