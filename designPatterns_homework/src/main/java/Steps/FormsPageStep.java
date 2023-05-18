package Steps;

import Pages.FormsPage;

public class FormsPageStep {
    FormsPage formsPage = new FormsPage();

    public FormsPageStep enterPracticeForm()
    {
        formsPage.practiceFormsButton.click();
        return this;
    }
}
