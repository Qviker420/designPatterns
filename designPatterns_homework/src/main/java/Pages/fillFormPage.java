package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class fillFormPage {
    public SelenideElement
            userName = $("#firstName"),
            lastName = $("#lastName"),
            eMail = $("#userEmail"),
            uNumber = $("#userNumber"),
            genderMale = $(By.xpath("//label[text()='Male']")),
            genderFemale = $(By.xpath("//label[text()='Female']")),
            genderOther = $(By.xpath("//label[text()='Other']")),
            submitButton = $(By.xpath("//button[text() = 'Submit']")),
            afterSubmittedText = $(By.xpath("//*[@class = 'modal-title h4']"));
    public List<SelenideElement> userInfo = $$(By.xpath("//tbody//tr//td"));



}
