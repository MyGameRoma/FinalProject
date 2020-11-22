package pages;

import com.codeborne.selenide.SelenideElement;
import models.ProductData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CartPage extends Common{
    ProductData productData = new ProductData();

    public void validateCartName(){
        String cartName = $(By.className("detailed-cart-item__name-link")).getText();
        validate(cartName, productData.getProductName());

    }
    public void nextButton(){
        sleep(1500);
        $(By.xpath("//input[@class='main-button cart-main-button cart-main-button--large']")).submit();
    }


}
