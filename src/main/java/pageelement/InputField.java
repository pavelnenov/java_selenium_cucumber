package pageelement;

import org.openqa.selenium.WebElement;

public class InputField extends AbstractPageElement {

    private WebElement element;

    public InputField(WebElement we) {
        super(we);
    }

    public void enterText(String txt) {
        getElement().sendKeys(txt);
    }
}
