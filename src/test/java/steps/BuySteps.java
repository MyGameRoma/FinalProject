package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BuyingPage;
import pages.CartPage;
import pages.ProductPage;

public class BuySteps {
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    BuyingPage buyingPage = new BuyingPage();

    @Then("I go to cart")
    public void iGoToCart() {
        productPage.goToCart();
    }

    @And("I compare product name")
    public void iCompareProductName() {
        cartPage.validateCartProductName();
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

    @And("I choose pay with cash")
    public void iChoosePayWithCash() {
        buyingPage.chooseWithCash();
    }

    @And("I compare product price")
    public void iCompareProductPrice() {
        buyingPage.comparePrice();
    }


}
