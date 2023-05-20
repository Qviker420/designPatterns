package SwoopWithoutPageFactory.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class SwoopMoviePage {
    public SelenideElement
            firstMovie = $(By.xpath("//div[@class = 'container cinema_container']//div[1]")),
            firstMovieBuyButton = $(By.xpath("//p[contains(text(),'ყიდვა')]"));

}
