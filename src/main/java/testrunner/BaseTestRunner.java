package testrunner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import driver.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestRunner extends AbstractTestNGCucumberTests {

    @BeforeTest
    protected void startDriver() {
        Driver.startDriver();
    }

    @AfterTest
    public void stopDriver() {
        Driver.getDriver().close();
    }
}
