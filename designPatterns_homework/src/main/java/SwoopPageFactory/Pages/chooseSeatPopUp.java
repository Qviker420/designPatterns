package SwoopPageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class chooseSeatPopUp {
    WebDriver driver;

    @FindBys({
            @FindBy(xpath = "//body//section//div//div//form"),
            @FindBy(className = "seat-new-part")
    })
    WebElement freeSeat;
    public chooseSeatPopUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public chooseSeatPopUp chooseVacantPlace()
    {
        freeSeat.click();
        return this;
    }
}
