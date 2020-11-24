package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class SearchSteps {
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();

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
}
