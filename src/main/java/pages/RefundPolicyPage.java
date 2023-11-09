package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RefundPolicyPage {
    private ElementHelper elementHelper;

    public RefundPolicyPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/refund-policy";
    public void userOnTheRefundPolicyPage(){
        elementHelper.openUrl(url);
    }
    public void shouldSeeTheRefundPolicyPage(){
          elementHelper.checkUrl("https://dev.traumkaffee.com/refund-policy");
    }
}
