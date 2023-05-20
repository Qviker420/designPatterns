package SwoopPageFactory.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;
    private static String PAGE_URL="https://www.swoop.ge";

    @FindBy(how = How.LINK_TEXT, using = "კინო")
    public WebElement movieButton;

    public MainPage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage clickOnMovieButton()
    {
        movieButton.click();
        return this;
    }

}
