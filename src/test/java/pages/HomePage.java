package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage extends Common{


    public void logIn(){
        $(By.className("user-block__title--strong")).click();
    }

    public void enterSearch(String product){
        sleep(1000);
        $(By.id("q")).sendKeys(product);
    }
    public void searchButton(){
        $(By.className("main-search__submit")).submit();
    }


}
