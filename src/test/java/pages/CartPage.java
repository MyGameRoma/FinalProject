package pages;

import models.ProductData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends Common{
    ProductData productData = new ProductData();

    public void validateCartProductName(){
        String cartProductName = $(By.className("detailed-cart-item__name")).getText();
        validate(cartProductName, productData.getProductName());

    }
    public void nextButton(){
        $(By.xpath("//input[@class='main-button cart-main-button cart-main-button--large']")).submit();
    }


}
