package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class SearchPage extends Common{

    public void selectProduct(){
        sleep(500);
        $(By.className("new-product-name")).hover();
        sleep(300);
        $(By.className("new-product-name")).scrollTo().click();
    }
}
