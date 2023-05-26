package SwoopPageFactory.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

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

    @Step
    public chooseSeatPopUp chooseVacantPlace() {
        freeSeat.click();
        return this;
    }
}
