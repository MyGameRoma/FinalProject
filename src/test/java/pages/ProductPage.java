package pages;


import com.codeborne.selenide.SelenideElement;
import models.ProductData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends Common{
    ProductData productData = new ProductData();

    public void rememberPrice(){
        String price = $(By.className("price")).getText();
        productData.setPrice(price);
    }

    public void rememberProductName(){
        SelenideElement productNameElement = $(By.className("product-righter"));
        String productName = productNameElement.$(byCssSelector("h1")).getText();

        productData.setProductName(productName);
    }
    public void addToCart(){
        $(By.xpath("//button[@id='add_to_cart_btn']")).submit();
    }
    public void goToCart(){
        SelenideElement popup = $(By.id("cart-popup-container"));
        popup.$(By.className("main-button")).click();
    }

}
