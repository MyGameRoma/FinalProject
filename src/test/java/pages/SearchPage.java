package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage extends Common{

    public void selectProduct(){
        $(By.xpath("//div[@class='sn-docs js-product-container product-grid-row']")).scrollIntoView(true);
        $(By.className("new-product-name")).hover();
        $(By.className("new-product-name")).click();
    }
}
