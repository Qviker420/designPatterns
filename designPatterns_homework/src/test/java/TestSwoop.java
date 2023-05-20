import SwoopPageFactory.Pages.MainPage;
import SwoopPageFactory.Pages.chooseCinemaAndDatePage;
import SwoopPageFactory.Pages.chooseSeatPopUp;
import SwoopPageFactory.Pages.moviePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSwoop {
    WebDriver driver;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().
                timeouts().
                implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void test()
    {
        MainPage mainPage = new MainPage(driver);

        mainPage.movieButton
                .click();

        moviePage MoviePage = new moviePage(driver);

        MoviePage
                .moveToFirstMovie()
                .clickOnBuyFirstMovie();

        chooseCinemaAndDatePage nameAndDatePick = new chooseCinemaAndDatePage(driver);

        nameAndDatePick
                .getMovieName()
                .scroolBy()
                .chooseCinema()
                .checkCinemaName()
                .getCinemaInfo()
                .chooseLastOption()
                .validate();

        chooseSeatPopUp popUp = new chooseSeatPopUp(driver);
        popUp.chooseVacantPlace();
    }
    @AfterTest
    public void endTest()
    {
        driver.quit();
    }
}
