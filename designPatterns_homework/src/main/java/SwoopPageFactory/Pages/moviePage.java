package SwoopPageFactory.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class moviePage {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//div[@class = 'container cinema_container']//div[1]")
    public WebElement firstMovieCard;
    @FindBy(xpath = "(//p[contains(text(),'ყიდვა')])")
    public WebElement buyButton;

    public moviePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step
    public moviePage moveToFirstMovie() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstMovieCard).perform();
        return this;
    }

    @Step
    public moviePage clickOnBuyFirstMovie() {
        buyButton.click();
        return this;
    }
}
