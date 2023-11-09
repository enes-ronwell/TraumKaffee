package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PrivacyPolicyPage {
    private ElementHelper elementHelper;

    public PrivacyPolicyPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/privacy-policy";


    public void userOnThePrivacyPolicyPage() {
        elementHelper.openUrl(url);
    }

    public void shouldSeeThePrivacyPolicyPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/privacy-policy");
    }
}
