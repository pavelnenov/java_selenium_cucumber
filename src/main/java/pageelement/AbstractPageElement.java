package pageelement;

import org.openqa.selenium.WebElement;

public class AbstractPageElement {

    private WebElement element;

    public AbstractPageElement(WebElement we) {
        element = we;
    }

    public WebElement getElement() {
        return element;
    }



}
