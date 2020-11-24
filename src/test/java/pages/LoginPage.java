package pages;

import models.UserData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    UserData data = new UserData();

    public void enterLogin() {
        $(By.id("user_email")).sendKeys(data.getUserName());
    }

    public void enterPassword() {
        $(By.id("user_password")).sendKeys(data.getPassword());
    }

    public void getIn() {
        $(By.className("users-session-form__submit")).submit();
    }

}
