package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

import java.security.PublicKey;

public class CafesAndCoffeeShopsPage {

    private ElementHelper elementHelper;

    public CafesAndCoffeeShopsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By TheArtOfMakingAreaTrainingButton = By.cssSelector(".pb-6>button");
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTypeOfBusinessTextbox = By.cssSelector(".space-y-6>select");

    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex>textarea");
    private By clickLetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full >button");
    private By CafesAndCoffeeShopsAreaTitle = By.cssSelector(".px-8>h2");
    private By CafesAndCoffeeShopsAreaDescription = By.cssSelector(".px-8>p");
    private By CafesAndCoffeeShopsAreaImage = By.cssSelector(".bg-cafeShops-mobile-bg");
    private By DescriptionAreaDescription = By.cssSelector(".mx-4>p");
    private By AreYouBrewingUpAreaTitle = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1) span");
    private By AreYouBrewingUpAreaDescription = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1) p");
    private By AreYouBrewingUpAreaImage = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1)>img");
    private By TheArtOfMakingAreaTitle = By.cssSelector(".w-full.flex.flex-col.pb-6>span");
    private By TheArtOfMakingAreaDescription = By.cssSelector(".my-8.px-2>div:nth-child(1)>div>div:nth-child(1)>p");
    private By TheArtOfMakingAreaImage = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(2)>img");
    private By StandOutAreaTitle = By.cssSelector("div>div.h-full:nth-child(3) .flex.flex-col.w-full.pb-2>span");
    private By StandOutAreaDescription = By.cssSelector("div>div.h-full:nth-child(3) .flex.flex-col.w-full.pb-2>p");
    private By StandOutAreaImage = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(3)>img");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector("#wholesale-contact>div>h3");
    private By LetsGrabACoffeeAreaDescription = By.cssSelector("#wholesale-contact>div>p");
    private By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full >button");
    private By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".mx-4 .flex.flex-col.h-full  p");


    private String url = "https://dev.traumkaffee.com/wholesale/coffee-shops";

    public void userOnTheCafesAndCoffeeShopsPage() {
        elementHelper.openUrl(url);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusines);
    }

    public void clickTheArtOfMakingAreaTrainingButton() {
        elementHelper.click(TheArtOfMakingAreaTrainingButton);
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

    public void sendkeysLetsGrabACoffeeAreaBusinessName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaBusinessName, name);
    }

    public void selectLetsGrabACoffeeAreaTypeOfBusiness(String type) {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusinessTextbox);
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusiness, type);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(clickLetsGrabACoffeeAreaSendButton);
    }

    public void shouldSeeTheCafesAndCoffeeShopsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/coffee-shops");
    }

    public String shouldSeeCafesAndCoffeeShopsAreaTitle() {
        return elementHelper.getText(CafesAndCoffeeShopsAreaTitle);
    }

    public String shouldSeeCafesAndCoffeeShopsAreaDescription() {
        return elementHelper.getText(CafesAndCoffeeShopsAreaDescription);
    }

    public void shouldSeeCafesAndCoffeeShopsAreaImage() {
        elementHelper.checkElement(CafesAndCoffeeShopsAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeAreYouBrewingUpAreaTitle() {
        return elementHelper.getText(AreYouBrewingUpAreaTitle);
    }

    public String shouldSeeAreYouBrewingUpAreaDescription() {
        return elementHelper.getText(AreYouBrewingUpAreaDescription);
    }

    public void shouldSeeAreYouBrewingUpAreaImage() {
        elementHelper.checkElement(AreYouBrewingUpAreaImage);
    }

    public String shouldSeeTheArtOfMakingAreaTitle() {
        return elementHelper.getText(TheArtOfMakingAreaTitle);
    }

    public String shouldSeeTheArtOfMakingAreaDescription() {
        return elementHelper.getText(TheArtOfMakingAreaDescription);
    }

    public void shouldSeeTheArtOfMakingAreaImage() {
        elementHelper.checkElement(TheArtOfMakingAreaImage);
    }

    public String shouldSeeTheArtOfMakingAreaTrainingButton() {
        return elementHelper.getText(TheArtOfMakingAreaTrainingButton);
    }

    public String shouldSeeStandOutAreaTitle() {
        return elementHelper.getText(StandOutAreaTitle);
    }

    public String shouldSeeStandOutAreaDescription() {
        return elementHelper.getText(StandOutAreaDescription);
    }

    public void shouldSeeStandOutAreaImage() {
        elementHelper.checkElement(StandOutAreaImage);
    }

    public String shouldSeeLetsGrabACoffeeAreaTitle() {
        return elementHelper.getText(LetsGrabACoffeeAreaTitle);
    }

    public String shouldSeeLetsGrabACoffeeAreaDescription() {
        return elementHelper.getText(LetsGrabACoffeeAreaDescription);
    }

    public String shouldSeeLetsGrabACoffeeAreaFullName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaFullName, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaEmail() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaEmail, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaContactNumber() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaContactNumber, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaBusinessName() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaBusinessName, "placeholder");
    }

    public String shouldSeeLetsGrabACoffeeAreaTypeOfBusiness() {
        return elementHelper.getText(LetsGrabACoffeeAreaTypeOfBusiness);
    }

    public void shouldSeeLetsGrabACoffeeAreaTypeOfBusinessOption(String text) {
        elementHelper.checkElementWithText(LetsGrabACoffeeAreaTypeOfBusinessOption, text);
    }

    public String shouldSeeLetsGrabACoffeeAreaTellUs() {
        return elementHelper.getAttribute(LetsGrabACoffeeAreaTellUs, "placeholder");
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
