package Steps;

import Data.userData;
import Pages.fillFormPage;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class fillFormStep {
    fillFormPage formFillPage = new fillFormPage();
    List<String> userInfoString = new ArrayList<String >();
    userData data = new userData();

    public fillFormStep setUserName()
    {
        formFillPage.userName.setValue(data.userName);
        return this;
    }
    public fillFormStep setUserLastName()
    {
        formFillPage.lastName.setValue(data.userLastName);
        return this;
    }
    public fillFormStep setUserEmail()
    {
        formFillPage.eMail.setValue(data.userEmail);
        return this;
    }
    public fillFormStep setUserPhoneNumber()
    {
        formFillPage.uNumber.setValue(data.userPhoneNumber);
        return this;
    }
    public fillFormStep setUserGender()
    {
        if(data.userGender == "Male")
        {
            formFillPage.genderMale.click();
        } else if (data.userGender == "Femail") {
            formFillPage.genderFemale.click();
        }
        else
        {
            formFillPage.genderOther.click();
        }
        return this;
    }
    public fillFormStep submitForm()
    {
        formFillPage.submitButton.click();
        return this;
    }
    public fillFormStep validateSubmittedUser()
    {
        formFillPage.afterSubmittedText.shouldBe(Condition.exactText("Thanks for submitting the form"));

        for(int i= 0; i<formFillPage.userInfo.size(); i++)
        {
            if(i%2!=0 && i<4)
            {
                userInfoString.add(formFillPage.userInfo.get(i).getText());
            }

        }

        Assert.assertEquals(userInfoString.get(0), data.userName+" "+data.userLastName);
        Assert.assertEquals(userInfoString.get(1), data.userEmail);


        return this;
    }

}
