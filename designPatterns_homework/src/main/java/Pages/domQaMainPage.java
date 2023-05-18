package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class domQaMainPage {
    public SelenideElement formsButton = $(By.xpath("//*[text()='Forms']"));
}
