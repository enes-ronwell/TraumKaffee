package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class AboutPage {

    private By AboutAreaTitle = By.cssSelector("#about-traum-title h3");
    private By AboutAreaTitle2 = By.cssSelector("#about-traum-title h4");
    private By AboutAreaDescription = By.cssSelector("#about-traum-title>p");
    private By AboutAreaImage = By.id("about-traum-title");
    private By HowItAllBeganAreaTitle = By.cssSelector(".capitalize.mt-4.font-butler");
    private By HowItAllBeganAreaDescription = By.cssSelector(".flex.flex-col.justify-center.ml-0>p");
    private By HowItAllBeganAreaImage = By.cssSelector(".hidden.bg-about-coffee-bean");
    private By OurDreamAreaTitle = By.cssSelector(".capitalize.font-butler.font-medium");
    private By OurDreamAreaLeftImage = By.cssSelector(".bg-sb-bg.w-full");
    private By OurDreamAreaRightImageOnAboutPage = By.cssSelector(".bg-bean-bg.w-full");
    private By FromMountaintopAreaTitle = By.cssSelector(".capitalize.font-butler.font-bold.mt-6");
    private By FromMountaintopAreaDescription = By.cssSelector(".col-span-1>p");
    private By FromMountaintopAreaImage = By.cssSelector(".col-span-2.bg-about-bg");
    private By LetsGrabACoffeeAreaTitle = By.cssSelector("#about-traum-contact>h5");
    private By LetsGrabACoffeeAreaContactButton = By.cssSelector("#about-traum-contact p");
    private By LetsGrabACoffeeAreaImage = By.cssSelector("#about-traum-contact");

    private String url = "https://dev.traumkaffee.com/about";

    private ElementHelper elementHelper;

    public AboutPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    public void userOnTheAboutPage() {
        elementHelper.openUrl(url);
    }

    public void clickLetsGrabACoffeeAreaContactButton() {
        elementHelper.click(LetsGrabACoffeeAreaContactButton);

    }

    public void shouldSeeTheAboutPage() {
         elementHelper.checkUrl("https://dev.traumkaffee.com/about");
    }

    public String shouldSeeAboutAreaTitle() {
        return elementHelper.getText(AboutAreaTitle) + elementHelper.getText(AboutAreaTitle2);
    }

    public String shouldSeeAboutAreaDescription() {
        return elementHelper.getText(AboutAreaDescription);
    }

    public void shouldSeeAboutAreaImage() {
        elementHelper.findElement(AboutAreaImage).isDisplayed();
    }

    public String shouldSeeHowItAllBeganAreaTitle() {
        return elementHelper.getText(HowItAllBeganAreaTitle);
    }

    public String shouldSeeHowItAllBeganAreaDescription() {
        return elementHelper.getText(HowItAllBeganAreaDescription);
    }

    public void shouldSeeHowItAllBeganAreaImage() {
        elementHelper.findElement(HowItAllBeganAreaImage).isDisplayed();
    }

    public String shouldSeeOurDreamAreaTitle() {
        return elementHelper.getText(OurDreamAreaTitle);
    }

    public void shouldSeeOurDreamAreaLeftImage() {
        elementHelper.findElement(OurDreamAreaLeftImage).isDisplayed();
    }

    public void shouldSeeOurDreamAreaRightImage() {
        elementHelper.findElement(OurDreamAreaRightImageOnAboutPage).isDisplayed();
    }

    public String shouldSeeFromMountaintopAreaTitle() {
        return elementHelper.getText(FromMountaintopAreaTitle);
    }

    public String shouldSeeFromMountaintopAreaDescription() {
        return elementHelper.getText(FromMountaintopAreaDescription);
    }

    public void shouldSeeFromMountaintopAreaImage() {
        elementHelper.findElement(FromMountaintopAreaImage).isDisplayed();
    }

    public String shouldSeeLetsGrabACoffeeAreaTitle() {
        return elementHelper.getText(LetsGrabACoffeeAreaTitle);
    }

    public String shouldSeeLetsGrabACoffeeAreaContactButton() {
        return elementHelper.getText(LetsGrabACoffeeAreaContactButton);
    }

    public void shouldSeeLetsGrabACoffeeAreaImage() {
        elementHelper.findElement(LetsGrabACoffeeAreaImage).isDisplayed();
    }


}


