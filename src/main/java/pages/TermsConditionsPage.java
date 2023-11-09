package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class TermsConditionsPage {
    private ElementHelper elementHelper;

    public TermsConditionsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/terms-conditions";


    public void userOnTheTermsConditionsPage() {
        elementHelper.openUrl(url);
    }

    public void shouldSeeTheTermsConditionsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/terms-conditions");
    }
}
