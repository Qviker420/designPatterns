package SwoopWithoutPageFactory.Steps;

import SwoopWithoutPageFactory.Pages.SwoopMainPage;
import SwoopWithoutPageFactory.Pages.SwoopMoviePage;

public class SwoopMoviePageStep {
    SwoopMoviePage swoopMoviePage = new SwoopMoviePage();

    public SwoopMoviePageStep moveToFirstMovieElement()
    {
        swoopMoviePage.firstMovie.hover();
        return this;
    }
    public SwoopMoviePageStep clickToBuyFirstMovie()
    {
        swoopMoviePage.firstMovieBuyButton.click();
        return this;
    }

}
