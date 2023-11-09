package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CoffeeForHotelsPage {
    private ElementHelper elementHelper;

    public CoffeeForHotelsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private By LetsGrabACoffeeAreaTypeOfBusines = By.cssSelector(".space-y-6>select");
    private By FromBaristaAreaTrainingButton = By.cssSelector(".px-4>button");
    private By LetsGrabACoffeeAreaFullName = By.cssSelector(".space-y-6>input:nth-child(1)");
    private By LetsGrabACoffeeAreaMail = By.cssSelector(".space-y-6>input:nth-child(2)");
    private By LetsGrabACoffeeAreaContactNumber = By.cssSelector(".space-y-6>div input");
    private By LetsGrabACoffeeAreaBusinessName = By.cssSelector(".space-y-6>input:nth-child(4)");
    private By LetsGrabACoffeeAreaTypeOfBusiness = By.cssSelector(".space-y-6>select>option");
    private By LetsGrabACoffeeAreaTellUs = By.cssSelector(".flex.flex-col.h-full>textarea");
    private By LetsGrabACoffeeAreaSendButton = By.cssSelector(".flex.flex-col.h-full>button");
    private By CoffeeForHotelsAreaTitle = By.cssSelector(".px-8>h2");
    private By CoffeeForHotelsAreaDescription = By.cssSelector(".px-8>p");
    private By CoffeeForHotelsAreaImage = By.cssSelector(".bg-coffeeForHotels-mobile-bg");
    private By DescriptionAreaDescription = By.cssSelector(".my-8>p");
    private By TasteDifferenceAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(3) h2");
    private By TasteDifferenceAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(3) p");
    private By TasteDifferenceAreaImage = By.cssSelector("#__next>div>div>div:nth-child(3)");
    private By CoffeeRevolationAreaTitle = By.cssSelector("#social-section>div>div:nth-child(1)>div>span");
    private By CoffeeRevolationAreaDescription = By.cssSelector("#social-section>div>div:nth-child(1)>div>p");
    private By CoffeeRevolationAreaImage = By.cssSelector("#social-section>div>div:nth-child(1)>img");
    private By BrewingWithHospitallyAreaTitle = By.cssSelector("#social-section>div>div:nth-child(2)>div>span");
    private By BrewingWithHospitallyAreaDescription = By.cssSelector("#social-section>div>div:nth-child(2)>div>p");
    private By BrewingWithHospitallyAreaImage = By.cssSelector("#social-section>div>div:nth-child(2)>img");
    private By SustainablyDeliciousAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(5) h2");
    private By SustainablyDeliciousAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(5) p");
    private By SustainablyDeliciousAreaImage = By.cssSelector("#__next>div>div>div:nth-child(5)");
    private By FromBaristaAreaTitle = By.cssSelector(".mt-8.mb-8>div>span");
    private By FromBaristaAreaDescription = By.cssSelector(".mt-8.mb-8>div>p");
    private By FromBaristaAreaImage = By.cssSelector(".mt-8.mb-8>img");
    private By WhatMakesUsAreaTitle = By.cssSelector("#__next>div>div>div:nth-child(7) h2");
    private By WhatMakesUsAreaDescription = By.cssSelector("#__next>div>div>div:nth-child(7) p");
    private By WhatMakesUsAreaImage = By.cssSelector("#__next>div>div>div:nth-child(7)");
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


    String url = "https://dev.traumkaffee.com/wholesale/coffee-for-hotels";

    public void userOnTheCoffeeForHotelsPage() {
        elementHelper.openUrl(url);
    }

    public void clickLetsGrabACoffeeAreaTypeOfBusines() {
        elementHelper.click(LetsGrabACoffeeAreaTypeOfBusines);
    }

    public void clickFromBaristaAreaTrainingButton() {
        elementHelper.click(FromBaristaAreaTrainingButton);

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

    public void selectLetsGrabACoffeeAreaTypeOfBusiness(String type) {
        elementHelper.clickElementWithText(LetsGrabACoffeeAreaTypeOfBusiness, type);
    }

    public void sendkeysLetsGrabACoffeeAreaTellUs(String tellUs) {
        elementHelper.sendKeys(LetsGrabACoffeeAreaTellUs, tellUs);

    }

    public void clickLetsGrabACoffeeAreaSendButton() {
        elementHelper.click(LetsGrabACoffeeAreaSendButton);
    }

    public void shouldSeeTheCoffeeForHotelsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/wholesale/coffee-for-hotels");
    }

    public String shouldSeeCoffeeForHotelsAreaTitle() {
        return elementHelper.getText(CoffeeForHotelsAreaTitle);
    }

    public String shouldSeeCoffeeForHotelsAreaDescription() {
        return elementHelper.getText(CoffeeForHotelsAreaDescription);
    }

    public void shouldSeeCoffeeForHotelsAreaImage() {
        elementHelper.checkElement(CoffeeForHotelsAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public String shouldSeeTasteDifferenceAreaTitle() {
        return elementHelper.getText(TasteDifferenceAreaTitle);
    }

    public String shouldSeeTasteDifferenceAreaDescription() {
        return elementHelper.getText(TasteDifferenceAreaDescription);
    }

    public void shouldSeeTasteDifferenceAreaImage() {
        elementHelper.checkElement(TasteDifferenceAreaImage);
    }

    public String shouldSeeCoffeeRevolationAreaTitle() {
        return elementHelper.getText(CoffeeRevolationAreaTitle);
    }

    public String shouldSeeCoffeeRevolationAreaDescription() {
        return elementHelper.getText(CoffeeRevolationAreaDescription);
    }

    public void shouldSeeCoffeeRevolationAreaImage() {
        elementHelper.checkElement(CoffeeRevolationAreaImage);
    }

    public String shouldSeeBrewingWithHospitallyAreaTitle() {
        return elementHelper.getText(BrewingWithHospitallyAreaTitle);
    }

    public String shouldSeeBrewingWithHospitallyAreaDescription() {
        return elementHelper.getText(BrewingWithHospitallyAreaDescription);
    }

    public void shouldSeeBrewingWithHospitallyAreaImage() {
        elementHelper.checkElement(BrewingWithHospitallyAreaImage);
    }

    public String shouldSeeSustainablyDeliciousAreaTitle() {
        return elementHelper.getText(SustainablyDeliciousAreaTitle);
    }

    public String shouldSeeSustainablyDeliciousAreaDescription() {
        return elementHelper.getText(SustainablyDeliciousAreaDescription);
    }

    public void shouldSeeSustainablyDeliciousAreaImage() {
        elementHelper.checkElement(SustainablyDeliciousAreaImage);
    }

    public String shouldSeeFromBaristaAreaTitle() {
        return elementHelper.getText(FromBaristaAreaTitle);
    }

    public String shouldSeeFromBaristaAreaDescription() {
        return elementHelper.getText(FromBaristaAreaDescription);
    }

    public void shouldSeeFromBaristaAreaImage() {
        elementHelper.checkElement(FromBaristaAreaImage);
    }

    public String shouldSeeFromBaristaAreaTrainingButton() {
        return elementHelper.getText(FromBaristaAreaTrainingButton);
    }

    public String shouldSeeWhatMakesUsAreaTitle() {
        return elementHelper.getText(WhatMakesUsAreaTitle);
    }

    public String shouldSeeWhatMakesUsAreaDescription() {
        return elementHelper.getText(WhatMakesUsAreaDescription);
    }

    public void shouldSeeWhatMakesUsAreaImage() {
        elementHelper.checkElement(WhatMakesUsAreaImage);
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
