package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BrewDetailsPage {
    private ElementHelper elementHelper;

    public BrewDetailsPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }

    private String url = "https://dev.traumkaffee.com/brew-guides/chemex";

    By ShareAreaFacebookIcon = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .mt-8 .flex.space-x-6>a:nth-child(1)>img");
    By ShareAreaTwitterIcon = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .mt-8 .flex.space-x-6>a:nth-child(2)>img");
    By ShareAreaInstagramIcon = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .mt-8 .flex.space-x-6>a:nth-child(3)>img");
    By ShareAreaTiktokIcon = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .mt-8 .flex.space-x-6>a:nth-child(4)>img");
    By BrewYourDreamShopOurCoffeeButton = By.cssSelector("#brew-footer a");
    By BrewDetailsAreaTitle = By.cssSelector("#brew-banner h3");
    By BrewDetailsAreaDescription = By.cssSelector("#brew-banner p");
    By MakingsAreaMinute = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(1)>span");
    By MakingsAreaSeaSalt = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(2)>span");
    By MakingsAreaCoffee = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(3)>span");
    By MakingsAreaTempreture = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(4)>span");
    By WhatYouWillNeedAreaTitle = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) div>div>div>.uppercase.font-sans.font-bold.mb-4");
    By WhatYouWillNeedAreaOption = By.cssSelector(".justify-around>div.hidden li.mx-4 .pointer-events-none");
    By ShareAreaTitle = By.cssSelector(".justify-around>div.hidden>div> .mt-8 .mb-4.uppercase");
    By BackgroundAreaTitle = By.cssSelector("div>div#brew-title:nth-child(1)>h2");
    By BackgroundAreaDescription = By.cssSelector("div>div#brew-text:nth-child(2)>p");
    By BrewYourDreamAreaShopOurCoffeeButton = By.cssSelector("#brew-footer a");
    By BrewDetailsAreaImage = By.cssSelector("#brew-banner div");
    By MakingsAreaMinuteImage = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(1) svg");
    By MakingsAreaSeaSaltImage = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(2) svg");
    By MakingsAreaCoffeeImage = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(3) svg");
    By MakingsAreaTempretureImage = By.cssSelector(".flex.flex-col.justify-around>div:nth-child(2) #brew-right-section .flex.space-x-6>div:nth-child(4) svg");
    By BackgroundAreaLeftImage = By.cssSelector("");
    By BackgroundAreaRightImage = By.cssSelector("");
    By BrewYourDreamAreaImage = By.cssSelector("#brew-footer>div");
    By BrewYourDreamAreaTitle = By.cssSelector("#brew-footer h5");

    public void userOnTheBrewDetailsPage() {
        elementHelper.openUrl(url);
    }

    public void shouldSeeTheBrewDetailsPage() {
        elementHelper.checkUrl("/brew-guides/");

    }

    public void shouldSeeChemaxTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/chemex");
    }

    public void shouldSeeFrenchTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/french-press");
    }

    public void shouldSeeEspressoTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/espresso");
    }

    public void shouldSeeSiphonTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/siphon");
    }

    public void shouldSeeAeropressTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/aeropress");
    }

    public void shouldSeeHarioVTheBrewDetailsPage() {
        elementHelper.checkUrl("https://dev.traumkaffee.com/brew-guides/hario");
    }

    public void clickShareAreaFacebookIcon() {
        elementHelper.click(ShareAreaFacebookIcon);
    }

    public void clickShareAreaTwitterIcon() {
        elementHelper.click(ShareAreaTwitterIcon);
    }

    public void clickShareAreaInstagramkIcon() {
        elementHelper.click(ShareAreaInstagramIcon);
    }

    public void clickShareAreaTiktokIcon() {
        elementHelper.click(ShareAreaTiktokIcon);
    }

    public void clickBrewYourDreamShopOurCoffeeButton() {
        elementHelper.click(BrewYourDreamShopOurCoffeeButton);
    }

    public String shouldSeeBrewDetailsAreaTitle() {
        return elementHelper.getText(BrewDetailsAreaTitle);
    }

    public String shouldSeeBrewDetailsAreaDescription() {
        return elementHelper.getText(BrewDetailsAreaDescription);
    }

    public String shouldSeeMakingsAreaMinute() {
        return elementHelper.getText(MakingsAreaMinute);
    }

    public String shouldSeeMakingsAreaSeaSalt() {
        return elementHelper.getText(MakingsAreaSeaSalt);
    }

    public String shouldSeeMakingsAreaCoffee() {
        return elementHelper.getText(MakingsAreaCoffee);
    }

    public String shouldSeeMakingsAreaTempreture() {
        return elementHelper.getText(MakingsAreaTempreture);
    }

    public String shouldSeeWhatYouWillNeedAreaTitle() {
        return elementHelper.getText(WhatYouWillNeedAreaTitle);
    }

    public void shouldSeeWhatYouWillNeedAreaOption(String text) {
        elementHelper.checkElementWithText(WhatYouWillNeedAreaOption, text);
    }

    public String shouldSeeShareAreaTitle() {
        return elementHelper.getText(ShareAreaTitle);
    }

    public String shouldSeeBackgroundAreaTitle() {
        return elementHelper.getText(BackgroundAreaTitle);
    }

    public String shouldSeeBackgroundAreaDescription() {
        return elementHelper.getText(BackgroundAreaDescription);
    }

    public String shouldSeeBrewYourDreamAreaShopOurCoffeeButton() {
        return elementHelper.getText(BrewYourDreamAreaShopOurCoffeeButton);
    }

    public void shouldSeeBrewDetailsAreaImage() {
        elementHelper.checkElement(BrewDetailsAreaImage);
    }

    public void shouldSeeMakingsAreaMinuteImage() {
        elementHelper.checkElement(MakingsAreaMinuteImage);
    }

    public void shouldSeeMakingsAreaSeaSaltImage() {
        elementHelper.checkElement(MakingsAreaSeaSaltImage);
    }

    public void shouldSeeMakingsAreaCoffeeImage() {
        elementHelper.checkElement(MakingsAreaCoffeeImage);
    }

    public void shouldSeeMakingsAreaTempretureImage() {
        elementHelper.checkElement(MakingsAreaTempretureImage);
    }

    public void shouldSeeShareAreaFacebookIcon() {
        elementHelper.checkElement(ShareAreaFacebookIcon);
    }

    public void shouldSeeShareAreaTwitterIcon() {
        elementHelper.checkElement(ShareAreaTwitterIcon);
    }

    public void shouldSeeShareAreaInstagramIcon() {
        elementHelper.checkElement(ShareAreaInstagramIcon);
    }

    public void shouldSeeShareAreaTiktokIcon() {
        elementHelper.checkElement(ShareAreaTiktokIcon);
    }

    public void shouldSeeBackgroundAreaLeftImage() {
        elementHelper.checkElement(BackgroundAreaLeftImage);
    }

    public void shouldSeeBackgroundAreaRightImage() {
        elementHelper.checkElement(BackgroundAreaRightImage);
    }

    public void shouldSeeBrewYourDreamAreaImage() {
        elementHelper.checkElement(BrewYourDreamAreaImage);
    }

    public String shouldSeeBrewYourDreamAreaTitle() {
        return elementHelper.getText(BrewYourDreamAreaTitle);
    }


}
