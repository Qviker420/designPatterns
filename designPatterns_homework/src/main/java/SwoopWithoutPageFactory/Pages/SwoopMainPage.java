package SwoopWithoutPageFactory.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SwoopMainPage {
    public SelenideElement movieButton = $(By.linkText("კინო"));
}
