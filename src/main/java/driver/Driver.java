package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static String webSiteURL = "http://wwww.amazon.com";

    private static RemoteWebDriver driver = null;
    private static long implicitWaitTime = 15;

    public static void startDriver() {

        if (driver == null) {

            //sipmle driver creation. Better practice - use desired capabilities (snippet commented out below)
            driver = new ChromeDriver();
            driver.get(webSiteURL);

            //                DesiredCapabilities capabilities = new DesiredCapabilities();
            //                capabilities.setBrowserName("crome");
            //init driver
            //                driver = new RemoteWebDriver(new URL("http://wwww.amazon.com"), capabilities);
            driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
        }
    }

    public static RemoteWebDriver getDriver() {
        return driver;
    }

}
