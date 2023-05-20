package SwoopWithoutPageFactory.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SwoopSeatsPopUpPage {
    public SelenideElement
        avalaibleSeatButton = $$("seat free").get(2),
        movieHeaderName = $("p.movie-title"),
        movieHeaderCinemaName = $("p.movie-cinema");

}
