package page;

import org.openqa.jetty.html.Input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageelement.Button;
import pageelement.InputField;


public class WelcomePage extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBoxWebElement;


    @FindBy(xpath = ".//input[@type = 'submit']")
    private WebElement searchButtonWebElement;


    private InputField searchBox;
    private Button searchButton;

    public WelcomePage() {
        super();
        searchBox = new InputField(searchBoxWebElement);
        searchButton = new Button(searchButtonWebElement);
    }

    public InputField getSearchBox() {
        return searchBox;
    }

    public Button getSearchButton() {
        return searchButton;
    }
}
