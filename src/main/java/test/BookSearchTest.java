package test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;
import page.WelcomePage;

public class BookSearchTest {

    private WelcomePage welcomePage;

    @Given("^I am on the Amazon homepage$")
    public void goToAmazonWelcomePage() {
        welcomePage = new WelcomePage();
    }

    @When("^I enter \"([^\"]*)\" in search field$")
    public void enterSearchText(String searchText) {
        welcomePage.getSearchBox().enterText(searchText);
    }

    @And("^I click search button$")
    public void clickSearchButton() {
        welcomePage.getSearchButton().click();
    }
}
