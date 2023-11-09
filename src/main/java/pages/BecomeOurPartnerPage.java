package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BecomeOurPartnerPage {
    private ElementHelper elementHelper;

    public BecomeOurPartnerPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By GrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaOther = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".h-full>textarea");
    private By GrabACoffeeAreaSendButton = By.cssSelector(".h-full>button");
    private By BecomeOurPartnerAreaTitle = By.cssSelector(".bg-become-mobile-bg>div>h2");
    private By BecomeOurPartnerAreaDescription = By.cssSelector(".bg-become-mobile-bg>div>p");
    private By BecomeOurPartnerAreaImage = By.cssSelector(".bg-become-mobile-bg");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector(".justify-center>h3");
    private By LetsGrabACoffeeAreaDescription = By.cssSelector(".justify-center>p");
    private By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaTypeOfBusinessTextBox = By.cssSelector(".space-y-6>select");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".h-full>button");
    private By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".flex.flex-col.h-full  p");




    private String url = "https://dev.traumkaffee.com/become-our-partners";

    public void userOnTheBecomeOurPartnerPage() {
        elementHelper.openUrl(url);
    }

    public void checkUrl() {
        elementHelper.checkUrl(url);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(GrabACoffeeAreaTypeOfBusines);
    }

    public void sendkeysLetsGrabACoffeeAreaFullName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaFullName, name);
    }

    public void sendkeysLetsGrabACoffeeAreaMail(String mail) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaMail, mail);
    }

    public void sendkeysLetsGrabACoffeeAreaContactNumber(String number) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaContactNumber, number);
    }

    public void sendkeysLetsGrabACoffeeAreaBusinessName(String business) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaBusinessName, business);
    }

    public void selectLetsGrabACoffeeAreaOther(String text) {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusinessTextBox);
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaOther,text);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(GrabACoffeeAreaSendButton);
    }

    public String shouldSeeBecomeOurPartnerAreaTitle() {
        return elementHelper.getText(BecomeOurPartnerAreaTitle);
    }

    public String shouldSeeBecomeOurPartnerAreaDescription() {
        return elementHelper.getText(BecomeOurPartnerAreaDescription);
    }

    public void shouldSeeBecomeOurPartnerAreaImage() {
        elementHelper.findElement(BecomeOurPartnerAreaImage).isDisplayed();
    }

    public String shouldSeeLetsGrabACoffeeAreaTitle() {
        return elementHelper.getText(LetsGrabACoffeeAreaTitle);
    }

    public String shouldSeeLetsGrabACoffeeAreaDescription() {
        return elementHelper.getText(LetsGrabACoffeeAreaDescription);
    }

    public String shouldSeeLetsGrabACoffeeAreaFullName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaFullName,"placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaEmail() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaEmail,"placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaContactNumber() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaContactNumber,"placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaBusinessName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaBusinessName,"placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaTypeOfBusiness() {
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusiness);
    }

    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(String text) {
         elementHelper.checkElementWithText(LetsGrabACoffeeAreaTypeOfBusinessOption,text);
    }

    public String shouldSeeLetsGrabACoffeeAreaTellUs() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaTellUs,"placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaSendButton() {
        return elementHelper.getText(LetsGrabACoffeeAreaSendButton);
    }

    public String shouldSeeLetsGrabACoffeeAreaFalseEmailMessage() {
        return elementHelper.getText(LetsGrabACoffeeAreaFalseEmailMessage);
    }

    public String shouldSeeLetsGrabACoffeeAreaFullNameError() {
        return elementHelper.getText(LetsGrabACoffeeAreaFullNameError);
    }

    public String shouldSeeLetsGrabACoffeeAreaEmailError() {
        return elementHelper.getText(LetsGrabACoffeeAreaEmailError);
    }

    public String shouldSeeLetsGrabACoffeeAreaContactNumberError() {
        return elementHelper.getText(LetsGrabACoffeeAreaContactNumberError);
    }

    public String shouldSeeLetsGrabACoffeeAreaBusinessNameError() {
        return elementHelper.getText(LetsGrabACoffeeAreaBusinessNameError);
    }

    public String shouldSeeLetsGrabACoffeeAreaTypeOfBusinessError() {
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusinessError);
    }

    public String shouldSeeLetsGrabACoffeeAreaTellUsError() {
        return elementHelper.getText(LetsGrabACoffeeAreaTellUsError);
    }


}
