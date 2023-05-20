import SwoopWithoutPageFactory.Steps.SwoopMainPageStep;
import SwoopWithoutPageFactory.Steps.SwoopMovieInfoPageStep;
import SwoopWithoutPageFactory.Steps.SwoopMoviePageStep;
import SwoopWithoutPageFactory.Steps.SwoopSeatsPopUpStep;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SwoopTestNoPageFactory {
    SwoopMainPageStep mainPageStep = new SwoopMainPageStep();
    SwoopMoviePageStep moviePageStep = new SwoopMoviePageStep();
    SwoopMovieInfoPageStep movieInfoStep = new SwoopMovieInfoPageStep();
    SwoopSeatsPopUpStep popUpStep = new SwoopSeatsPopUpStep();

    @BeforeTest
    public void beforeTest()
    {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void test()
    {
        open("https://swoop.ge");
        mainPageStep.enterMoviesSection();
        moviePageStep.
                moveToFirstMovieElement().
                clickToBuyFirstMovie();

        movieInfoStep.
                getMovieName()
                .chooseCinema()
                .scrollDown()
                .validateChosenCinema()
                .chooseLastDate();

        popUpStep
                .chooseSeat();
    }
}
