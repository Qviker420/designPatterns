package Steps;

import Pages.domQaMainPage;

public class domQaMainPageStep {
    domQaMainPage mainPage = new domQaMainPage();

    public domQaMainPageStep enterFormsPage()
    {
        mainPage.formsButton.click();
        return this;
    }
}
