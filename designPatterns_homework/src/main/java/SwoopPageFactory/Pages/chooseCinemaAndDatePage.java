package SwoopPageFactory.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class chooseCinemaAndDatePage {
    private WebDriver driver;

    String cinemaName;
    String movieName;
    @FindBy(how = How.LINK_TEXT, using = "კავეა ისთ ფოინთი")
    public WebElement cinemaNameButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]/a")
    public WebElement cinemaInfo;
    @FindBy(how = How.XPATH, using = "//div[@class='movie_first_section']//p[@class='name']")
    public WebElement movieNameElement;


    public chooseCinemaAndDatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step
    public chooseCinemaAndDatePage getMovieName() {
        movieName = movieNameElement.getText();
        return this;
    }

    @Step("This step is Scrolling")
    public chooseCinemaAndDatePage scroolBy() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        return this;
    }

    @Step
    public chooseCinemaAndDatePage chooseCinema() {
        cinemaNameButton.click();
        return this;
    }

    @Step
    public chooseCinemaAndDatePage checkCinemaName() {
        Assert.assertEquals("კავეა ისთ ფოინთი", cinemaInfo.findElement(By.cssSelector("p.cinema-title")).getText());
        return this;
    }

    @Step
    public chooseCinemaAndDatePage getCinemaInfo() {
        cinemaName = cinemaInfo.findElement(By.cssSelector("p.cinema-title")).getText();
        return this;
    }

    @Step
    public chooseCinemaAndDatePage chooseLastOption() {
        cinemaInfo.click();
        return this;
    }

    @Step
    public chooseCinemaAndDatePage validate() {
        Assert.assertEquals(movieName, movieNameElement.getText());
        return this;
    }
}
