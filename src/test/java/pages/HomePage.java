package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends Common{


    public void logIn(){
        $(By.className("user-block__title--strong")).click();
    }

    public void enterSearch(String product){
        $(By.id("q")).sendKeys(product);
    }
    public void searchButton(){
        $(By.className("main-search__submit")).submit();
    }
    public void compareTitle(String title){
        String getTitle = Selenide.title();
        validate(getTitle, title);
    }


}
