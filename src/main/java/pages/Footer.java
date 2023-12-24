package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class Footer {

    private ElementHelper elementHelper;

    public Footer(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By TraumKaffeeAreaImage = By.cssSelector("#footer>div>div>div>img");
    private By QuickLinksAreaMyAccount = By.cssSelector("#footer>div>div>div:nth-child(2) div:nth-child(2)>ul button");
    private By QuickLinksAreaFAQ = By.cssSelector("#footer>div>div>div:nth-child(2)>div:nth-child(2)>ul>li:nth-child(2)");
    private By QuickLinksAreaBecomeOurPartner = By.cssSelector("#footer>div>div>div:nth-child(2)>div:nth-child(2)>ul>li:nth-child(3)");
    private By QuickLinksAreaContact = By.cssSelector("#footer>div>div>div:nth-child(2)>div>div>ul>li:nth-child(1)");
    private By QuickLinksAreaProducts = By.cssSelector("#footer>div>div>div:nth-child(2)>div>div>ul>li:nth-child(2)");
    private By QuickLinksAreaBlog = By.cssSelector("#footer>div>div>div:nth-child(2)>div>div>ul>li:nth-child(3)");
    private By LegalsAreaPrivacyPolicy = By.cssSelector("#footer>div>div>div:nth-child(3)>ul>li:nth-child(1)");
    private By LegalsAreaTermsConditions = By.cssSelector("#footer>div>div>div:nth-child(3)>ul>li:nth-child(2)");
    private By LegalsAreaRefundPolicy = By.cssSelector("#footer>div>div>div:nth-child(3)>ul>li:nth-child(3)");
    private By LetsStayInTouchAreaFacebookIcon = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(3)>div:nth-child(1)>button");
    private By LetsStayInTouchAreaInstagramIcon = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(3)>div:nth-child(2)>button");
    private By LetsStayInTouchAreaTwitterIcon = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(3)>div:nth-child(3)>button");
    private By LetsStayInTouchAreaEmailBoxIcon = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(2) svg");
    private By LetsStayInTouchAreaEmailBox = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(2)>input");
    private By TraumKaffeeAreaTitle = By.cssSelector("#footer>div>span>span");
    private By TraumKaffeeAreaAllRightsReserved = By.cssSelector("#footer .mb-4.mt-8:nth-child(2)");
    private By QuickLinksAreaTitle = By.cssSelector("#footer>div>div>div:nth-child(2) h3");
    private By LegalsAreaTitle = By.cssSelector("#footer>div>div>div:nth-child(3) h3");
    private By LetsStayInTouchAreaTitle = By.cssSelector("#footer>div>div>div:nth-child(4)>div:nth-child(1) span");


    public void clickTraumKaffeeAreaImage() {
        elementHelper.click(TraumKaffeeAreaImage);
    }

    public void clickQuickLinksAreaMyAccount() {
        elementHelper.click(QuickLinksAreaMyAccount);
    }

    public void clickQuickLinksAreaFAQ() {
        elementHelper.click(QuickLinksAreaFAQ);
    }

    public void clickQuickLinksAreaBecomeOurPartner() {
        elementHelper.click(QuickLinksAreaBecomeOurPartner);
    }

    public void clickQuickLinksAreaContact() {
        elementHelper.click(QuickLinksAreaContact);
    }

    public void clickQuickLinksAreaProducts() {
        elementHelper.click(QuickLinksAreaProducts);
    }

    public void clickQuickLinksAreaBlog() {
        elementHelper.click(QuickLinksAreaBlog);
    }

    public void clickLegalsAreaPrivacyPolicy() {
        elementHelper.click(LegalsAreaPrivacyPolicy);
    }

    public void clickLegalsAreaTermsConditions() {
        elementHelper.click(LegalsAreaTermsConditions);
    }

    public void clickLegalsAreaRefundPolicy() {
        elementHelper.click(LegalsAreaRefundPolicy);
    }

    public void clickLetsStayInTouchAreaFacebookIcon() {
        elementHelper.click(LetsStayInTouchAreaFacebookIcon);
    }

    public void clickLetsStayInTouchAreaInstagramIcon() {
        elementHelper.click(LetsStayInTouchAreaInstagramIcon);
    }

    public void clickLetsStayInTouchAreaTwitterIcon() {
        elementHelper.click(LetsStayInTouchAreaTwitterIcon);
    }

    public void clickLetsStayInTouchAreaEmailBoxIcon() {
        elementHelper.click(LetsStayInTouchAreaEmailBoxIcon);
    }

    public void sendkeysLetsStayInTouchAreaEmailBox(String email) {
        elementHelper.sendKeys(LetsStayInTouchAreaEmailBox, email);
    }

    public String shouldSeeTraumKaffeeAreaTitle() {
        return elementHelper.getText(TraumKaffeeAreaTitle);
    }

    public void shouldSeeTraumKaffeeAreaImage() {
        elementHelper.checkElement(TraumKaffeeAreaImage);
    }

    public String shouldSeeTraumKaffeeAreaAllRightsReserved() {
        return elementHelper.getText(TraumKaffeeAreaAllRightsReserved);
    }

    public String shouldSeeQuickLinksAreaTitle() {
        return elementHelper.getText(QuickLinksAreaTitle);
    }

    public String shouldSeeQuickLinksAreaMyAccount() {
        return elementHelper.getText(QuickLinksAreaMyAccount);
    }

    public String shouldSeeQuickLinksAreaFAQ() {
        return elementHelper.getText(QuickLinksAreaFAQ);
    }

    public String shouldSeeQuickLinksAreaBecomeOurPartner() {
        return elementHelper.getText(QuickLinksAreaBecomeOurPartner);
    }

    public String shouldSeeQuickLinksAreaContact() {
        return elementHelper.getText(QuickLinksAreaContact);
    }

    public String shouldSeeQuickLinksAreaProducts() {
        return elementHelper.getText(QuickLinksAreaProducts);
    }

    public String shouldSeeQuickLinksAreaBlog() {
        return elementHelper.getText(QuickLinksAreaBlog);
    }

    public String shouldSeeLegalsAreaTitle() {
        return elementHelper.getText(LegalsAreaTitle);
    }

    public String shouldSeeLegalsAreaPrivacyPolicy() {
        return elementHelper.getText(LegalsAreaPrivacyPolicy);
    }

    public String shouldSeeLegalsAreaTermsConditions() {
        return elementHelper.getText(LegalsAreaTermsConditions);
    }

    public String shouldSeeLegalsAreaRefundPolicy() {
        return elementHelper.getText(LegalsAreaRefundPolicy);
    }

    public String shouldSeeLetsStayInTouchAreaTitle() {
        return elementHelper.getText(LetsStayInTouchAreaTitle);
    }

    public String shouldSeeLetsStayInTouchAreaEmailBox() {
        return elementHelper.getAttribute(LetsStayInTouchAreaEmailBox,"placeholder");
    }

    public void shouldSeeLetsStayInTouchAreaEmailBoxIcon() {
        elementHelper.checkElement(LetsStayInTouchAreaEmailBoxIcon);
    }

    public void shouldSeeLetsStayInTouchAreaFacebookIcon() {
        elementHelper.checkElement(LetsStayInTouchAreaFacebookIcon);
    }

    public void shouldSeeLetsStayInTouchAreaTwitterIcon() {
        elementHelper.checkElement(LetsStayInTouchAreaTwitterIcon);
    }

    public void shouldSeeLetsStayInTouchAreaInstagramIcon() {
        elementHelper.checkElement(LetsStayInTouchAreaInstagramIcon);
    }


}
