package Pages;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class FormsPage {
    public SelenideElement practiceFormsButton = $(By.xpath("//span[text()= 'Practice Form']"));

//    public void test()
//    {
//        open("https://demoqa.com/forms");
//        SelenideElement practiceFormsButton = $(By.xpath("//span[text()= 'Practice Form']"));
//        practiceFormsButton.click();
//    }
}
