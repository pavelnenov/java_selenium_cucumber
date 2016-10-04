package pageelement;

import org.openqa.selenium.WebElement;

public class Button extends AbstractPageElement {
    public Button(WebElement we) {
        super(we);
    }

    public void click() {
        getElement().click();
    }
}
