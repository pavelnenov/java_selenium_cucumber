package page;

import driver.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {

    public PageObject() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
