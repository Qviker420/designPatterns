import SwoopPageFactory.Pages.MainPage;
import SwoopPageFactory.Pages.chooseCinemaAndDatePage;
import SwoopPageFactory.Pages.chooseSeatPopUp;
import SwoopPageFactory.Pages.moviePage;
import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

@Epic("This is Swoop Mini Test")
@Feature("In this test is automated buying movie and choosing seat")
public class TestSwoop {
    WebDriver driver;
    @BeforeSuite
    void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "87.0.4280.88")
                        .put("URL", "http://eliasnogueira.com")
                        .build());
    }

    @Story("Its just setup")
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().
                timeouts().
                implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(description = "Main POM test Swoop")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Choose first movie last date and free seat in cavea east point")
    @Story("Booking Tickets on Swoop.ge")
    public void test() {
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
    public void endTest() {
        driver.quit();
    }
}
