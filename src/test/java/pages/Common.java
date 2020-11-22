package pages;

import com.codeborne.selenide.Configuration;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Common {
    public static WebDriver driver;
    SoftAssertions softly = new SoftAssertions();

    public void validate(String that, String equalTo){
        softly.assertThat(that).isEqualTo(equalTo);
    }

    @Before
    public void beforeTest(){
        Configuration.startMaximized = true;
        open("https://www.1a.lv/");

    }
    @After
    public void afterTest(){
        closeWebDriver();
    }





}