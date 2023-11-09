package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CoffeeForRestaurantPage {
    private ElementHelper elementHelper;

    public CoffeeForRestaurantPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/wholesale/coffee-for-restaurant";
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By OurCommitmentAreaTrainingButton = By.cssSelector(".pb-2>button");
    private By LetsGrabACoffeeAreaMai = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    private By CoffeeForRestaurantAreaTitle = By.cssSelector("#CoffeeForRestaurant-hero>div:nth-child(2)>div>h2");
    private By CoffeeForRestaurantAreaDescription = By.cssSelector("#CoffeeForRestaurant-hero>div>div>p");
    private By CoffeeForRestaurantAreaImage = By.cssSelector("#CoffeeForRestaurant-hero>div:nth-child(2)");
    private By DescriptionAreaDescription = By.cssSelector(".my-8.mx-4>p");
    private By WhyPartnerAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(3) h2");
    private By WhyPartnerAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(3) p");
    private By WhyPartnerAreaImage = By.cssSelector("#__next>div>div>div:nth-child(3)");
    private By OurCommitmentAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(1)>div>span");
    private By OurCommitmentAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(1)>div>p");
    private By OurCommitmentAreaImage = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(1)>img");
    private By WhySettleAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(2)>div>span");
    private By WhySettleAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(2)>div>p");
    private By WhySettleAreaTrainingButton = By.cssSelector("");
    private By WhySettleAreaImage = By.cssSelector("#__next>div>div>div:nth-child(4)>div>div:nth-child(2)>img");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector("#wholesale-contact>div>h3");
    private By LetsGrabACoffeeAreaDescription = By.cssSelector("#wholesale-contact>div>p");
    private By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    private By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".mx-4 .flex.flex-col.h-full  p");


    public void userOnTheCoffeeForRestaurantPage() {
        elementHelper.openUrl(url);
    }

    public void sendkeysLetsGrabACoffeeAreaFullName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaFullName, name);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusines);
    }

    public void clickOurCommitmentAreaTrainingButton() {
        elementHelper.click(OurCommitmentAreaTrainingButton);
    }

    public void sendkeysLetsGrabACoffeeAreaMail(String mail) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaMai, mail);
    }

    public void sendkeysLetsGrabACoffeeAreaContactNumber(String number) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaContactNumber, number);
    }

    public void sendkeysLetsGrabACoffeeAreaBusinessName(String name) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaBusinessName, name);
    }

    public void selectLetsGrabACoffeeAreaTypeOfBusiness(String type) {
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusiness,type);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(LetsGrabACoffeeAreaSendButton);
    }

    public void shouldSeeTheCoffeeForRestaurantPage() {
         elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/coffee-for-restaurant");
    }

    public String shouldSeeCoffeeForRestaurantAreaTitle() {
        return elementHelper.getText(CoffeeForRestaurantAreaTitle);
    }

    public String shouldSeeCoffeeForRestaurantAreaDescription() {
        return elementHelper.getText(CoffeeForRestaurantAreaDescription);
    }

    public void shouldSeeCoffeeForRestaurantAreaImage() {
        elementHelper.checkElement(CoffeeForRestaurantAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeWhyPartnerAreaTitle() {
        return elementHelper.getText(WhyPartnerAreaTitle);
    }

    public String shouldSeeWhyPartnerAreaDescription() {
        return elementHelper.getText(WhyPartnerAreaDescription);
    }

    public void shouldSeeWhyPartnerAreaImage() {
        elementHelper.checkElement(WhyPartnerAreaImage);
    }

    public String shouldSeeOurCommitmentAreaTitle() {
        return elementHelper.getText(OurCommitmentAreaTitle);
    }

    public String shouldSeeOurCommitmentAreaDescription() {
        return elementHelper.getText(OurCommitmentAreaDescription);
    }

    public String shouldSeeOurCommitmentAreaTrainingButton() {
        return elementHelper.getText(OurCommitmentAreaTrainingButton);
    }

    public void shouldSeeOurCommitmentAreaImage() {
        elementHelper.checkElement(OurCommitmentAreaImage);
    }

    public String shouldSeeWhySettleAreaTitle() {
        return elementHelper.getText(WhySettleAreaTitle);
    }

    public String shouldSeeWhySettleAreaDescription() {
        return elementHelper.getText(WhySettleAreaDescription);
    }

    public String shouldSeeWhySettleAreaTrainingButton() {
        return elementHelper.getText(WhySettleAreaTrainingButton);
    }

    public void shouldSeeWhySettleAreaImage() {
        elementHelper.checkElement(WhySettleAreaImage);
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
