package SwoopWithoutPageFactory.Steps;

import SwoopWithoutPageFactory.Pages.SwoopMainPage;

public class SwoopMainPageStep {
    SwoopMainPage mainPage = new SwoopMainPage();

    public SwoopMainPageStep enterMoviesSection()
    {
        mainPage.movieButton.click();
        return this;
    }
}
