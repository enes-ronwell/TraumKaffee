package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CoffeeAtWorkPage {

    private ElementHelper elementHelper;

    public CoffeeAtWorkPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    By EngagingCoffeeAreaEquipmentButton = By.cssSelector(".justify-center.pb-6>button");
    By BrewingGreatAreaEquipmentButton = By.cssSelector(".justify-center.pb-2>button");
    By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div>input");
    By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    By CoffeeAtWorkAreaTitle = By.cssSelector(".px-8>h2");
    By CoffeeAtWorkAreaDescription = By.cssSelector(".px-8>p");
    By CoffeeAtWorkAreaImage = By.cssSelector(".bg-cafeAtWork-mobile-bg");
    By DescriptionAreaDescription = By.cssSelector(".mx-4>p");
    By FavoriteDrinkAreaTitle = By.cssSelector(".px-4>h2");
    By FavoriteDrinkAreaDescription = By.cssSelector(".px-4>p");
    By FavoriteDrinkAreaImage = By.cssSelector("#wholesale-banner");
    By BrewingGreatAreaTitle = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1)>div>span");

    By BrewingGreatAreaDescription = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1)>div>p");
    By BrewingGreatAreaImage = By.cssSelector("#social-section .flex.flex-col>div.h-full:nth-child(1)>img");
    By GreatAreaEquipmentButton = By.cssSelector(".justify-center.pb-2>button");
    By EngagingCoffeeAreaTitle = By.cssSelector("#social-section>div>div:nth-child(2)>div>span");
    By EngagingCoffeeAreaDescription = By.cssSelector("#social-section>div>div:nth-child(2)>div>p");
    By EngagingCoffeeAreaImage = By.cssSelector("#social-section>div>div:nth-child(2)>img");
    By EngagingCoffeeAreaTrainingButton = By.cssSelector(".justify-center.pb-6>button");
    By ACoffeeBreakAreaTitle = By.cssSelector(".relative.flex.flex-col.w-full:nth-child(3)>div>span");
    By ACoffeeBreakAreaDescription = By.cssSelector(".relative.flex.flex-col.w-full:nth-child(3)>div>p");
    By ACoffeeBreakAreaImage = By.cssSelector(".relative.flex.flex-col.w-full:nth-child(3)>img");
    By LetsGrabACoffeeAreaTitle = By.cssSelector("#wholesale-contact>div>h3");
    By LetsGrabACoffeeAreaDescription = By.cssSelector("#wholesale-contact>div>p");
    By LetsGrabACoffeeAreaEmail = By.cssSelector(".space-y-6>input:nth-child(2)");
    By LetsGrabACoffeeAreaTypeOfBusinessOption = By.cssSelector("select>option");
    By LetsGrabACoffeeAreaFalseEmailMessage = By.cssSelector(".space-y-6>h2");
    private By LetsGrabACoffeeAreaFullNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(2)");
    private By LetsGrabACoffeeAreaEmailError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(4)");
    private By LetsGrabACoffeeAreaContactNumberError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(6)");
    private By LetsGrabACoffeeAreaBusinessNameError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(8)");
    private By LetsGrabACoffeeAreaTypeOfBusinessError = By.cssSelector(".flex.flex-col.space-y-6>p:nth-child(10)");
    private By LetsGrabACoffeeAreaTellUsError = By.cssSelector(".mx-4 .flex.flex-col.h-full  p");

    private String url = "https://dev.traumkaffee.com/wholesale/coffee-at-work";

    public void userOnTheCoffeeAtWorkPage() {
        elementHelper.openUrl(url);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusines);
    }

    public void clickEngagingCoffeeAreaEquipmentButton() {
        elementHelper.click(EngagingCoffeeAreaEquipmentButton);
    }

    public void clickBrewingGreatAreaEquipmentButton() {
        elementHelper.click(BrewingGreatAreaEquipmentButton);
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
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusiness, type);

    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);
    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(LetsGrabACoffeeAreaSendButton);
    }

    public void shouldSeeTheCoffeeAtWork() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/coffee-at-work");
    }

    public String shouldSeeCoffeeAtWorkAreaTitle() {
        return elementHelper.getText(CoffeeAtWorkAreaTitle);
    }

    public String shouldSeeCoffeeAtWorkAreaDescription() {
        return elementHelper.getText(CoffeeAtWorkAreaDescription);
    }

    public void shouldSeeCoffeeAtWorkAreaImage() {
        elementHelper.findElement(CoffeeAtWorkAreaImage).isDisplayed();
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeTheFavoriteDrinkAreaTitle() {
        return elementHelper.getText(FavoriteDrinkAreaTitle);
    }

    public String shouldSeeTheFavoriteDrinkAreaDescription() {
        return elementHelper.getText(FavoriteDrinkAreaDescription);
    }

    public void shouldSeeTheFavoriteDrinkAreaImage() {
        elementHelper.findElement(FavoriteDrinkAreaImage).isDisplayed();
    }

    public String shouldSeeBrewingGreatAreaTitle() {
        return elementHelper.getText(BrewingGreatAreaTitle);
    }

    public String shouldSeeBrewingGreatAreaDescription() {
        return elementHelper.getText(BrewingGreatAreaDescription);
    }

    public void shouldSeeBrewingGreatAreaImage() {
        elementHelper.findElement(BrewingGreatAreaImage).isDisplayed();
    }

    public String shouldSeeBrewingGreatAreaEquipmentButton() {
        return elementHelper.getText(GreatAreaEquipmentButton);
    }

    public String shouldSeeEngagingCoffeeAreaTitle() {
        return elementHelper.getText(EngagingCoffeeAreaTitle);
    }

    public String shouldSeeEngagingCoffeeAreaDescription() {
        return elementHelper.getText(EngagingCoffeeAreaDescription);
    }

    public void shouldSeeEngagingCoffeeAreaImage() {
        elementHelper.findElement(EngagingCoffeeAreaImage).isDisplayed();
    }

    public String shouldSeeEngagingCoffeeAreaTrainingButton() {
        return elementHelper.getText(EngagingCoffeeAreaTrainingButton);
    }

    public String shouldSeeACoffeeBreakAreaTitle() {
        return elementHelper.getText(ACoffeeBreakAreaTitle);
    }

    public String shouldSeeACoffeeBreakAreaDescription() {
        return elementHelper.getText(ACoffeeBreakAreaDescription);
    }

    public void shouldSeeACoffeeBreakAreaImage() {
        elementHelper.findElement(ACoffeeBreakAreaImage).isDisplayed();
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
