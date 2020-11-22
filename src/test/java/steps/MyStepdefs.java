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

public class MyStepdefs extends Common {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    ProductData productData = new ProductData();
    CartPage cartPage = new CartPage();
    BuyingPage buyingPage = new BuyingPage();

    SoftAssertions softly = new SoftAssertions();

    @Given("Open Chrome browser")
    public void openChromeBrowser() {
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
    }

    @When("^I open (.*)$")
    public void iOpenOneA(String url) {
        open(url);
    }

    @And("I login to my profile")
    public void iLoginToMyProfile() {
        homePage.logIn();
        loginPage.enterLogin();
        loginPage.enterPassword();
        loginPage.getIn();
    }

    @Then("^I enter (.*) in search line$")
    public void iEnterInSearchLine(String product) {
    homePage.enterSearch(product);
    }

    @And("I press search button")
    public void iPressSearchButton() {
        homePage.searchButton();
    }

    @And("I choose first product")
    public void iChooseFirstProduct() {
        searchPage.selectProduct();
    }

    @And("I remember product price")
    public void iRememberProductPrice() {
        productPage.rememberPrice();
    }

    @And("I remember product name")
    public void iRememberProductName() {
        productPage.rememberProductName();
    }

    @And("I press put in cart button")
    public void iPressPutInCartButton() {
        productPage.addToCart();
    }

    @And("I go to cart")
    public void iGoToCart() {
        productPage.goToCart();
    }

    @And("I compare product name")
    public void iCompareProductName() {
        cartPage.validateCartName();
    }

    @And("I press next button")
    public void iPressNextButton() {
        cartPage.nextButton();
    }

    @And("I choose get product in shop center")
    public void iChooseGetProductInShopCenter() {
        buyingPage.getInShopOffice();
    }

    @And("I choose any shop")
    public void iChooseAnyShop() {
        buyingPage.chooseShop();
    }

    @And("I press last time next button")
    public void iPressLastTimeNextButton() {
        buyingPage.goToPay();
    }
    @And("I compare product price")
    public void iCompareProductPrice() {
        buyingPage.comparePrice();
    }
    @And("I choose pay with cash")
    public void iChoosePayWithCash() {
        buyingPage.chooseWithCash();
    }

    @And("I close browser")
    public void iCloseBrowser() {
        sleep(10000);
        closeWebDriver();
    }



}
