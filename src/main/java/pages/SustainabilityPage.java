package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SustainabilityPage {
    private ElementHelper elementHelper;

    public SustainabilityPage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private String url = "https://dev.traumkaffee.com/sustainability";
    private By SustainabilityAreaTitle = By.cssSelector("#sustainability>div>p");
    private By SustainabilityAreaComment = By.cssSelector("#sustainability>div>div>p");
    private By SustainabilityAreaCommentor = By.cssSelector("#sustainability>div>div>p:nth-child(2)");
    private By SustainabilityAreaImage = By.cssSelector("#sustainability");
    private By DescriptionAreaDescription = By.cssSelector("#cardSustainable>p");
    private By DescriptionAreaLeftImage = By.cssSelector("#cardSustainable>div>div:nth-child(1)>img");
    private By SeeDescriptionAreaRightImageImage = By.cssSelector("#cardSustainable>div>div:nth-child(2)>img");
    private By WhatWeDoAreaTitle = By.cssSelector("#animationCard.h-auto>h2");
    private By WhatWeDoAreaSubTitle = By.cssSelector("#animationCard.h-auto>div>p");
    private By WhatWeDoAreaDescription = By.cssSelector("#animationCard.h-auto>div>p:nth-child(2)");
    private By WhatWeDoAreaSlider = By.id("mySwiper");
    private By OurTraumAreaTitle = By.cssSelector("#animationCard>h2.mt-4.mb-4.mx-20");
    private By OurTraumAreaLeftUpImage = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(1) img");
    private By OurTraumAreaLeftUpTitle = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(1) p");
    private By OurTraumAreaLeftUpDescription = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(1) p.font-sans");
    private By OurTraumAreaLeftDownImage = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(1) img");
    private By OurTraumAreaLeftDownTitle = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(1) p");
    private By OurTraumAreaLeftDownDescription = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(1) p.font-sans");
    private By OurTraumAreaCenterUpImage = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(2) img");
    private By OurTraumAreaCenterUpTitle = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(2) p");
    private By OurTraumAreaCenterUpDescription = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(2) p.font-sans");
    private By OurTraumAreaRightUpImageOnSustainabilityPage = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(3) img");
    private By OurTraumAreaRightUpTitle = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(3) p");
    private By OurTraumAreaRightUpDescription = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(3) p.font-sans");
    private By OurTraumAreaRightDownImage = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(2) img");
    private By OurTraumAreaRightDownTitle = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(2) p");
    private By OurTraumAreaRightDownDescription = By.cssSelector("#animationCard>div.flex.flex-row.flex-wrap.w-full>div:nth-child(4)>div:nth-child(2) p.font-sans");
    private By TraumSustainabilityValueAreaTitle = By.cssSelector("div.pt-14.place-content-center.grid.place-items-center>h2.text-white.text-center.capitalize.font-butler.font-bold.text-lg.mb-4.text-lg");
    private By TraumSustainabilityValueAreaDescription = By.cssSelector("div.pt-14.place-content-center.grid.place-items-center>p");
    private By TraumSustainabilityValueAreaImage = By.cssSelector("div.pt-14.place-content-center.grid.place-items-center>div");


    public void userOnTheSustainabilityPage() {
        elementHelper.openUrl(url);
        elementHelper.checkUrl(url);
    }

    public void shouldSeeTheSustainabilityPage() {
        elementHelper.checkUrl("sustainability");
    }

    public String shouldSeeSustainabilityAreaTitle() {
        return elementHelper.getText(SustainabilityAreaTitle);
    }

    public String shouldSeeSustainabilityAreaComment() {
        return elementHelper.getText(SustainabilityAreaComment);
    }

    public String shouldSeeSustainabilityAreaCommentor() {
        return elementHelper.getText(SustainabilityAreaCommentor);
    }

    public void shouldSeeSustainabilityAreaImage() {
        elementHelper.checkElement(SustainabilityAreaImage);
    }

    public String shouldSeeDescriptionAreaDescription() {
        return elementHelper.getText(DescriptionAreaDescription);
    }

    public void shouldSeeDescriptionAreaLeftImage() {
        elementHelper.checkElement(DescriptionAreaLeftImage);
    }

    public void shouldSeeDescriptionAreaRightImageImage() {
        elementHelper.checkElement(SeeDescriptionAreaRightImageImage);
    }

    public String shouldSeeWhatWeDoAreaTitle() {
        return elementHelper.getText(WhatWeDoAreaTitle);
    }

    public String shouldSeeWhatWeDoAreaSubTitle() {
        return elementHelper.getText(WhatWeDoAreaSubTitle);
    }

    public String shouldSeeWhatWeDoAreaDescription() {
        return elementHelper.getText(WhatWeDoAreaDescription);
    }

    public void shouldSeeWhatWeDoAreaSlider() {
        elementHelper.checkElement(WhatWeDoAreaSlider);
    }

    public String shouldSeeOurTraumAreaTitle() {
        return elementHelper.getText(OurTraumAreaTitle);
    }

    public void shouldSeeOurTraumAreaLeftUpImage() {
        elementHelper.checkElement(OurTraumAreaLeftUpImage);
    }

    public String shouldSeeOurTraumAreaLeftUpTitle() {
        return elementHelper.getText(OurTraumAreaLeftUpTitle);
    }

    public String shouldSeeOurTraumAreaLeftUpDescription() {
        return elementHelper.getText(OurTraumAreaLeftUpDescription);
    }

    public void shouldSeeOurTraumAreaLeftDownImage() {
        elementHelper.checkElement(OurTraumAreaLeftDownImage);
    }

    public String shouldSeeOurTraumAreaLeftDownTitle() {
        return elementHelper.getText(OurTraumAreaLeftDownTitle);
    }

    public String shouldSeeOurTraumAreaLeftDownDescription() {
        return elementHelper.getText(OurTraumAreaLeftDownDescription);
    }

    public void shouldSeeOurTraumAreaCenterUpImage() {
        elementHelper.checkElement(OurTraumAreaCenterUpImage);
    }

    public String shouldSeeOurTraumAreaCenterUpTitle() {
        return elementHelper.getText(OurTraumAreaCenterUpTitle);
    }

    public String shouldSeeOurTraumAreaCenterUpDescription() {
        return elementHelper.getText(OurTraumAreaCenterUpDescription);
    }


    public void shouldSeeOurTraumAreaRightUpImageOnSustainabilityPage() {
        elementHelper.checkElement(OurTraumAreaRightUpImageOnSustainabilityPage);
    }

    public String shouldSeeOurTraumAreaRightUpTitle() {
        return elementHelper.getText(OurTraumAreaRightUpTitle);
    }

    public String shouldSeeOurTraumAreaRightUpDescription() {
        return elementHelper.getText(OurTraumAreaRightUpDescription);
    }

    public void shouldSeeOurTraumAreaRightDownImage() {
        elementHelper.checkElement(OurTraumAreaRightDownImage);
    }

    public String shouldSeeOurTraumAreaRightDownTitle() {
        return elementHelper.getText(OurTraumAreaRightDownTitle);
    }

    public String shouldSeeOurTraumAreaRightDownDescription() {
        return elementHelper.getText(OurTraumAreaRightDownDescription);
    }

    public String shouldSeeTraumSustainabilityValueAreaTitle() {
        return elementHelper.getText(TraumSustainabilityValueAreaTitle);
    }

    public String shouldSeeTraumSustainabilityValueAreaDescription() {
        return elementHelper.getText(TraumSustainabilityValueAreaDescription);
    }

    public void shouldSeeTraumSustainabilityValueAreaImage() {
        elementHelper.checkElement(TraumSustainabilityValueAreaImage);
    }


}
