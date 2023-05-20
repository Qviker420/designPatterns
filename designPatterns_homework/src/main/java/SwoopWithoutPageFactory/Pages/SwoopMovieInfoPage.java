package SwoopWithoutPageFactory.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SwoopMovieInfoPage {
    public SelenideElement
        cinemaNameButton = $(By.linkText("კავეა ისთ ფოინთი")),
        movieNameElement = $(By.xpath("//div[@class='movie_first_section']//p[@class='name']")),
        cinemaInfo = $(By.xpath("//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a"));
}
