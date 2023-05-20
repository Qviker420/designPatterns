package SwoopWithoutPageFactory.Steps;

import SwoopWithoutPageFactory.Pages.SwoopMovieInfoPage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SwoopMovieInfoPageStep {
    SwoopMovieInfoPage movieInfoPage = new SwoopMovieInfoPage();
    public String movieName;

    public SwoopMovieInfoPageStep getMovieName()
    {
        movieName = movieInfoPage.movieNameElement.getText();
        return this;
    }
    public SwoopMovieInfoPageStep scrollDown()
    {
        movieInfoPage.cinemaInfo.scrollTo();
        return this;
    }
    public SwoopMovieInfoPageStep chooseCinema()
    {
        movieInfoPage.cinemaNameButton.click();
        return this;
    }
    public SwoopMovieInfoPageStep validateChosenCinema()
    {
        Assert.assertEquals("კავეა ისთ ფოინთი", movieInfoPage.cinemaInfo.findElement(By.cssSelector("p.cinema-title")).getText());
        return this;
    }
    public SwoopMovieInfoPageStep chooseLastDate()
    {
        movieInfoPage.cinemaInfo.click();
        return this;
    }
}
