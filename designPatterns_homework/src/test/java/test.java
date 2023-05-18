import Steps.FormsPageStep;
import Steps.domQaMainPageStep;
import Steps.fillFormStep;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class test {
    domQaMainPageStep mainPageStep = new domQaMainPageStep();
    FormsPageStep formsPageStep = new FormsPageStep();
    fillFormStep fillForm = new fillFormStep();
    @BeforeTest
    public void beforeTest()
    {
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void fullTest()
    {
        open("https://demoqa.com/");
        mainPageStep.enterFormsPage();
        formsPageStep.enterPracticeForm();
        fillForm.setUserName().setUserLastName().setUserEmail().setUserPhoneNumber().setUserGender().submitForm().validateSubmittedUser();
    }
}
