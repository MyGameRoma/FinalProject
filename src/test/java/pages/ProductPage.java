package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import models.ProductData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ProductPage extends Common{
    ProductData productData = new ProductData();

    public void rememberPrice(){
        sleep(1000);
        String price = $(By.className("price")).getText();
        productData.setPrice(price);
    }

    public void rememberProductName(){
        sleep(1000);
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
