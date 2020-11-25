package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchPage extends Common {

    public void selectProduct() {
        $(By.xpath("//div[@class='sn-docs js-product-container product-grid-row']")).scrollIntoView(true);
        sleep(500);
        $(By.className("new-product-name")).hover();
        $(By.className("new-product-name")).click();
    }
}
