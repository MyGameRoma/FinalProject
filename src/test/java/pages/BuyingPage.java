package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import models.ProductData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BuyingPage extends Common {

    ProductData productData = new ProductData();

    public void getInShopOffice() {
        SelenideElement radioButtonsBlock = $(By.className("menu"));
        ElementsCollection elements = radioButtonsBlock.$$(By.className("for-radio"));
        SelenideElement element = elements.get(1);
        SelenideElement radioButton = element.$(By.name("shipping_unused"));
        radioButton.setSelected(true);
    }

    public void chooseShop() {
        ElementsCollection elements = $$(By.name("pickup_point_id"));
        SelenideElement element = elements.get(1);
        element.setSelected(true);
    }

    public void goToPay() {
        $(By.xpath("//button[@class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']")).scrollTo().click();
    }

    public void comparePrice() {

        String lastPrice = $(By.xpath("//div[@class='price fr']")).getText();
        validate(lastPrice, productData.getPrice());
    }

    public void chooseWithCash() {
        SelenideElement element = $(By.id("payment_unused_22"));
        element.setSelected(true);
    }


}
