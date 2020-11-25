package steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ProductData;
import org.assertj.core.api.SoftAssertions;
import pages.*;

import static com.codeborne.selenide.Selenide.*;

public class LoginSteps extends Common {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("Open Chrome browser")
    public void openChromeBrowser() {
        Configuration.startMaximized = true;
    }


    @When("^I open (.*)$")
    public void iOpenOneA(String url) {
        open(url);
    }


    @Then("^I compare title is he (.*)$")
    public void iCompareTitleIsHe(String title) {
        homePage.compareTitle(title);
    }


    @And("I login to my profile")
    public void iLoginToMyProfile() {
        homePage.logIn();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.getIn();
    }

    @And("I close browser")
    public void iCloseBrowser() {
        sleep(10000);
        closeWebDriver();
    }
}
